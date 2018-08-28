package hackerrank.problemsolving;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Minal.Fulzele on 22/08/2018.
 */
public class regex {

    public static void main(String[] args) {
        String ipAddr = "112.255.17.213";
        if(isRegex(ipAddr)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

    private static boolean isRegex(String ipAddr) {

        String pattern = "(\\d{1})\\.(\\d\\d\\d)\\.(\\d\\d\\d)\\.(\\d\\d\\d)";
        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(ipAddr);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
        }else {
            System.out.println("NO MATCH");
        }
        return false;
    }
}
