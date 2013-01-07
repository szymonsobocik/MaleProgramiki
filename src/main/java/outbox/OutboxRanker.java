package outbox;

import java.util.*;

/**
 * todo szymon opis klasy
 * <p/>
 * Created by IntelliJ IDEA.
 *
 * @author szymon.sobocik
 */
public class OutboxRanker implements Ranking{
    public int getRank(List<String> page, Set<String> keywords) {
        int shortestText;

        if (page == null || page.size() == 0 || keywords == null){
            return -1;
        }

        if (keywords.isEmpty()){
            return 0;
        }

        Map<Integer, String> matchingWordsPositions = new HashMap<Integer, String>();

        for (int wordPosition = 0; wordPosition < page.size(); wordPosition++){
            String word = page.get(wordPosition);
            if (keywords.contains(word)){
                matchingWordsPositions.put(wordPosition, word);
            }
        }

        if (!matchingWordsPositions.values().containsAll(keywords)){
            return -1;
        }

        Integer distanceBetweenWords = null;
        Integer firstWordMarker = null;
        Set<String> tempKeywords = new HashSet<String>();
        tempKeywords.addAll(keywords);
        for (int wordPosition = 0; wordPosition < page.size(); wordPosition++){
            String word = matchingWordsPositions.get(wordPosition);
            if (word != null){
                if (firstWordMarker == null) {
                    if (tempKeywords.contains(word)){
                        firstWordMarker = wordPosition;
                        tempKeywords.remove(word);
                    }
                } else if (tempKeywords.contains(word)){
                    if (tempKeywords.size() > 1){
                        tempKeywords.remove(word);
                    } else {
                        int newDistance = wordPosition - firstWordMarker;
                        if (distanceBetweenWords == null || distanceBetweenWords > newDistance){
                            distanceBetweenWords = newDistance;
                            wordPosition = firstWordMarker;
                            tempKeywords.addAll(keywords);
                        }
                    }
                }
            }
        }

        return distanceBetweenWords == null ? -1 : distanceBetweenWords;
    }

    public String getAuthorEmail() {
        return "szymonsobocik@gmail.com";
    }
}
