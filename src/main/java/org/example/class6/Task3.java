package org.example.class6;

import java.lang.management.OperatingSystemMXBean;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        double num1=scanner.nextDouble();
        System.out.println("Please enter another number");
        double num2=scanner.nextDouble();
        System.out.println("Please enter operator sign +,-,*,/");
        char operator=scanner.next().charAt(0);
       switch (operator){
           case '+':
               System.out.println(num1 + num2);
               break;
           case '-':
               System.out.println(num1 - num2);
               break;
           case '*':
               System.out.println(num1 * num2);
               break;
           case '/':
               System.out.println(num1 / num2);
               break;
           default:
               System.out.println("Invalid operation");


    }}}
