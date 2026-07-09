package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.internal.ServerSideEncryptionResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractSSEHandler extends AbstractHandler implements ServerSideEncryptionResult {
    AbstractSSEHandler() {
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public String getSSEAlgorithm() {
        ServerSideEncryptionResult serverSideEncryptionResultSseResult = sseResult();
        if (serverSideEncryptionResultSseResult == null) {
            return null;
        }
        return serverSideEncryptionResultSseResult.getSSEAlgorithm();
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public String getSSECustomerAlgorithm() {
        ServerSideEncryptionResult serverSideEncryptionResultSseResult = sseResult();
        if (serverSideEncryptionResultSseResult == null) {
            return null;
        }
        return serverSideEncryptionResultSseResult.getSSECustomerAlgorithm();
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public String getSSECustomerKeyMd5() {
        ServerSideEncryptionResult serverSideEncryptionResultSseResult = sseResult();
        if (serverSideEncryptionResultSseResult == null) {
            return null;
        }
        return serverSideEncryptionResultSseResult.getSSECustomerKeyMd5();
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final void setSSEAlgorithm(String str) {
        ServerSideEncryptionResult serverSideEncryptionResultSseResult = sseResult();
        if (serverSideEncryptionResultSseResult != null) {
            serverSideEncryptionResultSseResult.setSSEAlgorithm(str);
        }
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final void setSSECustomerAlgorithm(String str) {
        ServerSideEncryptionResult serverSideEncryptionResultSseResult = sseResult();
        if (serverSideEncryptionResultSseResult != null) {
            serverSideEncryptionResultSseResult.setSSECustomerAlgorithm(str);
        }
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final void setSSECustomerKeyMd5(String str) {
        ServerSideEncryptionResult serverSideEncryptionResultSseResult = sseResult();
        if (serverSideEncryptionResultSseResult != null) {
            serverSideEncryptionResultSseResult.setSSECustomerKeyMd5(str);
        }
    }

    protected abstract ServerSideEncryptionResult sseResult();
}
