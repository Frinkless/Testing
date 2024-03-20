package org.example.class5;

import java.util.Scanner;

public class E17Task {
    public static void main(String[] args) {
        /*
        Write a program that will ask user to input the current time (use 24 hour format).
Based on the given time define:
if hour is between 1-11 --> Morning
if hour between 12-15 --> Afternoon
if hour between 16-20 --> Evening
if hour between 21-24 --> Night
If anything else print invalid
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input the current time (use 24hour format)");
        double hour=scanner.nextDouble();
        if(hour>=1 && hour<=11){
            System.out.println("morning");
        }else if(hour>=12 && hour<=15){
            System.out.println("afternoon");
        }else if(hour>=16 && hour<=20){
            System.out.println("evening");
        }else if(hour>=21 && hour<=24){
            System.out.println("night");
        } else{
            System.out.println("invalid input");
        }

    }
}
