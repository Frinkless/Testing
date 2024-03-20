
package org.example.class3;

public class E17IfElse {
    public static void main(String[] args) {
        boolean isRaining=true;
        if(true){
            System.out.println("Take the umbrella");
            System.out.println("Lets take the jacket as well");
        }
        // above curly bracket is conditional line
        // below print will be executed because it is not in the curly braket and does not depend on curly bracket or
        // if statement
        System.out.println("Lets go shopping");

        boolean isNotRaining=false;
        if(false){
            System.out.println("Do not take the umbrella");}
}}
