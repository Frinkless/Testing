package org.example.review2;

import java.util.Scanner;

public class E5IfStatements {
    public static void main(String[] args) {


    /* write a program that checks the account balance if its more than 50k it prints
    rich
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your balance?");
        double balance = scanner.nextDouble();
        if (balance > 50000) {
            System.out.println("Rich");
        }
    }
}
