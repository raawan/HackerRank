package hackerrank.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Minal.Fulzele on 14/08/2018.
 */
public class EoF {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> result = new ArrayList<>();
        String line;
        while(scanner.hasNextLine()) {
            line = scanner.nextLine();
            result.add(line);
            if(line.endsWith("end-of-file")) break;
        }
        for(int i=0;i<result.size();i++) {
            System.out.println(i+1 + " " + result.get(i));
        }
    }
}
