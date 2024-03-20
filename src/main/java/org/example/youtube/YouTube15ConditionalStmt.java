package org.example.youtube;

import java.util.Scanner;

public class YouTube15ConditionalStmt {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner s=new Scanner(System.in);
        if((s.nextInt()%2)==0)
            System.out.println("Even");
        else
            System.out.println("Odd");



    }
}
