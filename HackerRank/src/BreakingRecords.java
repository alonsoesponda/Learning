/*

Hackerrank Challenge: Breaking the Records
URL: https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BreakingRecords {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        int max = scores[0];
        int min = scores[0];
        int best=0;
        int worst=0;


        for(int x=1;x<scores.length;x++){
            if (scores[x]>max){
                max=scores[x];
                best=best+1;
            }else if(scores[x]<min){
                min=scores[x];
                worst=worst+1;
            }
        }
        int[] streak = {best,worst};
        System.out.println(streak[0]+" "+streak[1]);
        return streak;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
