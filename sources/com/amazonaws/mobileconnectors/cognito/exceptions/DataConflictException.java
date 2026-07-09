package com.amazonaws.mobileconnectors.cognito.exceptions;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class DataConflictException extends DataStorageException {
    private static final long serialVersionUID = 4937963535057299466L;

    public DataConflictException(String str, Throwable th2) {
        super(str, th2);
    }

    public DataConflictException(String str) {
        super(str);
    }
}
