package com.practice;

public class Pattern9 {
    public static void main(String[] a){
        int temp=4;
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" "+(temp+j));
            }
            System.out.println();
            temp--;
        }
    }
}
