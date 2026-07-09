package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class li3 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Runnable f30238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f30239b;

    li3(Runnable runnable, long j11) {
        this.f30238a = runnable;
        this.f30239b = j11;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f30239b, ((li3) obj).f30239b);
    }
}
