package hackerrank.utility;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    private static List<Integer> allPrimes;

    static {
        long start = System.currentTimeMillis();
        allPrimes = sieveOfEratosthenes(1000000);
        //allPrimes.stream().forEach(val -> System.out.print(val+","));
        long end = System.currentTimeMillis();
        System.out.println();
        System.out.println("TIME FOR SofE:" + (end - start));
    }

    public static void main(String[] args) {
        System.out.println();
        int[] inputs = {6,10,12,20,30,32,33,50,5555,1234,843569};
        for(int input:inputs) {
            System.out.println("Factors for:"+input);
            getFactors(input).stream().forEach(val -> System.out.println(val));
        }
    }

    private static List<Integer> getFactors(int num) {
        List<Integer> result = new ArrayList<>();
        int original = num;
        for (int i = 0; i < allPrimes.size(); i++) {
            int p = allPrimes.get(i);
            System.out.print(p+" ");
            if (p * p > num) {
                long prod =1;
                for(int val: result) {
                    prod*=val;
                }
                if(prod<original) {
                    result.add(num);
                }
                break;
            }
            if (num % p == 0) {
                while (num % p == 0) {
                    num /= p;
                    result.add(p);
                }
            }
        }
        System.out.println();
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
