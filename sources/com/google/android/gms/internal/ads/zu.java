package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final gk5[] f39407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f39408e;

    static {
        String str = yy2.f38899a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zu(String str, gk5... gk5VarArr) {
        int length = gk5VarArr.length;
        int i11 = 1;
        jx3.a(length > 0);
        this.f39405b = str;
        this.f39407d = gk5VarArr;
        this.f39404a = length;
        int iF = gh.f(gk5VarArr[0].f27103o);
        this.f39406c = iF == -1 ? gh.f(gk5VarArr[0].f27102n) : iF;
        gk5 gk5Var = gk5VarArr[0];
        String strC = c(gk5Var.f27092d);
        int i12 = gk5Var.f27094f | 16384;
        while (true) {
            gk5[] gk5VarArr2 = this.f39407d;
            if (i11 >= gk5VarArr2.length) {
                return;
            }
            gk5 gk5Var2 = gk5VarArr2[i11];
            String str2 = gk5Var2.f27092d;
            if (!strC.equals(c(str2))) {
                d("languages", gk5VarArr2[0].f27092d, str2, i11);
                return;
            } else {
                if (i12 != (gk5Var2.f27094f | 16384)) {
                    d("role flags", Integer.toBinaryString(gk5VarArr2[0].f27094f), Integer.toBinaryString(this.f39407d[i11].f27094f), i11);
                    return;
                }
                i11++;
            }
        }
    }

    private static String c(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void d(String str, String str2, String str3, int i11) {
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 40 + length + 17 + length2 + 9 + String.valueOf(i11).length() + 1);
        sb2.append("Different ");
        sb2.append(str);
        sb2.append(" combined in one TrackGroup: '");
        sb2.append(str2);
        sb2.append("' (track 0) and '");
        sb2.append(str3);
        sb2.append("' (track ");
        sb2.append(i11);
        sb2.append(")");
        y22.f("TrackGroup", "", new IllegalStateException(sb2.toString()));
    }

    public final gk5 a(int i11) {
        return this.f39407d[i11];
    }

    public final int b(gk5 gk5Var) {
        int i11 = 0;
        while (true) {
            gk5[] gk5VarArr = this.f39407d;
            if (i11 >= gk5VarArr.length) {
                return -1;
            }
            if (gk5Var == gk5VarArr[i11]) {
                return i11;
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zu.class == obj.getClass()) {
            zu zuVar = (zu) obj;
            if (this.f39405b.equals(zuVar.f39405b) && Arrays.equals(this.f39407d, zuVar.f39407d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f39408e;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((this.f39405b.hashCode() + 527) * 31) + Arrays.hashCode(this.f39407d);
        this.f39408e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String string = Arrays.toString(this.f39407d);
        String str = this.f39405b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(string).length());
        sb2.append(str);
        sb2.append(": ");
        sb2.append(string);
        return sb2.toString();
    }
}
