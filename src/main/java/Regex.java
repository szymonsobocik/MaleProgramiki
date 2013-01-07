/**
 * todo szymon opis klasy
 * <p/>
 * Created by IntelliJ IDEA.
 *
 * @author szymon.sobocik
 */
public class Regex {

    public static void main(String[] args) {
        String tekst = "asd as .a sdas d(asd ,asasldkjhkasd )asasd asdfsdsj";
        System.out.println(tekst);

        System.out.println( tekst.replaceAll("(.*\\()(.*)(\\).*)", "$2"));
    }
}
