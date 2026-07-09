package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzrh extends Exception {
    public zzrh(long j11, long j12) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(j12).length() + 63 + String.valueOf(j11).length());
        sb2.append("Unexpected audio track timestamp discontinuity: expected ");
        sb2.append(j12);
        sb2.append(", got ");
        sb2.append(j11);
        super(sb2.toString());
    }
}
