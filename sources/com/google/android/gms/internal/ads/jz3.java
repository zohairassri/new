package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class jz3 {
    static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        String string = obj.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 26);
        sb2.append("null value in entry: ");
        sb2.append(string);
        sb2.append("=null");
        throw new NullPointerException(sb2.toString());
    }

    static int b(int i11, String str) {
        if (i11 >= 0) {
            return i11;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 29 + String.valueOf(i11).length());
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }
}
