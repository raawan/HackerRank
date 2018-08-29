package hackerrank.misc;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by Minal.Fulzele on 13/08/2018.
 */
public class Spike {

    public static void main(String[] args) {
        sortBigDecimalValues();
    }

    private static void sortBigDecimalValues() {
        String val = "0.99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999";
        BigDecimal bigVal = new BigDecimal(val);
        System.out.println(bigVal);
        System.out.println(bigVal.toString().equals(val));

        DecimalFormat myFormatter = new DecimalFormat("0000.0");
        String val2="001.22";
        //System.out.println(new BigDecimal("001.22").toPlainString());
        System.out.println(myFormatter.format(new BigDecimal("001.22")));
    }
}

