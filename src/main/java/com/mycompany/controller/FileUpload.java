/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.event.FileUploadEvent;

/**
 *
 * @author sa841
 */
@ManagedBean(name = "fileUploadController")
public class FileUpload {

    public String filePath;
    public boolean disabled = true;
    private String destination = "C:\\Users\\sa841\\Documents\\";

    public void upload(FileUploadEvent event) {

        FacesMessage msg = new FacesMessage("Success! ", event.getFile().getFileName() + " is uploaded.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        try {
            copyFile(event.getFile().getFileName(), event.getFile().getInputstream());
            filePath = destination + event.getFile().getFileName();
            UploadedFile.uploadedFile = new File(filePath);
            System.out.println("@@@@@@@@@@" + UploadedFile.uploadedFile.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void copyFile(String fileName, InputStream in) {
        try {
            OutputStream out = new FileOutputStream(new File(destination + fileName));
            int read = 0;
            byte[] bytes = new byte[1024];

            while ((read = in.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }

            in.close();
            out.flush();
            out.close();
            System.out.println("New file created!");
            System.out.println("@@@@@@@@@@" + this.disabled);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public boolean isDisabled() {
        return disabled;
    }

    public void enabled() {
        this.disabled = false;
    }

    public boolean setDisable() {
        return true;
    }
}