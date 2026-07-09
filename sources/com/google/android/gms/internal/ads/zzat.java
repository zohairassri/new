package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class zzat extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39543b;

    protected zzat(String str, Throwable th2, boolean z11, int i11) {
        super(str, th2);
        this.f39542a = z11;
        this.f39543b = i11;
    }

    public static zzat a(String str, Throwable th2) {
        return new zzat(str, th2, true, 0);
    }

    public static zzat b(String str, Throwable th2) {
        return new zzat(str, th2, true, 1);
    }

    public static zzat c(String str) {
        return new zzat(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        String strConcat = message != null ? message.concat(" ") : "";
        boolean z11 = this.f39542a;
        int i11 = this.f39543b;
        StringBuilder sb2 = new StringBuilder(strConcat.length() + 20 + String.valueOf(z11).length() + 11 + String.valueOf(i11).length() + 1);
        sb2.append(strConcat);
        sb2.append("{contentIsMalformed=");
        sb2.append(z11);
        sb2.append(", dataType=");
        sb2.append(i11);
        sb2.append("}");
        return sb2.toString();
    }
}
