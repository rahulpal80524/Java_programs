package com.practice;

public class Pattern11 {
    public static void main(String[] args){
        int temp=2,temp1;
        for (int i=1;i<=5;i++){
            temp1=temp;
            for (int j=1;j<=5;j++){
                System.out.print(" "+temp1);
                temp1++;
            }
            System.out.println();
            temp++;
        }
    }
}
