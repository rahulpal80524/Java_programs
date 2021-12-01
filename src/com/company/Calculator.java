package com.company;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("");
        System.out.println("Input two number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("1.Addition\n2.Subraction\n3.Multiplication\n4.Division\n5.Modulo or remainder");
        int num = sc.nextInt();
        switch (num){
            case 1: System.out.println(a+b);
                break;
            case 2: System.out.println(a-b);
                break;
            case 3: System.out.println(a*b);
                break;
            case 4: System.out.println(a/b);
                break;
            case 5: System.out.println(a%b);
                break;
            default: System.out.println("choice 1 to 5 any number");

        }
    }
}
