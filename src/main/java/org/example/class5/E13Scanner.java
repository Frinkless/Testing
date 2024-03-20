package org.example.class5;

import java.util.Scanner;

public class E13Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your heights in inches:");
        double heights=scanner.nextDouble();
        if(heights<60){
            System.out.println("short");}
        else if(60<heights && heights<72){
            System.out.println("medium");
        }else if(heights>72){
            System.out.println("tall");
        }
    }

    }


