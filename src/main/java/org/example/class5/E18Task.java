package org.example.class5;

import javax.management.JMRuntimeException;
import javax.swing.*;
import java.util.Scanner;

public class E18Task {
    /*
    Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring”
if user is born in June, July, August →
season =”Summer”  etc …
At the end of the program we should see 1 output as “You were born is season ______”.
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your birth month:");
        String month=scanner.next();
        if(month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")){
            System.out.println("You were born is season Summer");
        }else if(month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")){
            System.out.println("You were born is season Fall");
        }else if(month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")){
            System.out.println("You were born is season Winter");
        }else if(month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")){
            System.out.println("You were born is season Spring");
        }



    }}

