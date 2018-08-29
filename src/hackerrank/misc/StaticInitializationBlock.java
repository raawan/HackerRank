package hackerrank.misc;

import java.util.Scanner;

/**
 * Created by Minal.Fulzele on 14/08/2018.
 */
public class StaticInitializationBlock {
    private static final Scanner scanner = new Scanner(System.in);

    static {
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        if (b <= 0 || h <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.println(b*h);
        }

    }

    public static void main(String[] args) {

    }
}
