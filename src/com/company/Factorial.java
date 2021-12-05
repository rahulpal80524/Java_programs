package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which no. factorical find:");
        int num = sc.nextInt();
        factorial(num);

    }

    public static void factorial(int num){
        int fac=1;
        if (num<0){
            System.out.println("Invalid number");
            return;
        }
        for(int i=num;i>=1;i--){
            fac=fac*i;
        }
        System.out.println(fac);
        return ;
    }
}
