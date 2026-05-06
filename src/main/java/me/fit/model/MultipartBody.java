package me.fit.model;

import org.jboss.resteasy.reactive.RestForm;
import org.jboss.resteasy.reactive.multipart.FileUpload;

public class MultipartBody {

    @RestForm("file")
    public FileUpload file;

    @RestForm("fileName")
    public String fileName;
}
