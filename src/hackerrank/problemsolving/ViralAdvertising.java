package hackerrank.problemsolving;
import java.io.*;
import java.util.*;
/**
 * Created by Minal.Fulzele on 18/08/2018.
 */
public class ViralAdvertising {

    static int viralAdvertising(int n) {

        int sum =0;
        int people = 5;
        for (int i=0;i<n;i++) {
            people = people/2;
            sum +=people;
            people*=3;
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = viralAdvertising(n);

        System.out.println(result);
        scanner.close();
    }
}
