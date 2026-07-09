package com.amazonaws.internal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class DynamoDBBackoffStrategy extends CustomBackoffStrategy {
    public static final CustomBackoffStrategy DEFAULT = new DynamoDBBackoffStrategy();

    @Override // com.amazonaws.internal.CustomBackoffStrategy
    public int getBackoffPeriod(int i11) {
        if (i11 <= 0) {
            return 0;
        }
        int iPow = ((int) Math.pow(2.0d, i11 - 1)) * 50;
        if (iPow < 0) {
            return Integer.MAX_VALUE;
        }
        return iPow;
    }
}
