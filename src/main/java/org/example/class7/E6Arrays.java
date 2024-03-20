package org.example.class7;

import java.util.Arrays;

public class E6Arrays {
    public static void main(String[] args) {
        //Create an array of names and store all names of your group. Then print your name from that array.
        // (use 2 different ways of creating an array).
        String [] names=new String[5];
        names[0]="Bohodyr";
        names[1]="Shahlo";
        names[2]="Mohammad Yusuf";
        names[3]="Iyman";
        System.out.println(names[3]);
        System.out.println(Arrays.toString(names));
    }
}
