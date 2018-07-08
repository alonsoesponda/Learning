/*

Hackerrank Challenge: Plus Minus
URL: https://www.hackerrank.com/challenges/plus-minus/problem

 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinusSolution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double pos =0;
        double neg =0;
        double zer =0;
        double sol =0.0;
        for(int i: arr){
            if(i>0){
                pos = ++pos;
            }else if(i<0){
                neg = neg+1;
            }else
                zer = zer+1;
        }
        sol = pos/arr.length;
        System.out.println(sol);
        sol = neg/arr.length;
        System.out.println(sol);
        sol = zer/arr.length;
        System.out.println(sol);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
