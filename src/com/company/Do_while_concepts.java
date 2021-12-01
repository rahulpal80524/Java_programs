package com.company;

import java.util.Scanner;

public class Do_while_concepts {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;


        do {

            System.out.print("Enter you marks:");
            int marks = (int) sc.nextFloat();
            if(marks>=90)
                System.out.println("This is Good");
            else if(marks>=60)
                System.out.println("This is also Good");
            else
                System.out.println("This is Good as well");

            System.out.print("Enter 0 or 1 :");
            n = sc.nextInt();

        }while (n==1);
    }
}
