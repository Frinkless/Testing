package org.example.class9;

public class E6Array {
    public static void main(String[] args) {

        int[] numbers = {10, 25, 45, 66, 85, 100, 26, 89, 56, 33};
        double sum = 0;
        int count = 0;
        for (int n : numbers) {
            if (n > 25) {
                sum += n;
                count++;

            }
        }
        System.out.println(sum / count);
    }
}
