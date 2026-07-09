package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class o15 extends Exception {
    o15(int i11, int i12) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 32 + String.valueOf(i12).length());
        sb2.append("Unpaired surrogate at index ");
        sb2.append(i11);
        sb2.append(" of ");
        sb2.append(i12);
        super(sb2.toString());
    }
}
