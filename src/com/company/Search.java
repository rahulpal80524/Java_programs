package com.company;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number enter: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.print("Searching number enter:  ");
        int seach= sc.nextInt();
        for (int i=0;i<size;i++){
            if(numbers[i]==seach){
                System.out.println("index: "+i);
            }
        }


    }
}
