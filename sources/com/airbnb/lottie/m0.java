package com.airbnb.lottie;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f18307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f18308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f18309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bitmap f18310f;

    public m0(int i11, int i12, String str, String str2, String str3) {
        this.f18305a = i11;
        this.f18306b = i12;
        this.f18307c = str;
        this.f18308d = str2;
        this.f18309e = str3;
    }

    public m0 a(float f11) {
        m0 m0Var = new m0((int) (this.f18305a * f11), (int) (this.f18306b * f11), this.f18307c, this.f18308d, this.f18309e);
        Bitmap bitmap = this.f18310f;
        if (bitmap != null) {
            m0Var.g(Bitmap.createScaledBitmap(bitmap, m0Var.f18305a, m0Var.f18306b, true));
        }
        return m0Var;
    }

    public Bitmap b() {
        return this.f18310f;
    }

    public String c() {
        return this.f18308d;
    }

    public int d() {
        return this.f18306b;
    }

    public String e() {
        return this.f18307c;
    }

    public int f() {
        return this.f18305a;
    }

    public void g(Bitmap bitmap) {
        this.f18310f = bitmap;
    }
}
