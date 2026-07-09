package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class za4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uri f39090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f39091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f39092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f39093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f39094e;

    /* synthetic */ za4(zb4 zb4Var, byte[] bArr) {
        this.f39090a = zb4Var.f39123a;
        this.f39091b = zb4Var.f39126d;
        this.f39092c = zb4Var.f39127e;
        this.f39093d = zb4Var.f39128f;
        this.f39094e = zb4Var.f39129g;
    }

    public final za4 a(Uri uri) {
        this.f39090a = uri;
        return this;
    }

    public final za4 b(Map map) {
        this.f39091b = map;
        return this;
    }

    public final za4 c(long j11) {
        this.f39092c = j11;
        return this;
    }

    public final za4 d(int i11) {
        this.f39094e = 6;
        return this;
    }

    public final zb4 e() {
        jx3.k(this.f39090a, "The uri must be set.");
        return new zb4(this.f39090a, 0L, 1, null, this.f39091b, this.f39092c, this.f39093d, null, this.f39094e, null, null);
    }

    public za4() {
        this.f39091b = Collections.EMPTY_MAP;
        this.f39093d = -1L;
    }
}
