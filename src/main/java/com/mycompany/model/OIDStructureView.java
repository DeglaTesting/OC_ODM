/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import com.mycompany.controller.Printer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author sa841
 */
@ManagedBean(name = "OIDStructureView")
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
