package hackerrank.java;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Minal.Fulzele on 26/08/2018.
 */
public class JavaBigDecimal {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();
        List<String> collect = new ArrayList<>();
         Arrays.stream(s).filter(str -> str != null).sorted((s1, s2) -> new BigDecimal(s2).compareTo(new BigDecimal(s1)))
                .forEach(val -> collect.add(val));
        for(int i=0;i<collect.size();i++) {
            s[i]=collect.get(i);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

}
