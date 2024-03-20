package org.example.class9;

public class E4Array {
    public static void main(String[] args) {

        int [] numbers={10, 25, 45, 66, 85, 100};
        int sum=0;
        for(int num: numbers){
            sum+=num;

        }System.out.println(sum/numbers.length);
    }
}
