package com.amazonaws.services.s3.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class SSEAwsKeyManagementParams implements Serializable {
    private final String awsKmsKeyId;

    public SSEAwsKeyManagementParams() {
        this.awsKmsKeyId = null;
    }

    public String getAwsKmsKeyId() {
        return this.awsKmsKeyId;
    }

    public String getEncryption() {
        return SSEAlgorithm.KMS.getAlgorithm();
    }

    public SSEAwsKeyManagementParams(String str) {
        if (str != null && !str.trim().isEmpty()) {
            this.awsKmsKeyId = str;
            return;
        }
        throw new IllegalArgumentException("AWS Key Management System Key id cannot be null");
    }
}
