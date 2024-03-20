package org.example.class9;

public class E7Array {
    public static void main(String[] args) {

        int[] numbers = {10, 25, 45, 66, 85, 100, 26, 89, 56, 33};
        // iter shortcut enhanced for loop
        //fori shortcut for loop
        //live templates on setting for the shortcuts



        int count = 0;
        for (int n : numbers) {
            if (n % 2 == 0) {
                count++;

            }
        }
        System.out.println(count);
    }
}
