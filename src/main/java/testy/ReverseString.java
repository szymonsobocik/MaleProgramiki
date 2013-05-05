package testy;

/**
 * @author szymon.sobocik
 */
public class ReverseString {



    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverse("Hello World"));
        System.out.println(rs.reverse("AaBbCc  World olleH"));
        System.out.println(rs.reverse(rs.reverse("Szymon Sobocik - java Developer")));
        System.out.println(rs.reverseInWords("Hello World"));
    }

    private String reverseInWords(String text) {
        String[] split = text.split(" ");
        StringBuilder builder = new StringBuilder();
        for (String aSplit : split) {
            builder.append(reverse(aSplit));
            builder.append(" ");
        }
        return builder.toString();
    }

    private String reverse(String text) {
        return new StringBuffer(text).reverse().toString();
    }

}
