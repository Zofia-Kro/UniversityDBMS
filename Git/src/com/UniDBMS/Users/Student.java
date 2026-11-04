package com.UniDBMS.Users;
import com.UniDBMS.util.Util;
import com.UniDBMS.util.dbUtil;

/**
 * represents a student
 * inherits from person class
 * information such as email, course, year
 */
public class Student extends Person {
    private String course;
    private int year;

    public Student(){
        super();
        course="unknown";
        year=0;
    }

    public Student(String name, String lastName, String email,String course,int year){
        super(name,lastName,email);
        dbUtil dbUtil=new dbUtil();
        this.course=course;
        Util checkYear=new Util();
        this.year=checkYear.checkYear(year);
        dbUtil.insertStudent(name, lastName, email, this.course, this.year);

    }
    public String getCourse(){
        return course;
    }
    public int getYear(){
        return year;
    }
    public void setCourse(String course){
        this.course=course;
    }
    public void setYear(int year){
        Util check=new Util();
        this.year=check.checkYear(year);
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("This student attends course: " + course);
        System.out.println("And is on year: " + year);
    }


}

