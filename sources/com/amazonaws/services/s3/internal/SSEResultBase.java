package com.amazonaws.services.s3.internal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class SSEResultBase implements ServerSideEncryptionResult {
    private String sseAlgorithm;
    private String sseCustomerAlgorithm;
    private String sseCustomerKeyMD5;

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final String getSSEAlgorithm() {
        return this.sseAlgorithm;
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final String getSSECustomerAlgorithm() {
        return this.sseCustomerAlgorithm;
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final String getSSECustomerKeyMd5() {
        return this.sseCustomerKeyMD5;
    }

    @Deprecated
    public final String getServerSideEncryption() {
        return this.sseAlgorithm;
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final void setSSEAlgorithm(String str) {
        this.sseAlgorithm = str;
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final void setSSECustomerAlgorithm(String str) {
        this.sseCustomerAlgorithm = str;
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final void setSSECustomerKeyMd5(String str) {
        this.sseCustomerKeyMD5 = str;
    }
}
