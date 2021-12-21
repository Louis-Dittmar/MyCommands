package org.louis.mycommands.CAH;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;

public class Cards {


    public ArrayList<String> GetCards(int amount) {

            DocumentBuilderFactory DocumentBuilderF = DocumentBuilderFactory.newInstance();
            try {
                DocumentBuilderF.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
                DocumentBuilder DocumentB = DocumentBuilderF.newDocumentBuilder();
                Document doc = DocumentB.parse(new File("src/main/resources/Cards/cards.xml"));
                doc.getDocumentElement().normalize();

                NodeList list = doc.getElementsByTagName("card");

                ArrayList<String> cards = new ArrayList<>();
                Random rand = new Random();
                for (int i = 0; i < amount; i++) {
                    int value = rand.nextInt(list.getLength() + 1);
                    Node node = list.item(value);
                    cards.add(node.getTextContent());
                }
                return cards;
            } catch (Exception e) {
                e.printStackTrace();
            }
        return null;

    }



}
