/*

Hackerrank Challenge: Mini-Max Sum
URL: https://www.hackerrank.com/challenges/mini-max-sum/problem?h_r=next-challenge&h_v=zen

 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class MiniMaxSumSolution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        BigInteger minSum = BigInteger.valueOf(0);
        BigInteger maxSum = BigInteger.valueOf(0);
        for(int x=0;x<arr.length;x++){
            BigInteger sum = BigInteger.valueOf(0);
            for(int y=0;y<arr.length;y++){
                if(x!=y)
                    sum = sum.add(BigInteger.valueOf(arr[y]));
            }
            if(x==0){
                minSum=sum;
                maxSum=sum;
            }else if (sum.compareTo(minSum)<0)
                minSum=sum;
            else if (sum.compareTo(maxSum)>0)
                maxSum=sum;
        }
        System.out.println(minSum+" "+maxSum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
