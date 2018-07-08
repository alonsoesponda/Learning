/*

Hackerrank Challenge: Staircase
URL: https://www.hackerrank.com/challenges/staircase/problem?h_r=next-challenge&h_v=zen

 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StaircaseSolution {

    // Complete the staircase function below.
    static void staircase(int n) {
        for(int x=0; x<n; x++){
            for(int y=1;y<=n;y++){
                if((x+y)>=n){
                    System.out.print("#");
                }else
                    System.out.print(" ");
            }
            if(x<n-1)
                System.out.println();
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
