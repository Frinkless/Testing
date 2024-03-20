package org.example.class4;

public class E4NestedIf {
    public static void main(String[] args) {
        // in life one decision is based on the other decision
        // if i buy a car, i will have it in that specific color

        boolean mainDoor=true;
        boolean room1=false;
        boolean room2=false;

        if(mainDoor){
           // we can write this System.out.println("Main door is open");
            if(room1){
                System.out.println("Room 1");
            }else{
                System.out.println("Room 1 is closed");
            }
        }else{
            System.out.println("Main door is closed");
        }

    }
}
