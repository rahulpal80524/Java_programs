package com.company;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class NumToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int min = -100;
        int max = 100;
        if(num>min && num<max){
            String.valueOf(num);
            
        }
    }
}
