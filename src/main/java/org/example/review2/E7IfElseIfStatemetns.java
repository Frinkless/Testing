package org.example.review2;

public class E7IfElseIfStatemetns {
    public static void main(String[] args) {

        /* simple if condition results one action
        if and else is two result condition
        if a true print smth
        if a not ture print smth else
        more than two actions will be performed that's
        when we will use else if or if else conditions
         */
        String day="Monday";
        if(day.equals("Monday")){
            System.out.println("Work");
        }else if(day.equals("Tuesday")){
            System.out.println("Work");
        }else if(day.equals("Wednesday")){
            System.out.println("Leave");
        }else if(day.equals("Thursday")){
            System.out.println("Work");
        }else if(day.equals("Friday")){
            System.out.println("Movie");
        }else if(day.equals("Saturday")){
            System.out.println("Relax");
        }else if(day.equals("Sunday")){
            System.out.println("Relax");
        }else{
            System.out.println("Wrong day");
        }

    }
}
