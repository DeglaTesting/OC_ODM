/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nihr.controller;

import java.io.File;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author sa841
 */
@ManagedBean (name="uploadedFile")
public class UploadedFile {

    public static File uploadedFile;
        
    public static File getUploadedFile() {
        return uploadedFile;
    }

    public static void setUploadedFile(File uploadedFile) {
        UploadedFile.uploadedFile = uploadedFile;
    }

}
