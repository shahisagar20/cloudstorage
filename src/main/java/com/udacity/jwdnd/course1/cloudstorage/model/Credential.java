package com.udacity.jwdnd.course1.cloudstorage.model;

import java.math.BigInteger;

public class Credential {

    private BigInteger credentialId;
    private String url;
    private String userName;
    private String key;
    private char[] password;
    private BigInteger userId;

    public Credential(BigInteger credentialId, String url, String userName,
                      String key, char[] password, BigInteger userId) {
        this.credentialId = credentialId;
        this.url = url;
        this.userName = userName;
        this.key = key;
        this.password = password;
        this.userId = userId;
    }

    public BigInteger getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(BigInteger credentialId) {
        this.credentialId = credentialId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }
}
