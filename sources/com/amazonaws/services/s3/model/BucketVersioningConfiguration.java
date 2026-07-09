package com.amazonaws.services.s3.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class BucketVersioningConfiguration implements Serializable {
    public static final String ENABLED = "Enabled";
    public static final String OFF = "Off";
    public static final String SUSPENDED = "Suspended";
    private Boolean isMfaDeleteEnabled = null;
    private String status;

    public BucketVersioningConfiguration() {
        setStatus(OFF);
    }

    public String getStatus() {
        return this.status;
    }

    public Boolean isMfaDeleteEnabled() {
        return this.isMfaDeleteEnabled;
    }

    public void setMfaDeleteEnabled(Boolean bool) {
        this.isMfaDeleteEnabled = bool;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public BucketVersioningConfiguration withMfaDeleteEnabled(Boolean bool) {
        setMfaDeleteEnabled(bool);
        return this;
    }

    public BucketVersioningConfiguration withStatus(String str) {
        setStatus(str);
        return this;
    }

    public BucketVersioningConfiguration(String str) {
        setStatus(str);
    }
}
