package pl.ssobocik.doUrlopu;

import org.joda.time.DateMidnight;
import org.joda.time.Days;
import org.joda.time.Weeks;

import java.util.Date;

/**
 * @author szymon.sobocik
 */
public class OdliczanieDoWczasow {

    private Date poczatek;

    public static void main(String[] args) {

        OdliczanieDoWczasow odliczanieDoWczasow = new OdliczanieDoWczasow();
        odliczanieDoWczasow.setPoczatek(new DateMidnight(2013, 8, 10).toDate());
        int days = odliczanieDoWczasow.getRemainingDays();

        System.out.println("Do urlopu pozostało: " + days + " dni");
    }

    private int getRemainingDays() {
        DateMidnight today = new DateMidnight();
        DateMidnight beginOfHoliday = new DateMidnight(poczatek);
        int weeks = Weeks.weeksBetween(today, beginOfHoliday).getWeeks();
        return Days.daysBetween(today, beginOfHoliday ).getDays() - weeks * 2;
    }

    public void setPoczatek(Date poczatek) {
        this.poczatek = poczatek;
    }
}
