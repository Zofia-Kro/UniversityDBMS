package com.UniDBMS.Users;
import com.UniDBMS.util.Util;
import com.UniDBMS.util.dbUtil;

/**
 * represents a person in university database
 * contains common attributes for Student and Lecturer
 * like name, last name, email
 */
public class Person {

    protected String name;
    protected String lastName;
    protected String email;

    public Person(){
        this.name="unknown";
        this.lastName="unknown";
        this.email="unknown";
    }
    public Person(String name, String lastName, String email){
        this.name=name;
        this.lastName=lastName;
        Util check=new Util();
        this.email=check.checkEmail(email);
        dbUtil update=new dbUtil();
        update.insertPerson(this.name, this.lastName, this.email);
    }
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setLastName(String lastName){}
    public void setEmail(String email){
        Util check=new Util();
        this.email=check.checkEmail(email);
    }
    public void displayInfo(){
        dbUtil dbUtil=new dbUtil();
        System.out.println("ID: " + dbUtil.getID(name, lastName,email)+ " name: " + name + " last name: " + lastName + " email: " + email);
    }

}

