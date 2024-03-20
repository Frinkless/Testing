package org.example.class8;

public class E7_2DArrays {
    public static void main(String[] args) {
        /*
        10 20 40 50
        22 40 90 65
        15 50 33 30
         */
        int [][] matrix= {
            {10,20,40,50},
            {22,40,90,65},
            {15,50,33,30}
        };
        int [] arr={10,20,40,50};
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
