package hackerrank.misc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Minal.Fulzele on 14/08/2018.
 */
public class Summation {
    /*
  * Complete the summingSeries function below.
  */
    static int summingSeries(long n) {
        long divisor = (long) Math.pow(10, 9) + 7;
        long outputStep1 = n % divisor;
        return (int) ((outputStep1 * outputStep1) % divisor);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(scanner.nextLine().trim());
        List<Integer> output = new ArrayList<>(t);
        for (int tItr = 0; tItr < t; tItr++) {
            long n = Long.parseLong(scanner.nextLine().trim());

            int result = summingSeries(n);
            output.add(result);
        }
        output.forEach(val -> System.out.println(val));
    }
}
