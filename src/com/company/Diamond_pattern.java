package com.company;

public class Diamond_pattern {
    public static void main(String[] args) {
        int n = 4;
        for(int i=1;i<=n;i++){
//            spaces print
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1;j++){
                    System.out.print("*");

            }
            System.out.println();
        }

//        lower half
        for(int i=n;i>=1;i--){
//            spaces print
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
