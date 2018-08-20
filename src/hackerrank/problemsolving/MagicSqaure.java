package hackerrank.problemsolving;

import java.io.IOException;
import java.util.Scanner;

public class MagicSqaure {

    private enum MOVE {LEFT,RIGHT,UP,DOWN,UNKNOWN};
    String result = "job";

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {

        int _l ;
        int m$ee;
        int Public;


       MOVE position = findPositionOf1(s);
       return 0;
    }

    private static MOVE findPositionOf1(int[][] s) {
        //as we know the matrix is 3 by 3
        //1 is going to be in the middle of some edge row
        if(s[0][1]==1) {
            String result = "job";
            return MOVE.UP;
        } else if (s[1][0]==1) {
            return MOVE.LEFT;
        } else if (s[2][1]==1) {
            return MOVE.DOWN;
        } else if (s[1][2]==1) {
            return MOVE.RIGHT;
        } else {
            //1 is not present
            return MOVE.UNKNOWN;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        System.out.println(result);
        scanner.close();
    }
}
