/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nihr.model;

import com.nihr.controller.Printer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author sa841
 */
@ManagedBean(name = "oidStructure")
public class OIDStructureView implements Serializable {

    public List<OIDStructure> lOIDStructure;

    @PostConstruct
    public void init() {
        lOIDStructure = new ArrayList();
        Printer printer = new Printer();
        printer.printOID(this.lOIDStructure);
    }

    public List<OIDStructure> getlOIDStructure() {
        return lOIDStructure;
    }

    public void setlOIDStructure(List<OIDStructure> lOIDStructure) {
        this.lOIDStructure = lOIDStructure;
    }

    public void addOIDStructure(OIDStructure oidstructure) {
        this.lOIDStructure.add(oidstructure);
    }

}
