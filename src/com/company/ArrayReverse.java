package com.company;

public class ArrayReverse {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int l = arr.length;
       int n=Math.floorDiv(arr.length, 2);//gretest integer 3.4 -> 3
       for (int i=0;i<n;i++ ){
           //swap
           int temp=0;
           temp=arr[i];
           arr[i]=arr[l-1-i];
           arr[l-1-i]=temp;

       }
       for (int element:arr){
           System.out.print(element+" ");
       }

    }
}
