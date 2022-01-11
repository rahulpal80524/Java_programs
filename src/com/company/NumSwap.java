package com.company;

public class NumSwap {
    public static void main(String[] args) {
        int x= 10;
        int y=5;
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.printf("After Swap :x= %d,y= %d",x,y);
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.printf("\nAfter Swap :x= %d,y= %d",x,y);
    }
}
