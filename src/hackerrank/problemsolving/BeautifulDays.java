package hackerrank.problemsolving;
import java.io.*;
import java.util.*;
import java.util.stream.Stream;

/**
 * Created by Minal.Fulzele on 18/08/2018.
 */
public class BeautifulDays {
    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {

        return (int)Stream.iterate(i,n->n+1)
                .limit(j-i+1)
                .filter( val -> (val - Integer.parseInt(new StringBuffer(Integer.toString(val)).reverse().toString()))%k == 0)
                .count();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        System.out.println(result);


        scanner.close();
    }

}
