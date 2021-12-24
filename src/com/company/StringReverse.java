package com.company;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        char ch;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your String :");
        String str=sc.nextLine(),Rstr="";
        for (int i=0;i<str.length();i++){
            ch = str.charAt(i);
            Rstr=ch+Rstr;
        }
        System.out.println("Reversed String :"+Rstr);

    }
}
