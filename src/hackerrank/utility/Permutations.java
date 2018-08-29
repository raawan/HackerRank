package hackerrank.utility;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Permutations {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        StringBuffer strBuf = new StringBuffer();
        Arrays.stream(arr).forEach(val -> strBuf.append(val));

        Set<String> result = new TreeSet<>();
        findAllPermutations("", strBuf.toString(), result);
        result.stream().forEach(val -> System.out.println(val));
    }

    private static void findAllPermutations(String prefix, String given, Set<String> result) {
        int n = given.length();
        if (n == 0) result.add(prefix);
        else {
            for (int i = 0; i < n; i++)
                findAllPermutations(prefix + given.charAt(i),
                        given.substring(0, i) + given.substring(i + 1, n), result);
        }
    }
}
