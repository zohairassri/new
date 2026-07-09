package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ec3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25697a;

    public static String a(int i11) {
        char c11 = (char) ((i11 >> 24) & 255);
        int length = String.valueOf(c11).length();
        char c12 = (char) ((i11 >> 16) & 255);
        int length2 = String.valueOf(c12).length();
        char c13 = (char) ((i11 >> 8) & 255);
        char c14 = (char) (i11 & 255);
        StringBuilder sb2 = new StringBuilder(length + length2 + String.valueOf(c13).length() + String.valueOf(c14).length());
        sb2.append(c11);
        sb2.append(c12);
        sb2.append(c13);
        sb2.append(c14);
        return sb2.toString();
    }

    public String toString() {
        return a(this.f25697a);
    }
}
