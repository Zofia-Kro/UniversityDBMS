package com.UniDBMS.util;
/**
 * Checks if input is correct
 * prompts to correct input
 * @author Zofia-Kro
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {
    public String checkEmail(String email){
        Scanner x=new Scanner(System.in);
        boolean hadError=false;
        while(!email.matches("[a-zA-Z0-9.!#$£%&'*+/=?^_`{|}~;:-]+@university\\.com")) {
            System.out.println("Please enter a valid email address");
            hadError=true;
            try{
                email=x.nextLine();
            }
            catch(InputMismatchException e){
                System.out.println("Invalid email address");
                x.next();
                email="";
            }
        }
        if(hadError){
            System.out.println("Thank you");
        }
        x.close();
        return email; //returns proper email address
    }
    public int checkYear(int year){
        Scanner x=new Scanner(System.in);
        boolean hadError=false;
        while(year<1 || year>4){
            System.out.println("The number must be between 1-4");
            hadError=true;
            System.out.println("Please enter a number again");
            try{
                year=x.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Please input an integer value");
                x.next();
                year=0;
            }
        }
        if(hadError){
            System.out.println("Thank you");
        }
        x.close();
        return year;
    }
}
