package hackerrank.utility;

import java.util.ArrayList;
import java.util.List;

public class IntArrayPermutations {
    static int i = 0;

    public static void main(String[] args) {
        int[] arr = {2, 2, 3};
        findAllPermutations(arr);
    }

    private static void findAllPermutations(int[] arr) {
        List<Integer> givenArray = new ArrayList<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            givenArray.add(arr[i]);
        }
        int intialCapacity = (int) Math.pow(2, arr.length);
        List<List<Integer>> result = new ArrayList<>(intialCapacity);
        findAllPermutations(new ArrayList<Integer>(), givenArray, result);
        result.stream().forEach(list -> {
            System.out.println();
            System.out.print(++i + "------->");
            list.stream().forEach(val -> System.out.print(val + ","));
        });
    }

    private static void findAllPermutations(ArrayList<Integer> listToStoreApermutation,
                                            List<Integer> givenArr,
                                            List<List<Integer>> allPermutations) {

        int n = givenArr.size();
        if (n == 0) {
            allPermutations.add(listToStoreApermutation);

        } else {
            for (int i = 0; i < n; i++) {
                //Because of this referencing ....you have to create new arrays before every recursive call
                List<Integer> newGivenArray = new ArrayList<>();
                newGivenArray.addAll(givenArr.subList(0, i));
                newGivenArray.addAll(givenArr.subList(i + 1, n));
                ArrayList<Integer> newListToStorePermutation = new ArrayList<>();
                newListToStorePermutation.addAll(listToStoreApermutation);
                newListToStorePermutation.add(givenArr.get(i));
                findAllPermutations(newListToStorePermutation, newGivenArray, allPermutations);
            }
        }

    }
}
