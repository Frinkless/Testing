package org.example.class3;

public class E11RelationalOperators {
    public static void main(String[] args) {
        boolean isTrue=true;
        boolean isFalse=false;
        System.out.println(isFalse==isTrue);
        char letter1='A';
        char letter2='b';
        System.out.println(letter2==letter1);
        // above is directly printing the result
        // below is store the result in boolean and print the result
        boolean result=letter1==letter2;
        System.out.println(result);

    }
}
