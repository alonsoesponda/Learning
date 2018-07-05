import java.io.*;
import java.util.*;

import static java.lang.Math.abs;

public class DiagonalDifferenceSolution {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
        int result = 0;
        int a = 0;
        int b = 0;
        for(int x=0;x<arr.length;x++){
            //number of rows
            for(int y=0;y<arr[0].length;y++) {
                //number of columns
                if (x-y == 0 && x+y == arr.length - 1) {
                    a = a + arr[x][y];
                    b = b + arr[x][y];
                }else if(x-y == 0){
                    a = a + arr[x][y];
                }else if(x+y == arr.length-1){
                    b = b+arr[x][y];
                }
            }
        }
        result = a - b;
        System.out.println(abs(result));
        return abs(result);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
