package hackerrank;

import java.util.Scanner;

/**
 * Created by Minal.Fulzele on 13/08/2018.
 */
public class IfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        StringBuffer strToPrint = new StringBuffer("");
        int a,b,n;
        for(int i=0;i<N;i++) {
            a=scanner.nextInt();
            b=scanner.nextInt();
            n=scanner.nextInt();
            long sum =a;

            for(int j=0;j<n;j++) {
                sum += ( (Math.pow(2,j))*b);
                strToPrint.append(sum).append(" ");
            }
            strToPrint.append("\n");
            sum = 0;
        }
        scanner.close();
        System.out.println(strToPrint.toString());
       // long i = (long)Math.pow(2,16) * 50;

        //System.out.println(i);
    }
}
