package com.company;

import java.util.Scanner;

public class If_else_if {

    public static void main(String[] args) {
        System.out.println("input two number:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1==num2){
            System.out.println("Is Equal");
        }
        else if(num1>num2){
                System.out.println(num1+" greater than " +num2);
            }
        else{
                System.out.println(num2+" greater than " +num1);
            }
        }
    }

