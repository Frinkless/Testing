package org.example.class3;

public class ifElseifStatement {
    public static void main(String[] args) {
        int day=0;
        if(day==1){
            System.out.println("Monday");
        }if(day==2){
            System.out.println("Tuesday");
        }if(day==3){
            System.out.println("Wednesday");
        }if(day==4){
            System.out.println("Thursday");
        }if(day==5){
            System.out.println("Friday");
        }if(day==6){
            System.out.println("Saturday");
        }if(day==7){
            System.out.println("Sunday");
        }
        else if(day>7){
            System.out.println("Invalid day. Please enter a value between 1 and 7.");
        }
        else if(day<1){
            System.out.println("Invalid day. Please enter a value between 1 and 7.");
        }
    }
}
