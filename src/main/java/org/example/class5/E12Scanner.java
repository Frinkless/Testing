package org.example.class5;

import java.util.Scanner;

public class E12Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of worked years");
        double years= scanner.nextDouble();
        if (years>=5){
            System.out.println("Enter your annual salary");
            double salary= scanner.nextDouble();
            if(salary>50000){
                System.out.println("your bonus is 5000");
            }else{
                System.out.println("Your bonus is 3000");
        }}
        else{
            System.out.println("You are not eligible to get a bonus");
        }

        }

    }


