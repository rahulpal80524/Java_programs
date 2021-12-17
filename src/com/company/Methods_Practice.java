package com.company;

public class Methods_Practice {

    public static void main(String[] args) {
        int a=5;
        int b=7;
       // int c=Logic(a,b); //with the static key words calling
    //    System.out.println(c);
        int a1=7;
        int b1=5;
    //    int c1 = Logic(a1,b1);
    //    System.out.println(c1);
        Methods_Practice obj = new Methods_Practice();//objects created
        int d=obj.Logic(a1,b1);
        System.out.println(d);

    }

      int Logic(int x,int y){
        int z;
        if (x>y) {

            z = x + y;
        }else{
            z=(x+y) *5;
        }

        return z;
    }
}
