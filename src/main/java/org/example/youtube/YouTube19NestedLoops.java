package org.example.youtube;

import java.util.Scanner;

public class YouTube19NestedLoops {
    public static void main(String[] args) {
        // nested loops = a loop inside of a loop
        Scanner scanner= new Scanner(System.in);
        int rows;
        int columns;
        String sign="";

        System.out.println("Enter # of rows: ");
        rows=scanner.nextInt();
        System.out.println("Enter # of columns: ");
        columns=scanner.nextInt();
        System.out.println("Enter symbol to use: ");
        sign=scanner.next();

        for(int i=1; i<=rows; i++){
            System.out.println();
            for(int j=1; j<=columns; j++){
                System.out.println(sign);



    }
}






    }
}
