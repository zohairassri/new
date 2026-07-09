package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class g7 implements gd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f26830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f26831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26832f;

    public g7(int i11, String str, String str2, String str3, boolean z11, int i12) {
        boolean z12 = true;
        if (i12 != -1 && i12 <= 0) {
            z12 = false;
        }
        jx3.a(z12);
        this.f26827a = i11;
        this.f26828b = str;
        this.f26829c = str2;
        this.f26830d = str3;
        this.f26831e = z11;
        this.f26832f = i12;
    }

    @Override // com.google.android.gms.internal.ads.gd
    public final void a(fb fbVar) {
        String str = this.f26829c;
        if (str != null) {
            fbVar.R(str);
        }
        String str2 = this.f26828b;
        if (str2 != null) {
            fbVar.Q(str2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g7.class == obj.getClass()) {
            g7 g7Var = (g7) obj;
            if (this.f26827a == g7Var.f26827a && Objects.equals(this.f26828b, g7Var.f26828b) && Objects.equals(this.f26829c, g7Var.f26829c) && Objects.equals(this.f26830d, g7Var.f26830d) && this.f26831e == g7Var.f26831e && this.f26832f == g7Var.f26832f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f26828b;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i11 = this.f26827a;
        String str2 = this.f26829c;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i12 = ((i11 + 527) * 31) + iHashCode;
        String str3 = this.f26830d;
        return (((((((i12 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f26831e ? 1 : 0)) * 31) + this.f26832f;
    }

    public final String toString() {
        String str = this.f26829c;
        int length = String.valueOf(str).length();
        String str2 = this.f26828b;
        int length2 = String.valueOf(str2).length();
        int i11 = this.f26827a;
        int length3 = String.valueOf(i11).length();
        int i12 = this.f26832f;
        StringBuilder sb2 = new StringBuilder(length + 28 + length2 + 11 + length3 + 19 + String.valueOf(i12).length());
        sb2.append("IcyHeaders: name=\"");
        sb2.append(str);
        sb2.append("\", genre=\"");
        sb2.append(str2);
        sb2.append("\", bitrate=");
        sb2.append(i11);
        sb2.append(", metadataInterval=");
        sb2.append(i12);
        return sb2.toString();
    }
}
