package com.udacity.jwdnd.course1.cloudstorage.model;

import java.math.BigInteger;

public class File {

    private BigInteger fileId;
    private String fileName;
    private String fileSize;
    private BigInteger userId;
    private String contentType;
    private Boolean fileData;

    public File(BigInteger fileId, String fileName,
                String fileSize, BigInteger userId,
                String contentType, Boolean fileData) {
        this.fileId = fileId;
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.userId = userId;
        this.contentType = contentType;
        this.fileData = fileData;
    }

    public BigInteger getFileId() {
        return fileId;
    }

    public void setFileId(BigInteger fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Boolean getFileData() {
        return fileData;
    }

    public void setFileData(Boolean fileData) {
        this.fileData = fileData;
    }
}
