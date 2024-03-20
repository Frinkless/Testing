package org.example.class6;

import java.util.Scanner;

public class Task1Switch {
    public static void main(String[] args) {
        /*
Ask user to enter their country and capture it.
Once values are captured print which language user speaks.
Just do this for any 5 countries

 */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your country: ");
        String country=scanner.nextLine();
        switch (country){
            case "USA":
                System.out.println("we speak English");
                break;
            case "Spain":
                System.out.println("we speak Spanish");
                break;
            case "Russia":
                System.out.println("we speak Russian");
                break;
            case "Egypt":
                System.out.println("we speak Arabic");
                break;
            case "Uzbekistan":
                System.out.println("we speak Uzbek");
                break;
            default:
                System.out.println("Country not supported");
        }


    }
}
