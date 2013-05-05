/**
 * todo szymon opis klasy
 * <p/>
 * Created by IntelliJ IDEA.
 *
 * @author szymon.sobocik
 */
public class Regex {

    public static void main(String[] args) {
        Regex regex = new Regex();
        regex.test1();
        regex.test2();
        regex.test3();
    }

    public void test1(){
        String tekst = "asd as .a sdas d(asd ,asasldkjhkasd )asasd asdfsdsj";
        System.out.println(tekst);

        System.out.println( tekst.replaceAll("(.*\\()(.*)(\\).*)", "$2"));
    }

    public void test2(){
        String sql = "To jest jakiś sql <WG_STANU_NA_DZIEN>który zawiera w sobie część warunkową</WG_STANU_NA_DZIEN> iasda s i <WG_STANU_NA_DZIEN> asdasd asd a asd a</WG_STANU_NA_DZIEN>a sdasdas sfsd f<WG_STANU_NA_DZIEN>sd asd asd<ZNACZNIK>adasd <ZNACZNIK>asda</ZNACZNIK>asd </WG_STANU_NA_DZIEN> sdfsd f <WG_STANU_NA_DZIEN></WG_STANU_NA_DZIEN>";
        System.out.println(sql);
        String wynik = sql.replaceAll("(<WG_STANU_NA_DZIEN>)(.*?)(</WG_STANU_NA_DZIEN>)", "$2");
        System.out.println(wynik);
    }

    private void test3() {
        String regexImieNazwisko = "^[a-zA-ZąćęłńóśźżĄĘŁŃÓŚŹŻ'-]*\\s[a-zA-ZąćęłńóśźżĄĘŁŃÓŚŹŻ'-]+$|^$";
        String toTest = "Adam kowalski";
        System.out.println(toTest);
        System.out.println("Pasuje do pustego: " + toTest.matches(regexImieNazwisko));
        toTest = "";
        System.out.println(toTest);
        System.out.println("Pasuje do pustego: " + toTest.matches(regexImieNazwisko));

    }

}
