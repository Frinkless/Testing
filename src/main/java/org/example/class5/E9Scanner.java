package org.example.class5;

import java.util.Scanner;

public class E9Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What city are you in?");
        String city=scan.nextLine();
        System.out.println("What is the weather like in there?");
        double tempFah=scan.nextDouble();
        double tempCel=(tempFah-32)*5/9;
        System.out.println("The temperature in the city "+city+" is "+tempCel+"C");



    }
    }

