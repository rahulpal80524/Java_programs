package com.company;

public class Varargs {
//    static int Sum(int ...arr){
//        int res=0;
//        for(int a:arr){
//            res +=a;
//        }
//        return res;
//    }

    static int Sum(int x,int ...arr){
        int res=x;
        for(int a:arr){
            res +=a;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(Sum(3));
        System.out.println(Sum(1,2,3,4,5,6));

    }
}
