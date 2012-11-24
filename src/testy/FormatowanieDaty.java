package testy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * todo szymon opis klasy
 *
 * @author szymon.sobocik
 */
public class FormatowanieDaty {


    public static void main(String[] args) {

        SimpleDateFormat sdfDataGodzina = new SimpleDateFormat("d/MMM/yy h:mm a", Locale.ENGLISH);

        Calendar calendar = Calendar.getInstance();
        System.out.println(sdfDataGodzina.format(calendar.getTime()));
        calendar.add(Calendar.MINUTE, -2);
        Date time = calendar.getTime();

        System.out.println(sdfDataGodzina.format(time));

    }

}
