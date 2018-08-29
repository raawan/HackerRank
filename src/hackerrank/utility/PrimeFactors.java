package hackerrank.utility;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static void main(String[] args) {
        List<Integer> allPrimes = sieveOfEratosthenes(100000);
       // allPrimes.stream().forEach(val -> System.out.print(val+","));
        System.out.println();
        List<Integer> factors = getFactors(843569, allPrimes);
        factors.stream().forEach(val -> System.out.println(val));
    }

    private static List<Integer> getFactors(int num, List<Integer> allPrimes) {
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
