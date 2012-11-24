package testy;

import java.util.HashSet;
import java.util.Set;

/**
 * Pomocnicza klasa, która służy do przechowania informacji o połączeniu pomiędzy dwoma grupami tabel.
 * <p/>
 * Created by IntelliJ IDEA.
 *
 * @author szymon.sobocik
 * @since rc01
 */
public class PolaczenieGrupTabel {

    public PolaczenieGrupTabel(Integer idGrupyPierwszej, Integer idGrupyDrugiej) {
        this.grupy.add(idGrupyPierwszej);
        this.grupy.add(idGrupyDrugiej);
    }

    public PolaczenieGrupTabel(Integer idGrupyPierwszej, Integer idGrupyDrugiej, String polaczenieSQL) {
        this(idGrupyPierwszej, idGrupyDrugiej);
        this.polaczenieSQL = polaczenieSQL + " and ";
    }

    private Set<Integer> grupy = new HashSet<Integer>();

    private String polaczenieSQL;

    public String getPolaczenieSQL() {
        return polaczenieSQL;
    }

    public void setPolaczenieSQL(String polaczenieSQL) {
        this.polaczenieSQL = polaczenieSQL;
    }

    @Override
    public int hashCode() {
        return grupy != null ? grupy.hashCode() : 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PolaczenieGrupTabel that = (PolaczenieGrupTabel) o;

        if (!grupy.equals(that.grupy)) return false;

        return true;
    }
}
