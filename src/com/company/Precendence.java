package com.company;

import java.util.Scanner;

public class Precendence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and y value");
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        float re = (x-y)/2;
        System.out.println(re);

        System.out.print("Enter value of b ,a ,c :");
        float b = sc.nextFloat();
        float a = sc.nextFloat();
        float c = sc.nextFloat();
        float result = ((b*b)-4*a*c)/2*a;
        System.out.println(result);
        



    }
}
