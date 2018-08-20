package hackerrank.problemsolving;

import java.io.IOException;
import java.util.Scanner;

public class DiagonalDifference {
    static int diagonalDifference(int[][] arr) {

        int length = arr.length;
        int sum1=0,sum2=0;
        for (int i=0;i<length;i++) {
            sum1+=arr[i][(length-1)-(length-1-i)];
            sum2+=arr[i][(length-1-i)];
        }
        return Math.abs(sum1-sum2);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

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

        System.out.println(result);

        scanner.close();
    }
}
