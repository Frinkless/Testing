package org.example.class8;

public class E3_2DArrays {
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
        System.out.println(matrix[1][2]);
        // usecase of 2D array, pixels on the computer screen.
        System.out.println(matrix[2][3]);

    }
}
