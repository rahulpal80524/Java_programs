package com.company;

import java.util.Scanner;

public class Bits {
    public static void main(String[] args) {
//        int n =5;//0101
//        int pos =3;
//        int bitmask = 1<<pos;
//        if((bitmask & n)==0){
//            System.out.println("bit was  zero");
//        }else
//            System.out.println("bit was one");

      /*  int n =5;//0101
        int pos =1;
        int bitmask = 1<<pos;

        int newNumber = bitmask | n;
        System.out.println(newNumber);
*/
       /* int n = 5;
        int pos = 2;
        int bitmask =1<<pos;
        int notBitMask = ~(bitmask);

        int newnumber = notBitMask & n;
        System.out.println(newnumber);

        */
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        //oper=1 : set    oper=0 : clear
        int n = 5;//0101 ->0111 -> decimal in 7
        int pos = 1;
        int bitMask = 1<<pos;
        //set oper
        if (oper == 1){

            int newNumber = bitMask | n;
            System.out.println(newNumber);

        }else {
            //clear
           int  newBitMask = ~(bitMask);
           int  newNumber  = newBitMask & n;
            System.out.println(newNumber);
        }





    }



}
