/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nihr.model;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author sa841
 */
@ManagedBean(name = "Subject")
@ApplicationScoped
public class Subject {

    String subjectOID;
    String eventOID;
    String eventRepeatingKey;
    String eventStatus;
    String eventFormOID;
    String eventFormStatus;
    String groupItemOID;
    String groupItemRepeatingKey;
    String itemOID;
    String itemValue;

    public Subject() {
    }

    public Subject(String subjectOID, String eventOID, String eventRepeatingKey, String eventStatus, String eventFormOID, String eventFormStatus, String groupItemOID, String groupItemRepeatingKey, String itemOID, String itemValue) {
        this.subjectOID = subjectOID;
        this.eventOID = eventOID;
        this.eventRepeatingKey = eventRepeatingKey;
        this.eventStatus = eventStatus;
        this.eventFormOID = eventFormOID;
        this.eventFormStatus = eventFormStatus;
        this.groupItemOID = groupItemOID;
        this.groupItemRepeatingKey = groupItemRepeatingKey;
        this.itemOID = itemOID;
        this.itemValue = itemValue;
    }

    public String getSubjectOID() {
        return subjectOID;
    }

    public void setSubjectOID(String subjectOID) {
        this.subjectOID = subjectOID;
    }

    public String getEventOID() {
        return eventOID;
    }

    public void setEventOID(String eventOID) {
        this.eventOID = eventOID;
    }

    public String getEventRepeatingKey() {
        return eventRepeatingKey;
    }

    public void setEventRepeatingKey(String eventRepeatingKey) {
        this.eventRepeatingKey = eventRepeatingKey;
    }

    public String getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }

    public String getEventFormOID() {
        return eventFormOID;
    }

    public void setEventFormOID(String eventFormOID) {
        this.eventFormOID = eventFormOID;
    }

    public String getEventFormStatus() {
        return eventFormStatus;
    }

    public void setEventFormStatus(String eventFormStatus) {
        this.eventFormStatus = eventFormStatus;
    }

    public String getGroupItemOID() {
        return groupItemOID;
    }

    public void setGroupItemOID(String groupItemOID) {
        this.groupItemOID = groupItemOID;
    }

    public String getGroupItemRepeatingKey() {
        return groupItemRepeatingKey;
    }

    public void setGroupItemRepeatingKey(String groupItemRepeatingKey) {
        this.groupItemRepeatingKey = groupItemRepeatingKey;
    }

    public String getItemOID() {
        return itemOID;
    }

    public void setItemOID(String itemOID) {
        this.itemOID = itemOID;
    }

    public String getItemValue() {
        return itemValue;
    }

    public void setItemValue(String itemValue) {
        this.itemValue = itemValue;
    }

}
