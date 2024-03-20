package org.example.review2;

public class E2TypeCasting {
    public static void main(String[] args) {
        int number=100000;
        short num=(short)number;
        // above bracket for short is we specify destination-datatype
        // we dont get the same result because we are trying to transfer big info to small box


        System.out.println(num);
    }
}
