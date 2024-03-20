package org.example.class7;

import java.util.Arrays;

public class E5Arrays {
    public static void main(String[] args) {
       char [] grades=new char[4];
       //Storing the letter A inside the box 0
       grades[0]='A';
       grades[1]='B';
       grades[2]='C';
       grades[3]='D';
       // grades[4]='F';



        System.out.println(grades[3]);
        System.out.println(Arrays.toString(grades));
        System.out.println(grades[1]+" "+grades[3]);
    }
}
