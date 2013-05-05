package testy;

import java.text.SimpleDateFormat;

/**
 * @author szymon.sobocik
 */
public class CzasFormat {

    private SimpleDateFormat sdf;

    public static void main(String[] args) {
        CzasFormat czasFormat = new CzasFormat();
                                      czasFormat.setSdf(new SimpleDateFormat());
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }
}
