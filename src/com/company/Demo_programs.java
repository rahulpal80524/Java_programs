package com.company;

import java.util.Scanner;

public class Demo_programs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter any number: ");
        int n = sc.nextInt();
        /*
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }   */

        int i = 0,sum=0;

        while (i<=n){
            if (i%2==0) {
                sum += i;
            }
            i++;

        }
        System.out.println(sum);

        

    }
}
