import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    public static void utworzListeM3U(File katalog){
        if (katalog.isDirectory()){
            try {
                FileWriter fileWriter = new FileWriter(katalog.getCanonicalPath()+"\\" + katalog.getName() + ".m3u");
                PrintWriter printWriter = new PrintWriter(fileWriter);

                for (File plik : katalog.listFiles()) {
                    if (plik.isFile()){
                        for (String typPliku : plikiObslugiwane){
                            if (plik.getName().endsWith(typPliku)){
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
    }
}
