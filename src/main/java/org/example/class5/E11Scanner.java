package org.example.class5;

import java.util.Scanner;

public class E11Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        String haveCreditCard=scanner.next();
        if(haveCreditCard.equalsIgnoreCase("Yes")){
            System.out.println("What is the balance on the card?");
            double balance=scanner.nextDouble();
            if(balance>1000){
                System.out.println("Please pay of asap");
            }else{
                System.out.println("You can spend more");
            }


        }else{
            System.out.println("We can offer you a credit card");
        }

        }

    }


