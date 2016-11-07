/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;


import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author sa841
 */
public class ODMFileInitilisation {


    public static  Object[] initilisation() {

        NodeList rootNode = null;
        Object[] statics = new Object[2];
        try {
            File inputFile = new File("C:\\Users\\sa841\\Documents\\odm.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            statics[0] = doc;
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            rootNode = doc.getChildNodes();
            statics[1]=rootNode.item(0).getChildNodes();
        } catch (ParserConfigurationException | SAXException | IOException ex) {
            System.out.println(ex.getMessage());
        }

        return statics;
    }

}
