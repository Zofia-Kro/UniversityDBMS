package com.UniDBMS.MainCode;
import com.UniDBMS.Users.*;
/**
 * Main class for the application
 * Used to execute and test methods
 * in other classes
 * @author Zofia-Kro
 */

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        System.out.println("Please input name: ");
        String name=x.nextLine();
        System.out.println("Please input lastName: ");
        String lastName=x.nextLine();
        System.out.println("Please input email: ");
        System.out.println("Please remember email has to end with @university.com");
        String email=x.nextLine();
        Student s1=new Student(name,lastName, email, "Maths", 2);
        x.close();
    }
}


