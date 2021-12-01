package com.company;
import java.util.*;
public class Java_Stdin_and_Stdout {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double d = sc.nextDouble();
        String s = sc.nextLine();
        String S = sc.nextLine();
        System.out.println("String: "+S);
        System.out.println("Double: "+d);
        System.out.println("Int: "+n);
    }
}
