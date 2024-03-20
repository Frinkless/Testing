package org.example.class3;

public class Task1 {
    public static void main(String[] args) {
        double num1=10.5;
        double num2=20.59;
        double result1=(num1+num2);
        double result2=(num1-num2);
        double result3=(num1*num2);
        double result4=(num1/num2);
        System.out.println("The addition of 2 numbers "+num1+" and "+num2+" is equal to "+result1);
        System.out.println("The subtraction of 2 numbers "+num1+" and "+num2+" is equal to "+result2);
        System.out.println("The multiplication of 2 numbers "+num1+" and "+num2+" is equal to "+result3);
        System.out.println("The division of 2 numbers "+num1+" and "+num2+" is equal to "+result4);
        //other way
        System.out.println("The addition of 2 numbers "+num1+" and "+num2+" is equal to "+(num1+num2));
        System.out.println("The subtraction of 2 numbers "+num1+" and "+num2+" is equal to "+(num1-num2));
        System.out.println("The multiplication of 2 numbers "+num1+" and "+num2+" is equal to "+(num1*num2));
        System.out.println("The division of 2 numbers "+num1+" and "+num2+" is equal to "+(num1/num2));

    }}
