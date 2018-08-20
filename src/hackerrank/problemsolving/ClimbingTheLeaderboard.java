package hackerrank.problemsolving;

import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;

public class ClimbingTheLeaderboard {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {

        int[] result = new int[alice.length];
        int[] distinctScores = IntStream.of(scores).distinct().toArray();
        int previousPointer = 0;
        int counter =0;
        for( int i=0; i<alice.length;i++) {
            counter = 0;
            for(int j = distinctScores.length-1-previousPointer;j>=0;j--) {
                if(alice[i]<distinctScores[j]) {
                    result[i]= j+2;
                    previousPointer+=counter;
                    break;
                } else if(alice[i]==distinctScores[j]) {
                    result[i]= j+1;
                    previousPointer+=counter;
                    break;
                } else if (j==0 && alice[i]>distinctScores[0]){
                    result[i]= 1;
                }
                counter++;
            }
        }
        return result;
    }

    private static int findPosition(Iterator<Integer> integerIterator, int aliceScore) {
        int i = 0;
        while (integerIterator.hasNext()) {
            i++;
            if (aliceScore == integerIterator.next()) {
                break;
            }
        }
        return i;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        Arrays.stream(result).forEach(val -> System.out.println(val));
        scanner.close();
    }
}
