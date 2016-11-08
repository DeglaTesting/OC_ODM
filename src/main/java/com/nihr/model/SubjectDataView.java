/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nihr.model;

import com.nihr.controller.CollectingSubjects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author sa841
 */
@ManagedBean(name = "subjectData")
public class SubjectDataView implements Serializable {

    List<Subject> lsubject;
     List<String> lsubjectOutput;

    @PostConstruct
    public void init() {
        lsubject = new ArrayList();
        CollectingSubjects collectingSubjects = new CollectingSubjects();
        lsubjectOutput = collectingSubjects.collectingSubjectsMetaData();
        lsubject = subjectFormatter(lsubjectOutput);
    }

    public List<String> getLsubjectOutput() {
        return lsubjectOutput;
    }

    public void setLsubjectOutput(List<String> lsubjectOutput) {
        this.lsubjectOutput = lsubjectOutput;
    }

    public List<Subject> getLsubject() {
        return lsubject;
    }

    public void setLsubject(List<Subject> lsubject) {
        this.lsubject = lsubject;
    }


    public List<Subject> subjectFormatter(List<String> lsubjectOutput) {
        for (int i = 0; i < lsubjectOutput.size(); i++) {
            String[] subMetaData = lsubjectOutput.get(i).split(" ");
            Subject subject = new Subject(subMetaData[0], subMetaData[1], subMetaData[2], subMetaData[3], subMetaData[4], subMetaData[5], subMetaData[6], subMetaData[7], subMetaData[8], subMetaData[9]);
            lsubject.add(subject);
        }
        return lsubject;
    }

}
