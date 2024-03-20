package org.example.class3;

public class E8Type {
    public static void main(String[] args) {
        double num=10.5;
        int number=(int)num;
        System.out.println(number);
        //narrowing/manual/explicit is happening here because double is bigger than int
        //int number=(int)num; on the second part (int)num is typecasting because int is smaller than double
    }
}
