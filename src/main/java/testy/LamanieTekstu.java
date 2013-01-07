package testy;

/**
 * todo szymon opis klasy
 * <p/>
 * Created by IntelliJ IDEA.
 *
 * @author szymon.sobocik
 */
public class LamanieTekstu {
    public static void main(String[] args) {
        String tekst = "To jest jakiś tekst, który posiada łamania\n\r" +
                "A tutaj jest kolejna linia tego tekstu.\n\r" +
                "Bardzo długi tekst. Bardzo długi tekst. Bardzo długi tekst. Bardzo długi tekst.\n Bardzo długi tekst. Bardzo\r długi tekst. Bardzo długi tekst. ";

        String[] split = tekst.split("\\n\\r|\\n|\\r");



    }

}
