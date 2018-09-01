package hackerrank.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class IntArrayPermutations {
    static int i = 0;

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        findAllPermutations(arr);
    }

    private static void findAllPermutations(int[] arr) {
        List<Integer> givenArray = new ArrayList<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            givenArray.add(arr[i]);
        }
        Set<String> result = new TreeSet<>();
        findAllPermutations("", givenArray, result);
        result.stream().forEach(val -> {
            System.out.println(++i + "------->" + val);
        });
    }

    private static void findAllPermutations(String prefix,
                                            List<Integer> givenArr,
                                            Set<String> allPermutations) {

        int n = givenArr.size();
        if (n == 0) {
            allPermutations.add(prefix.substring(0, prefix.length() - 1));

        } else {
            for (int i = 0; i < n; i++) {
                //Because of this referencing ....you have to create new arrays before every recursive call
                List<Integer> newGivenArray = new ArrayList<>();
                newGivenArray.addAll(givenArr.subList(0, i));
                newGivenArray.addAll(givenArr.subList(i + 1, n));
                findAllPermutations(prefix + givenArr.get(i) + ",", newGivenArray, allPermutations);
            }
        }
    }
}
