package com.company;

import java.util.Scanner;

public class Calculate_per {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your five Subjects marks one by one: ");
        float sub1 = sc.nextFloat();
        float sub2 = sc.nextFloat();
        float sub3 = sc.nextFloat();
        float sub4 = sc.nextFloat();
        float sub5 = sc.nextFloat();
        System.out.println("Enter total outof: ");
        float outof = sc.nextFloat();
        float per = ((sub1 + sub2 + sub3  + sub4 + sub5 )/outof)*100;

        System.out.println("percentage is : "+per);


    }
}
