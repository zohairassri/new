package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzcn extends Exception {
    public zzcn(String str, js0 js0Var) {
        String strValueOf = String.valueOf(js0Var);
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + strValueOf.length());
        sb2.append(str);
        sb2.append(" ");
        sb2.append(strValueOf);
        super(sb2.toString());
    }
}
