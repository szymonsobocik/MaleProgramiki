package testy;

import java.util.ArrayList;

/**
 * todo szymon opis klasy
 * <p/>
 * Created by IntelliJ IDEA.
 *
 * @author szymon.sobocik
 */
public class DodanieIntegerowDoListyStringow {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<String>();

        ArrayList integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
/*
        for (Object integer : integers) {
            strings.add(integer);
        }
*/


        strings.addAll(integers);
        strings.add("Moj string");

        for (String string : strings) {
            System.out.println(string);
        }

    }

}
