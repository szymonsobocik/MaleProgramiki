package testy;

import java.io.*;

/**
 * @author szymon.sobocik
 */
public class ZapisDoPlikuTXT {


    private String path;

    public static void main(String[] args) {
        ZapisDoPlikuTXT zapisDoPlikuTXT = new ZapisDoPlikuTXT();
        zapisDoPlikuTXT.setPath("c:\\temp\\plikZapisany.txt");
        zapisDoPlikuTXT.save("To jest tekst do zapisania");
    }

    private void save(String text) {
        FileOutputStream fileOutputStream = null;
        OutputStreamWriter outputStreamWriter = null;
        try {
            fileOutputStream = new FileOutputStream(path);
            outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
            outputStreamWriter.write(text);

        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } finally {
            try {
                if (outputStreamWriter != null) {
                    outputStreamWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
            }
        }

    }

    public void setPath(String path) {
        this.path = path;
    }
}
