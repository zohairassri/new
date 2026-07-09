package com.google.android.gms.internal.pal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f41685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f41686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f41687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ve f41688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nf f41689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f41690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f41691g;

    qf(Object obj, byte[] bArr, int i11, int i12, int i13, ve veVar, nf nfVar) {
        this.f41685a = obj;
        this.f41686b = Arrays.copyOf(bArr, bArr.length);
        this.f41690f = i11;
        this.f41691g = i12;
        this.f41687c = i13;
        this.f41688d = veVar;
        this.f41689e = nfVar;
    }

    public final int a() {
        return this.f41687c;
    }

    public final nf b() {
        return this.f41689e;
    }

    public final Object c() {
        return this.f41685a;
    }

    public final byte[] d() {
        byte[] bArr = this.f41686b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int e() {
        return this.f41690f;
    }

    public final int f() {
        return this.f41691g;
    }
}
