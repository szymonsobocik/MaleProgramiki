package listaM3U;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Szymon
 * Date: 05.05.13
 * Time: 21:09
 * To change this template use File | Settings | File Templates.
 */
public class SupportedFileTypesReader {
    public static void main(String[] args) {
        SupportedFileTypesReader supportedFileTypesReader = new SupportedFileTypesReader();
        System.out.println(supportedFileTypesReader.getSupportedFileTypes());
    }

    public List<String> getSupportedFileTypes() {
        ArrayList<String> supportedFileTypes = readSupportedFileTypes();
        validateSupportedFileTypes(supportedFileTypes);

        return supportedFileTypes;

    }

    private void validateSupportedFileTypes(ArrayList<String> supportedFileTypes) {
        //todo validation
    }

    private ArrayList<String> readSupportedFileTypes() {
        File file = new File("supportedFileTypes.xml");
        ArrayList<String> supportedFileTypes = new ArrayList<String>();

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document doc = documentBuilder.parse(file);
            doc.getDocumentElement().normalize();
            System.out.println(doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("FileType");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node item = nodeList.item(i);
                supportedFileTypes.add(item.getTextContent().toLowerCase());
            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (SAXException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        return supportedFileTypes;
    }

}
