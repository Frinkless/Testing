package org.example.review3;

public class E5Logical {
    public static void main(String[] args) {
        /*

        if someone is less than 10 years old or someone is older than 50 give 20% discount.

         */
        int age=10;
        if(age<10 || age>50){
            System.out.println("You will get 20% discount");
        }else{
            System.out.println("No discount");
        }
    }
}
