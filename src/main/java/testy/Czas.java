package testy;

import java.sql.Time;
import java.util.Date;

/**
 * todo szymon opis klasy
 *
 * @author szymon.sobocik
 */
public class Czas {

    private static final Integer MINUTE_IN_MSEC = 60 * 1000;
    private static final Integer MINUTES_IN_HOUR = 60;

    public static void main(String[] args) {
        System.out.println(Czas.getCzasHHMM(240));
        System.out.println(Czas.getCzasHHMM(243));
        System.out.println(Czas.getCzasHHMM(12));
        System.out.println(Czas.getCzasHHMM(1111123));


        Czas czas = new Czas();
        System.out.println("MinutesCount: " + czas.getMinutesCount("00:12"));
        System.out.println("MinutesCount: " + czas.getMinutesCount("01:12"));
        System.out.println("MinutesCount: " + czas.getMinutesCount("02:12"));
        System.out.println("MinutesCount: " + czas.getMinutesCount("10:12"));
        System.out.println("MinutesCount: " + czas.getMinutesCount("20:12"));
//        System.out.println("MinutesCount: " + czas.getMinutesCount("24:12"));
        System.out.println("MinutesCount: " + czas.getMinutesCount("22:12"));

       czas.testTime("00:12");
       czas.testTime("01:12");

        String timeString = czas.getTimeString(new Date());
        System.out.println("TimeString: " + timeString);
    }

    private String getTimeString(Date date) {
        int minutes = date.getMinutes();
        System.out.println("Min: " + minutes);
        int hours = date.getHours();
        System.out.println("Hour: " + hours);
        minutes = minutes + hours * MINUTES_IN_HOUR;

        return getCzasHHMM(minutes);
    }

    private void testTime(String text) {
        Integer minutesCount = getMinutesCount(text);
        Time time = new Time(0, minutesCount, 0);
        System.out.println(time);
    }

    private Integer getMinutesCount(String text) {
        System.out.println("----\ntext: " + text);
        if (!isValidTimeFormat(text)) {
            throw new IllegalArgumentException("Wrong time format");
        }

        String sHours = text.substring(0, text.indexOf(":"));
        String sMinutes = text.substring(text.indexOf(":") + 1, text.length());

        Integer hours = new Integer(sHours);
        System.out.println("Hours :" + hours);
        Integer minutes = new Integer(sMinutes);
        System.out.println("Minutes :" + minutes);
        minutes += hours * 60;
        return minutes;
    }

    /**
     * Tworzy string w postaci HH:MM na podstawie liczby minut
     *
     * @param liczbaMinut liczba minut
     * @return null - jeżeli liczbaMinut jest null<br/>
     *         string w postaci HH:MM
     */
    public static String getCzasHHMM(Integer liczbaMinut) {
        if (liczbaMinut == null) {
            return null;
        }

        int godziny = liczbaMinut / 60;
        int minuty = liczbaMinut % 60;

        return addLeadingZero(godziny) + ":" + addLeadingZero(minuty);
    }

    private static String addLeadingZero(int minuty) {
        String wynik = "";
        if (minuty < 10) {
            wynik = "0";
        }
        wynik += minuty;
        return wynik;
    }

    private boolean isValidTimeFormat(String tekst) {
        return tekst != null && tekst.matches("([0-1]?\\d|2[0-3]?):([0-5]\\d)");
    }
}
