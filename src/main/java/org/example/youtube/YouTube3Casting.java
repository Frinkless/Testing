package org.example.youtube;

public class YouTube3Casting {
    public static void main(String[] args) {
        // cannot do int i1 = 4.5;
        double i1=4.5;
        int i2=(int)i1;
        System.out.println(i2);
        int i3=(int)8L;
        float f1=(float) 4.5; // data loss happens here because 4.5 will be converted to 4, round down
        System.out.println(i3);
        System.out.println(f1);

        double d1=4.5+3;
        System.out.println(d1);

        int x1= (int)(4.5+3);
        System.out.println(x1);

        double dd=4.2;
        int ii=(int)dd;
        System.out.println(ii);
    }
}
