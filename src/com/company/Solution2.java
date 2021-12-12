package com.company;
import java.util.*;
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


        for(int i=0;i<=N;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            for (int j=1;j<n;j++){
                for (int k=1;k<=j;k++){
                    int res = 0;
                    for (int l=0;l<k;l++) {
                        res = (int) (Math.pow(2, l) * b);
                        res+=res;
                        System.out.print((a+res)+" ");
                    }

                }

            }


        }
    }
}
