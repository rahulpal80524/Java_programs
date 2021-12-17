package com.company;
import java.io.*;

public class Demo_programs {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.camelcase(s);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }

    }

class Result {

    /*
     * Complete the 'camelcase' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int camelcase(String s) {
        // Write your code here
       char[] A;
       char[] B;
       int res = 1;
       A=s.toCharArray();
       B= s.toLowerCase().toCharArray();
       for (int i=0;i<s.length();i++){
           if (A[i]!=B[i]){
               res++;
           }
       }

        System.out.println(res);
        
        
    return res;
    }

}