package org.example.class5;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is the amount of loan needed?");
        int loan=scan.nextInt();
        if(loan<=200000){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
