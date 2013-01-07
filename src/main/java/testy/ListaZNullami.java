package testy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author szymon.sobocik
 */
public class ListaZNullami {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<Integer>();

        integers.add(-2);
        integers.add(3);
        integers.add(null);
        integers.add(null);
        integers.add(null);
        integers.add(5);
        System.out.println(integers.toString());
    }
}
