package com.company;

import java.util.Scanner;

public class SearchingInTwoDArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter rows :");
        int rows=sc.nextInt();
        System.out.print("Enter columns:");
        int columns = sc.nextInt();
        int[][] numbers = new int[rows][columns]; //2D array declaration

        for (int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                numbers[i][j]=sc.nextInt();
            }

        }
        System.out.println("Enter which number you are search in array");
        int num = sc.nextInt();
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                if(numbers[i][j]==num){
                    System.out.println("array location: "+i+j);
                }
            }
        }








    }
}
