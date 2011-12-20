import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * todo szymon opis klasy
 * <p/>
 * Created by IntelliJ IDEA.
 *
 * @author szymon.sobocik
 */
public class ListaM3U {

    private static ArrayList<String> plikiObslugiwane;

    static {
        plikiObslugiwane = new ArrayList<String>();
        plikiObslugiwane.add("mp3");
        plikiObslugiwane.add("flac");
    }

    public static void utworzListeM3U(File katalog, boolean recursive) {
        if (katalog.isDirectory()) {
            if (containsSupportedFiles(katalog)) {
                try {
                    FileWriter fileWriter = new FileWriter(katalog.getCanonicalPath() + "\\" + katalog.getName() + ".m3u");
                    PrintWriter printWriter = new PrintWriter(fileWriter);

                    for (File plik : katalog.listFiles()) {
                        if (plik.isFile()) {
                            for (String typPliku : plikiObslugiwane) {
                                if (plik.getName().endsWith(typPliku)) {
                                    printWriter.println(plik.getName());
                                }
                            }
                        }
                    }
                    printWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
            }
            if (recursive) {
                for (File podkatalog : katalog.listFiles()) {
                    utworzListeM3U(podkatalog, recursive);
                }
            }
        }
    }

    private static boolean containsSupportedFiles(File katalog) {
        if (katalog.isDirectory()) {
            for (File file : katalog.listFiles()) {
                if (file.isFile()) {
                    for (String typPliku : plikiObslugiwane) {
                        if (file.getName().endsWith(typPliku)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
