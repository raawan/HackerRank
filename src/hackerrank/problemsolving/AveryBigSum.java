package hackerrank.problemsolving;

import java.io.*;
import java.util.*;
public class AveryBigSum {

    static long aVeryBigSum(long[] ar) {

        long sum =0;
       return  Arrays.stream(ar).reduce(sum,(i,j)->i+j);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] ar = new long[arCount];

        String[] arItems = scanner.nextLine().split(" ");

        scanner.close();

        for (int i = 0; i < arCount; i++) {
            long arItem = Long.parseLong(arItems[i]);
            ar[i] = arItem;
        }

        long result = aVeryBigSum(ar);
        System.out.println(result);


    }
}
