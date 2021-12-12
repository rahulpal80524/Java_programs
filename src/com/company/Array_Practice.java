package com.company;

import java.util.Scanner;

public class Array_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float [] marks = new float[5];
        System.out.print("Enter your are five subjects marks: ");
        for (int i=0;i<5;i++){
            marks[i]=sc.nextFloat();
        }
        float sum=0;
        for(float element :marks){
            sum=sum+element;
        }
        System.out.println(sum);
    }
}
