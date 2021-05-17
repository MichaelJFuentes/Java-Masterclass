package InputAndOutput;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.xml.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;

public class ReadingFromXML {
    public static void main(String[] args) {
        Path path = Paths.get("src/InputAndOutput/accounts.xml");
        try(BufferedReader bufferedReader = Files.newBufferedReader(path)) {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document accountList = documentBuilder.parse(path.toString());
            NodeList accountsList = accountList.getElementsByTagName("accounts");
            printNodeList(accountsList);
        } catch (IOException | ParserConfigurationException | SAXException e) {
            e.printStackTrace();
        }
    }

    public static void printNodeList(NodeList myNodes) {
        for (int i = 0; i < myNodes.getLength() ; i++) {
            Node element = myNodes.item(i);
            if (element.hasChildNodes()) {
                NodeList elementNodes = element.getChildNodes();
                for (int j = 0; j < elementNodes.getLength(); j++) {
                    System.out.println(j);
                }
            }
        }
    }
}
