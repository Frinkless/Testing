package org.example.review2;

public class E8IfElseIfStatements {
    public static void main(String[] args) {
        String day="Monday";
        if(day.equals("Monday")){
            System.out.println("Work");
        } if(day.equals("Tuesday")){
            System.out.println("Work");
        } if(day.equals("Wednesday")){
            System.out.println("Leave");
        } if(day.equals("Thursday")){
            System.out.println("Work");
        } if(day.equals("Friday")){
            System.out.println("Movie");
        } if(day.equals("Saturday")){
            System.out.println("Relax");
        } if(day.equals("Sunday")){
            System.out.println("Relax");
        }
        /* above we used 7 independent if conditions
        performance wise this is a terrible code
        when we debug, we will see every steps will be checked
        program will be slow if everywhere is if statement
         */
    }
}
