package com.company;

import java.util.Scanner;

public class Check_even_odd {
    public static void main(String[] args) {
        System.out.print("Enter any number to check even or odd :");
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();
        if(number%2==0){
            System.out.println("number is even: "+number);
        }else{

            System.out.println("number is odd: "+number);
        }

    }
}
