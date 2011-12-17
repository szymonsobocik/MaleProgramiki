import java.io.File;
import java.util.Date;

/**
 * todo szymon opis klasy
 * <p/>
 * Created by IntelliJ IDEA.
 *
 * @author szymon.sobocik
 */
public class AtrybutyPlikowZeZdjeciami {

    public static void zmienDaty(File directory) {
        for (File zdjecie : directory.listFiles()) {
            zdjecie.setLastModified(new Date().getTime());
        }

    }
}
