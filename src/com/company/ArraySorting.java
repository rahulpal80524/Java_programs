package com.company;
import java.util.*;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
// input values
        for(int i=0;i< numbers.length;i++){
            numbers[i]=sc.nextInt();
        }

        int  sorted=numbers[0];
        for (int i=0;i<numbers.length;i++){

            if (numbers[i]>=sorted){
                sorted=numbers[i];
            }else{
                System.out.println("array not sorted in ascending order");
                break;
            }
        }

    }
}
