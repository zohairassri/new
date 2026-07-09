package com.amazonaws.mobileconnectors.s3.transferutility;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public enum TransferType {
    UPLOAD,
    DOWNLOAD,
    ANY;

    public static TransferType getType(String str) {
        TransferType transferType = UPLOAD;
        if (str.equalsIgnoreCase(transferType.toString())) {
            return transferType;
        }
        TransferType transferType2 = DOWNLOAD;
        if (str.equalsIgnoreCase(transferType2.toString())) {
            return transferType2;
        }
        TransferType transferType3 = ANY;
        if (str.equalsIgnoreCase(transferType3.toString())) {
            return transferType3;
        }
        throw new IllegalArgumentException("Type " + str + " is not a recognized type");
    }
}
