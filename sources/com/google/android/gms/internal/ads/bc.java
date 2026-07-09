package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class bc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f23782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23783g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f23784h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f23785i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f23786j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f23787k;

    private bc(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22) {
        this.f23777a = i11;
        this.f23778b = i12;
        this.f23779c = i13;
        this.f23780d = i14;
        this.f23781e = i15;
        this.f23782f = i16;
        this.f23783g = i17;
        this.f23784h = i18;
        this.f23785i = i19;
        this.f23786j = i21;
        this.f23787k = i22;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static bc a(String str) {
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i11 = 0;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        int i18 = -1;
        int i19 = -1;
        int i21 = -1;
        int i22 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i11 >= length) {
                if (i12 != -1) {
                    return new bc(i12, i13, i14, i15, i16, i17, i18, i19, i21, i22, length);
                }
                return null;
            }
            String strA = sw3.a(strArrSplit[i11].trim());
            switch (strA.hashCode()) {
                case -1178781136:
                    if (strA.equals("italic")) {
                        i18 = i11;
                    }
                    break;
                case -1026963764:
                    if (strA.equals("underline")) {
                        i19 = i11;
                    }
                    break;
                case -192095652:
                    if (strA.equals("strikeout")) {
                        i21 = i11;
                    }
                    break;
                case -70925746:
                    if (strA.equals("primarycolour")) {
                        i14 = i11;
                    }
                    break;
                case 3029637:
                    if (strA.equals("bold")) {
                        i17 = i11;
                    }
                    break;
                case 3373707:
                    if (strA.equals("name")) {
                        i12 = i11;
                    }
                    break;
                case 366554320:
                    if (strA.equals("fontsize")) {
                        i16 = i11;
                    }
                    break;
                case 767321349:
                    if (strA.equals("borderstyle")) {
                        i22 = i11;
                    }
                    break;
                case 1767875043:
                    if (strA.equals("alignment")) {
                        i13 = i11;
                    }
                    break;
                case 1988365454:
                    if (strA.equals("outlinecolour")) {
                        i15 = i11;
                    }
                    break;
            }
            i11++;
        }
    }
}
