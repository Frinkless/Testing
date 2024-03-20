package org.example.review;

public class E6StringConcat {
    public static void main(String[] args) {
        System.out.println(10+"10"+10);
        System.out.println(10+10+"10");
        System.out.println("10"+10+10);
        // "10" is treated as string
        // as long as one string, + happens concatenation
    }
}
