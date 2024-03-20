package org.example.class7;

import java.util.Arrays;

public class E9ArrayLoop {
    public static void main(String[] args) {
        double[] prices={10.5, 20.5, 25, 30};
        // 0 1 2 3
        for(int i=0; i<4;i++){
            System.out.println(prices[i]);
        }
        System.out.println(prices[3]);
        System.out.println(Arrays.toString(prices));
    }
}
