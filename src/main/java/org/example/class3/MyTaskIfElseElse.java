package org.example.class3;

import java.util.Scanner;

public class MyTaskIfElseElse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter age: ");
        int age=scanner.nextInt(32);
        int ticketPrice;

        if(age>=12) {
            ticketPrice = 10;
        } else if(age >= 65){
                ticketPrice=14;
        }
        else {
            ticketPrice = 16;}
        System.out.println("Ticket price: $"+ticketPrice);

    }
}
