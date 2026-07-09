package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class zzecr extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f39745a;

    public zzecr(int i11) {
        this.f39745a = i11;
    }

    public final int a() {
        return this.f39745a;
    }

    public zzecr(int i11, String str) {
        super(str);
        this.f39745a = i11;
    }

    public zzecr(int i11, String str, Throwable th2) {
        super(str, th2);
        this.f39745a = 1;
    }
}
