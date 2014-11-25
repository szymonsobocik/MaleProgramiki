package testy.jodaTime;

import org.joda.time.DateTime;
import org.joda.time.Hours;

/**
 * User: ssobocik@future-processing.com
 * Date: 9/4/13
 */
public class TestHours {
    public static void main(String[] args) {
        DateTime start = new DateTime();
        DateTime end = new DateTime();

        TestHours testHours = new TestHours();

        testHours.compareHours(start, end);

        start = end.minusMinutes(100);
        testHours.compareHours(start, end);

        start = start.minusMinutes(100);
        testHours.compareHours(start, end);

        start = start.minusMinutes(20);
        testHours.compareHours(start, end);

        start = start.minusMinutes(19);
        testHours.compareHours(start, end);

        start = start.minusMinutes(1);
        testHours.compareHours(start, end);


    }


    private void compareHours(DateTime start, DateTime end) {
        System.out.println(start);
        System.out.println(end);

        int hours = Hours.hoursBetween(start, end).getHours();
        System.out.println(hours);
        System.out.println(hours < 4);
        System.out.println("---");
    }
}
