package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class ad implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vc f23253b;

    public ad(int i11, vc vcVar) {
        this.f23252a = i11;
        this.f23253b = vcVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.f23252a, ((ad) obj).f23252a);
    }
}
