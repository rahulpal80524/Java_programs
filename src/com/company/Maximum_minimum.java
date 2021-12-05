package com.company;

import java.util.Scanner;

public class Maximum_minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
// input values
        for(int i=0;i< numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
//        finding maximum value
        int maxi=Integer.MAX_VALUE; //maxi=0 or Integer.MAX_VALUE => By default integer maximum value provide
        for(int i=0;i<numbers.length;i++){

            if(numbers[i]>maxi){
                maxi=numbers[i];
            }

        }
//        print mix value
        System.out.println("Maximum value of "+maxi);

//        finding minimum value
        int mini=Integer.MIN_VALUE; //mini=0 or Integer.MIN_VALUE => By default integer minimum value provide
        for (int number : numbers) {

            if (number < mini) {
                mini = number;
            }

        }
        System.out.println("Minimum value of "+mini);

    }

}
