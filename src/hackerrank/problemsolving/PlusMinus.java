package hackerrank.problemsolving;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

        int plus =0;
        int minus =0;
        int zero =0;
        for (int val:arr) {
            if(val>0) plus++;
                else if (val<0) minus++;
                    else zero++;
        }
        BigDecimal divisor = new BigDecimal(arr.length);
        System.out.println(new BigDecimal(plus).divide(divisor,6, RoundingMode.HALF_UP));
        System.out.println(new BigDecimal(minus).divide(divisor,6, RoundingMode.HALF_UP));
        System.out.println(new BigDecimal(zero).divide(divisor,6, RoundingMode.HALF_UP));
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
