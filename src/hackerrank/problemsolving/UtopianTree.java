package hackerrank.problemsolving;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UtopianTree {

    static int utopianTree(int n) {
        return (int)(Math.pow(2,(n/2+1))-1) * (int)(Math.pow(2,(n%2)));


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<Integer> finalresult = new ArrayList<>();
        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = utopianTree(n);
            finalresult.add(result);
        }
        finalresult.stream().forEach(val -> System.out.println(val));

        scanner.close();
    }
}
