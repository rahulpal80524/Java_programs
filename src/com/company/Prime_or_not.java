package com.company;

import java.util.Scanner;

public class Prime_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        Check(num);
        EvenOdd(num);

    }

    public  static void Check(int num){
        for(int i=2;i<=num;i++) {

            if(num % i == 0) {
                System.out.println("It's not prime number: " + num);
                break;
            }else {
                System.out.println("It's prime number: " + num);
                break;
            }

        }

    }

    public static void EvenOdd(int num){
        if(num%2==0){
            System.out.println("Number is even: "+num);
        }else{
            System.out.println("Number is odd: "+num);
        }
    }


}
