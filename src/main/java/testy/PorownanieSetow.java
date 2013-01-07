package testy;

import java.util.HashSet;
import java.util.Set;

/**
 * todo szymon opis klasy
 * <p/>
 * Created by IntelliJ IDEA.
 *
 * @author szymon.sobocik
 */
public class PorownanieSetow {

    public static void main(String[] args) {
        HashSet<PolaczenieGrupTabel> set = new HashSet<PolaczenieGrupTabel>();
        PolaczenieGrupTabel polaczenie1 = new PolaczenieGrupTabel(1, 2);
        PolaczenieGrupTabel polaczenie2 = new PolaczenieGrupTabel(1, 2);

        set.add(polaczenie1);

        boolean wynik = polaczenie1.equals(polaczenie2);
        System.out.println("Wynik : " + wynik);

        boolean wynik2 = set.contains(polaczenie2);
        System.out.println("Wynik2 : " + wynik2);

    }

}
