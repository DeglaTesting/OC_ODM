/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.model.*;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import org.w3c.dom.Document;

/**
 *
 * @author sa841
 */
@ManagedBean(name = "printer")
public class Printer {

    List<String> lprintStructure;
    List<String> lprintOID;

    public Printer() {
        lprintStructure = new ArrayList();
        lprintOID = new ArrayList();
        collectingMetaData();
    }

    public void collectingMetaData() {
        CollectingEvents collectingEvents = new CollectingEvents();
        List<StudyEvent> eventCollection = (List<StudyEvent>) (collectingEvents.collectingStudyEvents())[1];
        Document doc = (Document) (collectingEvents.collectingStudyEvents())[0];
        for (int i = 0; i < eventCollection.size(); i++) {
            String printOID = eventCollection.get(i).getEventOID();
            String printStructure = eventCollection.get(i).getEventName();
            CollectingStudyEventForms collectingStudyEventForms = new CollectingStudyEventForms();
            List<StudyEventForm> eventFormCollection = collectingStudyEventForms.collectingStudyEventForms(doc, eventCollection.get(i).getEventOID());
            for (int j = 0; j < eventFormCollection.size(); j++) {
                CollectingItemGroup collectingItemGroup = new CollectingItemGroup();
                List<ItemGroup> itemGroupCollection = collectingItemGroup.collectingItemGroup(doc, eventFormCollection.get(j).getFormOID());
                for (int k = 0; k < itemGroupCollection.size(); k++) {
                    CollectingItems collectingItems = new CollectingItems();
                    List<Item> itemCollection = collectingItems.collectingItems(doc, itemGroupCollection.get(k).getItemGroupOID());
                    for (int m = 0; m < itemCollection.size(); m++) {
                        String sprintOID = printOID.concat(" " + eventFormCollection.get(j).getFormOID()).concat(" " + itemGroupCollection.get(k).getItemGroupOID()).concat(" " + itemCollection.get(m).getItemOID());
                        String sprintStructure = printStructure.concat(" " + eventFormCollection.get(j).getFormName()).concat(" " + itemGroupCollection.get(k).getItemGroupName()).concat(" " + itemCollection.get(m).getItemName());
                        lprintStructure.add(sprintStructure);
                        lprintOID.add(sprintOID);
                    }
                }
            }
        }
    }

    public void printStructure(List<NameStructure> lNameStructure) {
        System.out.println("****** PrintStructure *******");
        for (int i = 0; i < lprintStructure.size(); i++) {
            System.out.println(lprintStructure.get(i));
            String[] names = lprintStructure.get(i).split(" ");
            NameStructure nameStructure = new NameStructure(names[0], names[1], names[2], names[3]);
            lNameStructure.add(nameStructure);  
        }
    }

    public void printOID(List<OIDStructure> lOIDStructure) {
        for (int i = 0; i < lprintOID.size(); i++) {
            System.out.println(lprintOID.get(i));
            String[] oids = lprintOID.get(i).split(" ");
            OIDStructure oidstructure = new OIDStructure(oids[0], oids[1], oids[2], oids[3]);
            lOIDStructure.add(oidstructure);
        }
    }

   /* public static void main(String[] args) {
        Printer printer = new Printer();
        printer.collectingMetaData();
        System.out.println("****** PrintStructure *******");
        printer.printStructure();
        System.out.println("****** PrintOID *******");
        printer.printOID();
    }*/
}
