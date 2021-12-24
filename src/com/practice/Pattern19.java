package com.practice;

public class Pattern19 {
    public static void main(String[] args) {
        int temp=2;
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){

                for (int k=2;k<temp;k++) {
                    if (temp % k == 0) {
                        System.out.print(temp);
                    }
                }
                temp++;

            }
        }
    }
}
