package com.UniDBMS.util;
import java.util.*;
import com.UniDBMS.Users.Person;
/**
 * Connection to database methods
 * collect data, check if value exists,
 * returns certain data
 */
import java.sql.*;
public class dbUtil {
    private final String url;
    private final String username;
    private final String password;
    public dbUtil(){
        Scanner x=new Scanner(System.in);
        System.out.println("Please input Database URL:");
        url = x.nextLine();
        System.out.println("Please input Database username:");
        username = x.nextLine();
        System.out.println("Please input Database password:");
        password = x.nextLine();
    }
    public void insertPerson(String name, String lastName, String email) {
        String sql = "INSERT INTO person(name, lastName, email) VALUES (?,?,?)";
        if(exists(name, lastName, email)){
            System.out.println("Person already exists");
            return;
        }
        try (Connection c = DriverManager.getConnection(url, username, password);
             PreparedStatement s = c.prepareStatement(sql)) {
            s.setString(1, name);
            s.setString(2, lastName);
            s.setString(3, email);
            s.executeUpdate();
            System.out.println(" row inserted!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void insertStudent(String name, String lastName, String email, String course, int year) {
        int person_id =getID(name, lastName, email);
        if(person_id==-1){
            insertPerson(name, lastName, email);
            person_id=getID(name,lastName,email);
        }
        if(person_id==-1){
            System.out.println("Cound not find or create a person");
            return;
        }
        if(isStudentExists(person_id)){
            System.out.println("Person already exists");
            return;
        }
        String sql="insert into student(person_id, course, year) values (?,?,?)";
        try(Connection c=DriverManager.getConnection(url,username,password);
            PreparedStatement s=c.prepareStatement(sql)){
            s.setInt(1,person_id);
            s.setString(2, course);
            s.setInt(3, year);
            s.executeUpdate();
            System.out.println("Student inserted!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int getID(String name, String lastName, String email) {
        String sql = "SELECT id FROM person WHERE lastName = ? AND name = ? AND email = ?";

        try (Connection c = DriverManager.getConnection(url, username, password);
             PreparedStatement s = c.prepareStatement(sql)) {

            s.setString(1, lastName);
            s.setString(2, name);
            s.setString(3, email);

            try (ResultSet rs = s.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("id");
                }
                return -1;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean exists(String name, String lastName, String email) {
        String sql = " SELECT 1 FROM person WHERE lastName = ? AND name = ? AND email = ? ";

        try (Connection c = DriverManager.getConnection(url, username, password);
             PreparedStatement s = c.prepareStatement(sql)) {

            s.setString(1, lastName);
            s.setString(2, name);
            s.setString(3, email);

            try (ResultSet rs = s.executeQuery()) {
                return rs.next();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean isStudentExists(int person_id) {
        String sql = "SELECT 1 FROM student WHERE person_id = ?";

        try (Connection c = DriverManager.getConnection(url, username, password);
             PreparedStatement s = c.prepareStatement(sql)) {

            s.setInt(1, person_id);

            try (ResultSet rs = s.executeQuery()) {
                return rs.next();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
