package testy;

/**
 * @author szymon.sobocik
 */
public class IntegeryPorownania {

    public static void main(String[] args) {
        System.out.println("Proste");
        porownaj(47, 47);
        porownaj(127, 127);
        porownaj(128, 128);
        porownaj(130, 130);

        System.out.println("Proste przypisane do Integer");
        Integer int1 = 37;
        Integer int2 = 37;
        porownaj(int1, int2);

        System.out.println("Integer przez konstruktor");
        int1 = new Integer(27);
        int2 = new Integer(27);
        porownaj(int1, int2);

        System.out.println("Integer przez konstruktor bez przypisania");
        porownaj(new Integer(130), new Integer(130));
    }

    private static void porownaj(Integer int1, Integer int2) {
        System.out.println(int1 + " == " + int2);
        if (int1 == int2) {
            System.out.println("Równe");
        } else {
            System.out.println("Nie równe");
        }

    }

}
