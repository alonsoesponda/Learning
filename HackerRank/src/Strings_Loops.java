import java.io.IOException;
import java.util.Scanner;

public class Strings_Loops {

    public static void getEvenChars(String strings){
        //int in = strings.length;
        char[] result = strings.toCharArray();
        for(int x=0;x<result.length;x++){
            System.out.print(result[x]);
            x++;
        }
    }
    public static void getOddChars(String strings){
        //int in = strings.length;
        char[] result = strings.toCharArray();
        for(int x=1;x<result.length;x++){
            System.out.print(result[x]);
            x++;
        }
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int T = scanner.nextInt();
        String[] S = new String[T];
        scanner.nextLine();
        for(int x=0;x<T;x++){
            S[x]=scanner.nextLine();
        }
        for(int x=0;x<S.length;x++){
            getEvenChars(S[x]);
            System.out.print(" ");
            getOddChars(S[x]);
            if(x<(S.length-1)) {
                System.out.println();
            }
        }
        scanner.close();
    }
}
