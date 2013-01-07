package testy;

import java.math.BigDecimal;

/**
 * todo szymon opis klasy
 *
 * @author szymon.sobocik
 */
public class FormatowanieBigDecimal {


    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(343.45);

        BigDecimal bigDecimal1 = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);

        System.out.println(bigDecimal.toString());
        System.out.println(bigDecimal.toPlainString());
        System.out.println(bigDecimal1.toString());
        System.out.println(bigDecimal1.toPlainString());


    }
}
