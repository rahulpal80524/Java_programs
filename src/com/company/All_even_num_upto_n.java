package com.company;

import java.util.Scanner;

public class All_even_num_upto_n {
    public static void main(String[] args) {
        System.out.print("Print all even numbers till n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
