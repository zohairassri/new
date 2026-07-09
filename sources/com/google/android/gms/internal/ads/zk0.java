package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class zk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f39246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f39247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ al0 f39248c;

    public zk0(al0 al0Var) {
        Objects.requireNonNull(al0Var);
        this.f39248c = al0Var;
        this.f39246a = -1L;
        this.f39247b = -1L;
    }

    public final long a() {
        return this.f39247b;
    }

    public final void b() {
        this.f39247b = this.f39248c.k().b();
    }

    public final void c() {
        this.f39246a = this.f39248c.k().b();
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f39246a);
        bundle.putLong("tclose", this.f39247b);
        return bundle;
    }
}
