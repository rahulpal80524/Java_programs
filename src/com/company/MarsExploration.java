package com.company;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Results {

    /*
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(String s) {
        char[] A;
        char a='S',b='O';

        int res = 0;
        A=s.toCharArray();
        for (int i=0;i<s.length();i+=3){

            if (A[i]!=a)
                res++;

            if (A[i+1]!=b)
                res++;

            if (A[i+2]!=a)
                res++;
        }

        System.out.println(res);


        return res;
    }

}

public class MarsExploration {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
     //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Results.marsExploration(s);

       // bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

        bufferedReader.close();
      //  bufferedWriter.close();
    }
}

