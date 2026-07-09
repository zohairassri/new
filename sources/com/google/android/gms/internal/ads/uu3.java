package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class uu3 extends wv3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f36346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f36348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f36349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f36350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f36351f;

    /* synthetic */ uu3(IBinder iBinder, String str, int i11, float f11, int i12, int i13, String str2, int i14, String str3, String str4, String str5, byte[] bArr) {
        this.f36346a = iBinder;
        this.f36347b = str;
        this.f36348c = i11;
        this.f36349d = f11;
        this.f36350e = i14;
        this.f36351f = str4;
    }

    @Override // com.google.android.gms.internal.ads.wv3
    public final IBinder a() {
        return this.f36346a;
    }

    @Override // com.google.android.gms.internal.ads.wv3
    public final String b() {
        return this.f36347b;
    }

    @Override // com.google.android.gms.internal.ads.wv3
    public final int c() {
        return this.f36348c;
    }

    @Override // com.google.android.gms.internal.ads.wv3
    public final float d() {
        return this.f36349d;
    }

    @Override // com.google.android.gms.internal.ads.wv3
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof wv3) {
            wv3 wv3Var = (wv3) obj;
            if (this.f36346a.equals(wv3Var.a()) && ((str = this.f36347b) != null ? str.equals(wv3Var.b()) : wv3Var.b() == null) && this.f36348c == wv3Var.c() && Float.floatToIntBits(this.f36349d) == Float.floatToIntBits(wv3Var.d())) {
                wv3Var.e();
                wv3Var.f();
                wv3Var.g();
                if (this.f36350e == wv3Var.h()) {
                    wv3Var.i();
                    String str2 = this.f36351f;
                    if (str2 != null ? str2.equals(wv3Var.j()) : wv3Var.j() == null) {
                        wv3Var.k();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.wv3
    public final int f() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.wv3
    public final String g() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wv3
    public final int h() {
        return this.f36350e;
    }

    public final int hashCode() {
        int iHashCode = this.f36346a.hashCode() ^ 1000003;
        String str = this.f36347b;
        int iHashCode2 = (((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f36348c) * 1000003) ^ Float.floatToIntBits(this.f36349d);
        int i11 = this.f36350e;
        String str2 = this.f36351f;
        return ((((iHashCode2 * 1525764945) ^ i11) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    @Override // com.google.android.gms.internal.ads.wv3
    public final String i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wv3
    public final String j() {
        return this.f36351f;
    }

    @Override // com.google.android.gms.internal.ads.wv3
    public final String k() {
        return null;
    }

    public final String toString() {
        String string = this.f36346a.toString();
        int length = string.length();
        String str = this.f36347b;
        int length2 = String.valueOf(str).length();
        int i11 = this.f36348c;
        int length3 = String.valueOf(i11).length();
        float f11 = this.f36349d;
        int length4 = String.valueOf(f11).length();
        int i12 = this.f36350e;
        int length5 = String.valueOf(i12).length();
        String str2 = this.f36351f;
        StringBuilder sb2 = new StringBuilder(length + 46 + length2 + 16 + length3 + 23 + length4 + 65 + length5 + 33 + String.valueOf(str2).length() + 30);
        sb2.append("OverlayDisplayShowRequest{windowToken=");
        sb2.append(string);
        sb2.append(", appId=");
        sb2.append(str);
        sb2.append(", layoutGravity=");
        sb2.append(i11);
        sb2.append(", layoutVerticalMargin=");
        sb2.append(f11);
        sb2.append(", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=");
        sb2.append(i12);
        sb2.append(", deeplinkUrl=null, adFieldEnifd=");
        sb2.append(str2);
        sb2.append(", thirdPartyAuthCallerId=null}");
        return sb2.toString();
    }
}
