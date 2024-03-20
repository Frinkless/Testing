package org.example.class7;

import java.util.Arrays;

public class E15Loop {
    public static void main(String[] args) {
        int [] num={10, 20, 30, 80, 40, 50};
       int max=num[0];
       for(int n:num){
           if(max<n){
               max=n;
           }
       }
        System.out.println(max);



    }
}
