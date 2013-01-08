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
    private boolean odliczWolne;

    public static void main(String[] args) {

        OdliczanieDoWczasow odliczanieDoWczasow = new OdliczanieDoWczasow();
        odliczanieDoWczasow.setPoczatek(new DateMidnight(2013, 8, 10).toDate());
        System.out.println("Do urlopu pozostało: " + odliczanieDoWczasow.getRemainingDays() + " dni");
        odliczanieDoWczasow.setOdliczWolne(true);
        System.out.println("W tym " + odliczanieDoWczasow.getRemainingDays() + " dni roboczych");
    }

    private int getRemainingDays() {
        DateMidnight today = new DateMidnight();
        DateMidnight beginOfHoliday = new DateMidnight(poczatek);
        int days = Days.daysBetween(today, beginOfHoliday).getDays();
        if (odliczWolne) {
            int weeks = Weeks.weeksBetween(today, beginOfHoliday).getWeeks();
            days -= weeks * 2;
        }
        return days;
    }

    public void setPoczatek(Date poczatek) {
        this.poczatek = poczatek;
    }

    public void setOdliczWolne(boolean odliczWolne) {
        this.odliczWolne = odliczWolne;
    }
}
