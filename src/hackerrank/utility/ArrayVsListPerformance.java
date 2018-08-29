package hackerrank.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Minal.Fulzele on 29/08/2018.
 */
public class ArrayVsListPerformance {

    public static void main(String[] args) {
        int size = Integer.MAX_VALUE/2;

        long timeToCreateArray = createArray(size);
        long timeToCreateList = createList(size);
        System.out.println("Time to create array:"+timeToCreateArray);
        System.out.println("Time to create list:"+timeToCreateList);
    }

    private static long createList(int size) {
        long start = System.currentTimeMillis();
        List<Integer> list = new ArrayList<>(size);
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(size));
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long createArray(int size) {
        long start = System.currentTimeMillis();
        int[] array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(size);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
