package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class yz extends zz {
    yz() {
    }

    private static final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i11 = 0;
        int i12 = 0;
        while (i12 < str.length() && str.charAt(i12) == ',') {
            i12++;
        }
        while (length > 0) {
            int i13 = length - 1;
            if (str.charAt(i13) != ',') {
                break;
            }
            length = i13;
        }
        if (length < i12) {
            return null;
        }
        if (i12 != 0) {
            i11 = i12;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i11, length);
    }

    @Override // com.google.android.gms.internal.ads.zz
    public final String a(String str, String str2) {
        String strB = b(str);
        String strB2 = b(str2);
        if (TextUtils.isEmpty(strB)) {
            return strB2;
        }
        if (TextUtils.isEmpty(strB2)) {
            return strB;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(strB).length() + 1 + String.valueOf(strB2).length());
        sb2.append(strB);
        sb2.append(",");
        sb2.append(strB2);
        return sb2.toString();
    }
}
