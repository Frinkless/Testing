package org.example.class4;

public class hm4IfElseIf {
    public static void main(String[] args) {
        double morgageRate=4;
        double mortgagePrice=120000;
        if(morgageRate>4.5){
            System.out.println("Not buy the house");
        }else{
            System.out.println("Buy the house");
            if (morgageRate>100000){
                System.out.println("Take a loan");
            }else {
                System.out.println("Pay cash");
            }
        }
    }
}
