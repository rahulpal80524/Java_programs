package com.company;

import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

        for (int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();

        }
    }
}
