package mojeTesty;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * todo szymon opis klasy
 * Date: 03.03.12
 * Time: 15:01
 */
public class ConcurrentModificationOfList {


    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<String>(Arrays.asList("Ola", "Karol", "Szymon"));

        for (Object o : strings.toArray()) {

        }


    }
}
