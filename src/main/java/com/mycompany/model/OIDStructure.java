/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author sa841
 */

@ManagedBean(name = "OIDStructure")
@ApplicationScoped
public class OIDStructure {
    String eventOID;
    String formOID;
    String groupOID;
    String itemOID;

    
    public OIDStructure(String eventOID, String formOID, String groupOID, String itemOID){
        this.eventOID = eventOID;
        this.formOID = formOID;
        this.groupOID = groupOID;
        this.itemOID = itemOID;
    }
    
    public OIDStructure(){}
    public String getEventOID() {
        return eventOID;
    }

    public void setEventOID(String eventOID) {
        this.eventOID = eventOID;
    }

    public String getFormOID() {
        return formOID;
    }

    public void setFormOID(String formOID) {
        this.formOID = formOID;
    }

    public String getGroupOID() {
        return groupOID;
    }

    public void setGroupOID(String groupOID) {
        this.groupOID = groupOID;
    }

    public String getItemOID() {
        return itemOID;
    }

    public void setItemOID(String itemOID) {
        this.itemOID = itemOID;
    }
    
    
}
