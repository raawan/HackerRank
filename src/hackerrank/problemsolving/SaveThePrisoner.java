package hackerrank.problemsolving;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Minal.Fulzele on 20/08/2018.
 */
public class SaveThePrisoner {

    // Complete the saveThePrisoner function below.
    static int saveThePrisoner(int n, int m, int s) {

        int i = (s + (m % n) - 1) % n;
        return i==0?n:i;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<Integer> resultList = new ArrayList<>();
        for (int tItr = 0; tItr < t; tItr++) {
            String[] nms = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nms[0]);

            int m = Integer.parseInt(nms[1]);

            int s = Integer.parseInt(nms[2]);

            int result = saveThePrisoner(n, m, s);
            resultList.add(result);

        }
        resultList.stream().forEach(val -> System.out.println(val));
        scanner.close();
    }
}
