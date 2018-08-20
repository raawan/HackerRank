package hackerrank.problemsolving;

import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {
    /*
    * Complete the timeConversion function below.
    */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String ampm = s.substring(s.length()-2);
        int hr = Integer.valueOf(s.substring(0,2));

        if(ampm.equalsIgnoreCase("PM")&& hr<12) {
            hr+=12;
        }
        if(hr<10 && ampm.equalsIgnoreCase("AM")){
            return "0"+hr + s.substring(2,s.length()-2);
        }
        if(hr==12 && ampm.equalsIgnoreCase("AM")){
            return "00" + s.substring(2,s.length()-2);
        }
        return hr + s.substring(2,s.length()-2);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scan.nextLine();

        String result = timeConversion(s);

        System.out.println(result);
    }
}
