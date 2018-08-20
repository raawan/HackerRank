package hackerrank;

/**
 * Created by Minal.Fulzele on 13/08/2018.
 */
public class Spike {

    public static void main(String[] args) {
        int val = 20;
        int i = (20 - Integer.parseInt(new StringBuffer(Integer.toString(val)).reverse().toString()))/6;
        System.out.println(i);
    }

}

