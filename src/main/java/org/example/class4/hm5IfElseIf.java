package org.example.class4;

public class hm5IfElseIf {
    public static void main(String[] args) {
       boolean yesDegree=true;
       double gpa=4.2;
        if(yesDegree){
            System.out.println("Congratulations!");
            if(gpa>3.5){
                System.out.println("You are eligible for scholarship");
            }else{
                System.out.println("You should have studied harder");
            }
        }else{
            System.out.println("You should get a degree");
        }
    }
}
