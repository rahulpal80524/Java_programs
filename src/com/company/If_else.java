package com.company;
import  java.util.*;
import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>18){
            System.out.println("is now 18+");
        }else{
            System.out.println("is not Adult");
        }

    }
}

