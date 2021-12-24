package com.practice;

public class Pattern5 {
    public static void main(String[] args) {
        int temp=1;
        for (int i=1;i<=5;i++){
            for (int j=temp;j>=1;j--){
                System.out.print(" "+j);
            }
            System.out.println();
            temp++;
        }
    }
}
