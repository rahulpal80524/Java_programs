package com.company;

import java.util.Scanner;

public class Calculate {

    public static int Sum(int a,int b){
        int sum=a+b;
        return sum;

    }
    public static  int Mul(int a,int b)
    {  int mul=a*b;
        return mul;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=Sum(a,b);
        System.out.println("Sum of two number is:"+sum);
        System.out.println("Multi of two number is:"+Mul(a,b));

    }
}
