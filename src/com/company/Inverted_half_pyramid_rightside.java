package com.company;

import java.util.Scanner;

public class Inverted_half_pyramid_rightside {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
       // outer loop
        for(int i=1;i<=n;i++)
         {
//             inner loop -> space print
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
//            inter loop star print
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
