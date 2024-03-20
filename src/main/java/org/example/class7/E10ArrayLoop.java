package org.example.class7;

import java.util.Arrays;

public class E10ArrayLoop {
    public static void main(String[] args) {
        String []  names={"Lana", "Mat Lana", "Maggy", "Noodles", "James"};
        System.out.println(Arrays.toString(names));
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        for(int i=0; i<=4; i++){
            System.out.println(names[i]);
        }
    }
}
