package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzig extends IllegalStateException {
    public zzig(int i11, int i12) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 21 + String.valueOf(i12).length() + 1);
        sb2.append("Buffer too small (");
        sb2.append(i11);
        sb2.append(" < ");
        sb2.append(i12);
        sb2.append(")");
        super(sb2.toString());
    }
}
