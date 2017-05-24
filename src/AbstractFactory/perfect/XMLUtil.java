package AbstractFactory.perfect;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	public static Object getBean() {
		try {
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.parse(new File("src/AbstractFactory/perfect/config.xml"));
			NodeList nodeList = document.getElementsByTagName("className");
			Node node = nodeList.item(0).getFirstChild();
			String className = node.getNodeValue();
			Class c = Class.forName(className);
			Object object = c.newInstance();
			return object;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
