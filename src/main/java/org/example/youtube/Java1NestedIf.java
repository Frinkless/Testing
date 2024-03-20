package org.example.youtube;

public class Java1NestedIf {
    public static void main(String[] args) {
        int age=26;
        if(age<18){
            System.out.println("You are a teenager, please don't work");
        }else{
            System.out.println("You are older than 18, you can work");
            if(age<64){
                System.out.println("You are eligible to work");
            }else{
                System.out.println("Enjoy your life");
            }
        }
    }
}
