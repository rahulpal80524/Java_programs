package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num =sc.nextInt();
        Series(num);
    }

    private static void Series(int num) {

        int a=0,b=1,c;
        System.out.print(a);
//        System.out.println(b);
        for(int i=1;i<num;i++){
            c=a+b;
            System.out.print(" "+c);
            b=a;
            a=c;

        }
    }


}
