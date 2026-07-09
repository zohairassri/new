package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class zzhc extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39783a;

    public zzhc(int i11) {
        this.f39783a = i11;
    }

    public zzhc(String str, int i11) {
        super(str);
        this.f39783a = i11;
    }

    public zzhc(String str, Throwable th2, int i11) {
        super(str, th2);
        this.f39783a = i11;
    }

    public zzhc(Throwable th2, int i11) {
        super(th2);
        this.f39783a = i11;
    }
}
