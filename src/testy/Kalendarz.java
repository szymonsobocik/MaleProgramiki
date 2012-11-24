package testy;

import java.util.Calendar;

/**
 * todo szymon opis klasy
 *
 * @author szymon.sobocik
 */
public class Kalendarz {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        cal.getActualMinimum(Calendar.DAY_OF_MONTH);

    }

}
