package com.practice;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Prime = sc.nextInt();
            for (int j=2;j<=Prime;j++) {
                if (Prime%j==0) {

                }else {
                    System.out.print(" " + Prime);
                    break;
                }

            }

    }
}
