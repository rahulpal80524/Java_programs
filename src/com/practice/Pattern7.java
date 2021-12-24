package com.practice;

public class Pattern7 {
    public static void main(String[] args) {

        for (int i=5;i>=1;i--){
            int p=5;
            for (int j=1;j<=i;j++){
                System.out.print(" "+p);
                p--;
            }
            System.out.println();

        }
    }
}
