package com.amazonaws.services.s3.model;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class MultiFactorAuthentication {
    private String deviceSerialNumber;
    private String token;

    public MultiFactorAuthentication(String str, String str2) {
        this.deviceSerialNumber = str;
        this.token = str2;
    }

    public String getDeviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    public String getToken() {
        return this.token;
    }

    public void setDeviceSerialNumber(String str) {
        this.deviceSerialNumber = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public MultiFactorAuthentication withDeviceSerialNumber(String str) {
        setDeviceSerialNumber(str);
        return this;
    }

    public MultiFactorAuthentication withToken(String str) {
        setToken(str);
        return this;
    }
}
