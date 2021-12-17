package com.company;

public class TablesWithMethods {
    public static void main(String[] args) {
      Tables(3);
    }

    static void Tables(int n){
        for (int i=0;i<=10;i++){
            System.out.format("%d X %d = %d\n",n,i,n*i);
        }
    }
}
