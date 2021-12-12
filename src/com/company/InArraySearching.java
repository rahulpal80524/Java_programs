package com.company;

import java.util.Scanner;

public class InArraySearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many number enter: ");
        int n = sc.nextInt();
        int[] number = new int[n];
        for(int i=0;i<number.length;i++){
             number[i]=sc.nextInt();
        }
        System.out.print("which number your are find:  ");
        int find = sc.nextInt();
        for (int num : number){
            if (find==num){
                System.out.println("number is founded :"+num);
                break;
            }
        }
    }
}
