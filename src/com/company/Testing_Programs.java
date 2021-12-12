package com.company;
import java.util.*;
public class Testing_Programs {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        int num1 = sc.nextInt();
        String str2 = sc.next();
        int num2 = sc.nextInt();
        String str3 = sc.next();
        int num3 = sc.nextInt();
        System.out.printf("%-14s %03d\n",str1,num1);
        System.out.printf("%-14s %03d\n",str2,num2);
        System.out.printf("%-14s %03d\n",str3,num3);

    }

}
