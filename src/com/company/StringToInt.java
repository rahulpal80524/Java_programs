package com.company;
import java.util.*;
public class StringToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>=-100 ||n<=100) {
            String s= String.valueOf(n);
            String check1=s.getClass().getSimpleName();
          //  System.out.println(s.getClass().getSimpleName());
         //   System.out.println(check);
            if (check1.contains("String")){
                System.out.println("Good job");
            }else {
                System.out.println("Wrong answer");
            }
        }

    }
}
