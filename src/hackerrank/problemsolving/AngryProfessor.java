package hackerrank.problemsolving;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Minal.Fulzele on 18/08/2018.
 */
public class AngryProfessor {
    // Complete the angryProfessor function below.
    static String angryProfessor(int noOfStudents, int thrshold, int[] arrivaltime) {

        List<Integer> arrivalTimeSorted = new ArrayList<>();
        Arrays.stream(arrivaltime).forEach(val -> arrivalTimeSorted.add(val));
        List<Integer> studentsArrivedOnTime = arrivalTimeSorted.stream().filter(val -> val <= 0).collect(Collectors.toList());
        if(studentsArrivedOnTime.size()>=thrshold) {
            return "NO";
        } else {
            return "YES";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        List<String> finalresult = new ArrayList<>();
        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int aItem = Integer.parseInt(aItems[i]);
                a[i] = aItem;
            }

            String result = angryProfessor(n,k, a);
            finalresult.add(result);

        }


        for(String val:finalresult) {
            System.out.println(val);
        }
        scanner.close();
    }
}
