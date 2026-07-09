package com.amazonaws.auth;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class BasicSessionCredentials implements AWSSessionCredentials {
    private final String awsAccessKey;
    private final String awsSecretKey;
    private final String sessionToken;

    public BasicSessionCredentials(String str, String str2, String str3) {
        this.awsAccessKey = str;
        this.awsSecretKey = str2;
        this.sessionToken = str3;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public String getAWSAccessKeyId() {
        return this.awsAccessKey;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public String getAWSSecretKey() {
        return this.awsSecretKey;
    }

    @Override // com.amazonaws.auth.AWSSessionCredentials
    public String getSessionToken() {
        return this.sessionToken;
    }
}
