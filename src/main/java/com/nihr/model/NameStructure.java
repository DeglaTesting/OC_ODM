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

@ManagedBean(name = "NameStructure")
public class NameStructure {

    String eventName;
    String formName;
    String groupName;
    String itemName;

    public NameStructure(String eventName, String formName, String groupName, String itemName) {
        this.eventName = eventName;
        this.formName = formName;
        this.groupName = groupName;
        this.itemName = itemName;
    }

    public NameStructure() {
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

}
