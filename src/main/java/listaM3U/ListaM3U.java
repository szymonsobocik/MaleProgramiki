package listaM3U;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * todo szymon opis klasy
 * <p/>
 * Created by IntelliJ IDEA.
 *
 * @author szymon.sobocik
 */
public class ListaM3U {

    private List<String> plikiObslugiwane;

    public void utworzListeM3U(File katalog, boolean recursive) {

        SupportedFileTypesReader supportedFileTypesReader = new SupportedFileTypesReader();
        plikiObslugiwane = supportedFileTypesReader.getSupportedFileTypes();

        if (katalog.isDirectory()) {
            if (containsSupportedFiles(katalog)) {
                try {
                    FileWriter fileWriter = new FileWriter(katalog.getCanonicalPath() + "\\" + katalog.getName() + ".m3u");
                    PrintWriter printWriter = new PrintWriter(fileWriter);

                    for (File plik : katalog.listFiles()) {
                        if (plik.isFile()) {
                            for (String typPliku : plikiObslugiwane) {
                                if (plik.getName().toLowerCase().endsWith(typPliku)) {
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

    private boolean containsSupportedFiles(File katalog) {
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

    public static ListaM3U newInstance() {
        return new ListaM3U();
    }
}
