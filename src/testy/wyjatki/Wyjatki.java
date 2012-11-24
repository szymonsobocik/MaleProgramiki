package testy.wyjatki;

/**
 * todo szymon opis klasy
 *
 * @author szymon.sobocik
 */
public class Wyjatki {

    public static void main(String[] args) {

        Wyjatki wyjatki = new Wyjatki();
        String wykonaj = wyjatki.wykonaj(1);
        System.out.println(wykonaj);
        System.out.println(wyjatki.wykonaj(2));

    }

    public String wykonaj(int nr){
        try {
            System.out.println("try " + nr);
            rzucWyjatek();
        } catch (Exception e) {
            System.out.println("catch " + nr);
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            return "wynik z Catch " + nr;
        } finally {
            System.out.println("finally " + nr);
        }
        return "bez wyjatku";
    }

    private void rzucWyjatek() throws Exception {
        throw new Exception("Wyjatek");
    }

}
