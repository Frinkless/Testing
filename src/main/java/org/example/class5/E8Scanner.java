package org.example.class5;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        System.out.println("What is your age?");
        int age=scan.nextInt();
        if(age>=18){
            System.out.println("Issue driver license");
        }else{
            System.out.println("For now you can get learners permit");
        }
    }
}
