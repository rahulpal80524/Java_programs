package com.company;

import java.util.Random;
import java.util.Scanner;
public class Rock_Paper_Scissors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int WinUSer =0;
        int WinComputer = 0;
       for(int i=0;i<5;i++){
           System.out.println("1.Rock\n2.Peper\n3.Scissors");
           System.out.print("Enter any one number: ");
           int user =sc.nextInt();
           Random ran = new Random();
           int nxt = ran.nextInt(1,4);

           if(user==nxt)
               System.out.println("Match Draw Please try again");

           else if(user==1 && nxt==3 ||user==2 && nxt==1 ||user==3 && nxt==2) {
               System.out.println("User is Win");
               WinUSer+=1;
           }

           else if(user==1 && nxt==2 || user==2 && nxt==3 || user==3 && nxt==1) {
               System.out.println("Computer is Win");
               WinComputer+=1;
           }

       }
       if (WinUSer>WinComputer){
           System.out.println("----- Finally User Win By: "+WinUSer+" -----");
       }else if(WinComputer==WinUSer){
           System.out.println("----- Final match Draw -----");
       }else if(WinComputer>WinUSer){
           System.out.println("----- Finally Computer Win By: "+WinComputer+" -----");
       }


    }


}
