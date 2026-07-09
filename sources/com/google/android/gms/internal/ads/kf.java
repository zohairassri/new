package com.google.android.gms.internal.ads;

import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class kf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f29585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f29587e;

    public kf(int i11, int i12, int i13) {
        String string;
        if (i11 != Integer.MIN_VALUE) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 1);
            sb2.append(i11);
            sb2.append("/");
            string = sb2.toString();
        } else {
            string = "";
        }
        this.f29583a = string;
        this.f29584b = i12;
        this.f29585c = i13;
        this.f29586d = IntCompanionObject.MIN_VALUE;
        this.f29587e = "";
    }

    private final void d() {
        if (this.f29586d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final void a() {
        int i11 = this.f29586d;
        int i12 = i11 == Integer.MIN_VALUE ? this.f29584b : i11 + this.f29585c;
        this.f29586d = i12;
        String str = this.f29583a;
        StringBuilder sb2 = new StringBuilder(str.length() + String.valueOf(i12).length());
        sb2.append(str);
        sb2.append(i12);
        this.f29587e = sb2.toString();
    }

    public final int b() {
        d();
        return this.f29586d;
    }

    public final String c() {
        d();
        return this.f29587e;
    }
}
