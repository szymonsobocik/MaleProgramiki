package outbox;

import java.util.List;
import java.util.Set;

/**
 * todo szymon opis klasy
 * <p/>
 * Created by IntelliJ IDEA.
 *
 * @author szymon.sobocik
 */
public interface Ranking {
    int getRank(List<String> page, Set<String> keywords);
    String getAuthorEmail();
}
