package org.example.youtube;

public class YouTube6RelationalOps {
    public static void main(String[] args) {
int x=7;
int y=5;
int a=5;
int b=9;

boolean result = x>y && a>b;
        System.out.println(result);
        boolean result1=x>y && a<b;
        System.out.println(result1);
        // and &&
        // all ||
        boolean result3 = x>y || a>b;
        System.out.println(result3);

        boolean result4=a>b;
        System.out.println(!result4);
        //  This gives opposite result if true then print says false
        //  if false print says true
        //  System.out.println(!result4);
    }
}
