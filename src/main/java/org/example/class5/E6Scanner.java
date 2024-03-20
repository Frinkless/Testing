package org.example.class5;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=scanner.nextInt();
        System.out.println("Please Enter your full name");
        /* extra call to nextLine to clear the buffer memory
        */
        scanner.nextLine();
        String fullName=scanner.nextLine();
        System.out.println("You name is "+fullName+", you are "+age+" years old");
    }
}
