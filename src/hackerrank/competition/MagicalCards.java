package hackerrank.competition;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagicalCards {

    private static List<Integer> allPrimes;
    static {
        allPrimes  = sieveOfEratosthenes(100000);
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int testCases = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        List<Integer> inputs = new ArrayList<>();

        for (int tItr = 0; tItr < testCases; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            inputs.add(n);
        }

      //  inputs.stream().map(input -> getFactors(input)).map(list ->  )
    }

    private static List<Integer> getFactors(int num) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < allPrimes.size(); i++) {
            int p = allPrimes.get(i);
            if (p  == num) {
                result.add(p);
                break;
            }
            if(p>num) {
                break;
            }

            if (num % p == 0) {
                while (num % p == 0) {
                    num /= p;
                    result.add(p);
                }
            }
        }
        return result;
    }

    private static List<Integer> sieveOfEratosthenes(int num) {
        boolean prime[] = new boolean[num + 1];
        for (int i = 0; i < num; i++)
            prime[i] = true;

        for (int p = 2; p * p <= num; p++) {
            // If prime[p] is not changed, then it is a prime
            if (prime[p] == true) {
                // Update all multiples of p
                for (int i = p * 2; i <= num; i += p)
                    prime[i] = false;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            if (prime[i] == true)
                result.add(i);
        }
        return result;
    }
}
