package org.example.class9;

public class E4Array2 {
    public static void main(String[] args) {

        int [] numbers={10, 25, 45, 66, 85, 100};
        double sum=0;
        for(int n: numbers){
            sum+=n;

        }System.out.println(sum/numbers.length);
    }
}
