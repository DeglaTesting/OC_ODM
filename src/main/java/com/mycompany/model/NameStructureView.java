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

/**
 *
 * @author sa841
 */
@ManagedBean(name = "NameStructureView")
public class NameStructureView implements Serializable {

    public List<NameStructure> lNameStructure;

    @PostConstruct
    public void init() {
        lNameStructure = new ArrayList();
        Printer printer = new Printer();
        printer.printStructure(this.lNameStructure);
    }

    public List<NameStructure> getlOIDStructure() {
        return lNameStructure;
    }

    public void setlOIDStructure(List<NameStructure> lNameStructure) {
        this.lNameStructure = lNameStructure;
    }

    public void addOIDStructure(NameStructure namestructure) {
        this.lNameStructure.add(namestructure);
    }

}
