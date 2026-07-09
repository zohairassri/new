package jf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ks.b f105603a;

    public d(ks.b clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f105603a = clock;
    }

    @Override // jf.g
    public long a() {
        return this.f105603a.a();
    }

    @Override // jf.g
    public long b() {
        return System.currentTimeMillis();
    }
}
