package org.example.review3;

import java.util.Scanner;

public class E7Loop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=10;
        while(num>5){
            System.out.println("Please enter a number");
            num= scanner.nextInt();
        }
    }
}
