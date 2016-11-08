package com.nihr.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author sa841
 */
@ManagedBean(name = "userClick")
public class UserClick  implements Serializable{
    String formLodder = "default.xhtml";

    public String getFormLodder() {
        return formLodder;
    }

    public void setFormLodder(String formLodder) {
        switch (formLodder) {
            case "printOID":
                this.formLodder = "OIDStructure.xhtml";
                break;
            case "printStructure":
                this.formLodder = "NameStructure.xhtml";
                break;
            case "printData":
                this.formLodder = "printData.xhtml";
                break;
            case "Reload":
                this.formLodder = "default.xhtml";
            default:
                break;
        }
    }
}
