package org.example.youtube;

import java.util.Scanner;

public class Java2Scanner {
    public static void main(String[] args) {
        //● To read strings, we use next()
        //● To read sentences, we use nextLine()
        //● To read integer values, we use nextInt()
        //● To read decimal values, we use nextDouble()
        //● To read a single character, we use next().charAt(0)
        Scanner myScanner=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=myScanner.next();
        System.out.println("Your name is "+name);
    }
}
