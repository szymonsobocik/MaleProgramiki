package outbox;

import java.util.*;

/**
 * todo szymon opis klasy
 * <p/>
 * Created by IntelliJ IDEA.
 *
 * @author szymon.sobocik
 */
public class TestOutboxConfitura {

    public static void main(String[] args) {

        OutboxRanker outboxRanker = new OutboxRanker();

        ArrayList<String> page = new ArrayList<String>();
        Set<String> keywords = new HashSet<String>();
        page.addAll(Arrays.asList("To", "jest", "strona", "internetowa", "z", "treścią", "konkursu"));
        Collections.addAll(keywords, "strona","konkursu");

        System.out.println(outboxRanker.getRank(page, keywords));


        page = new ArrayList<String>();
        keywords = new HashSet<String>();
        page.addAll(Arrays.asList("To", "jest", "strona", "internetowa", "z", "treścią", "konkursu"));

        System.out.println(outboxRanker.getRank(page, keywords));


        page = new ArrayList<String>();
        keywords = new HashSet<String>();
        page.addAll(Arrays.asList("To", "jest", "strona", "internetowa", "z", "treścią", "konkursu"));
        Collections.addAll(keywords, "to", "coś");

        System.out.println(outboxRanker.getRank(page, keywords));

        page = new ArrayList<String>();
        keywords = new HashSet<String>();
        page.addAll(Arrays.asList("w1", "w2", "w3", "w2", "w4", "w5", "w3", "w1", "w2", "w5"));
        Collections.addAll(keywords, "w5", "w2", "w3");

        System.out.println(outboxRanker.getRank(page, keywords));


    }
}
