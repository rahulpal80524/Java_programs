package com.practice;

public class Pattern3 {
    public static void main(String[] args) {
        int temp=1;
        for (int i = 5; i >= 1; i--) {
            for (int j = temp; j <=5; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
            temp++;
        }
    }
}
