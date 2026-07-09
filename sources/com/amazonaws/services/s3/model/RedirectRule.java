package com.amazonaws.services.s3.model;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class RedirectRule {
    private String hostName;
    private String httpRedirectCode;
    private String protocol;
    private String replaceKeyPrefixWith;
    private String replaceKeyWith;

    public String getHostName() {
        return this.hostName;
    }

    public String getHttpRedirectCode() {
        return this.httpRedirectCode;
    }

    public String getReplaceKeyPrefixWith() {
        return this.replaceKeyPrefixWith;
    }

    public String getReplaceKeyWith() {
        return this.replaceKeyWith;
    }

    public String getprotocol() {
        return this.protocol;
    }

    public void setHostName(String str) {
        this.hostName = str;
    }

    public void setHttpRedirectCode(String str) {
        this.httpRedirectCode = str;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setReplaceKeyPrefixWith(String str) {
        this.replaceKeyPrefixWith = str;
    }

    public void setReplaceKeyWith(String str) {
        this.replaceKeyWith = str;
    }

    public RedirectRule withHostName(String str) {
        setHostName(str);
        return this;
    }

    public RedirectRule withHttpRedirectCode(String str) {
        this.httpRedirectCode = str;
        return this;
    }

    public RedirectRule withProtocol(String str) {
        setProtocol(str);
        return this;
    }

    public RedirectRule withReplaceKeyPrefixWith(String str) {
        setReplaceKeyPrefixWith(str);
        return this;
    }

    public RedirectRule withReplaceKeyWith(String str) {
        setReplaceKeyWith(str);
        return this;
    }
}
