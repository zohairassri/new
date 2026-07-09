package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class mo5 extends wo5 implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f30926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f30927f;

    public mo5(int i11, zu zuVar, int i12, po5 po5Var, int i13) {
        super(i11, zuVar, i12);
        this.f30926e = ac5.c(i13, po5Var.U) ? 1 : 0;
        this.f30927f = this.f37511d.c();
    }

    @Override // com.google.android.gms.internal.ads.wo5
    public final /* bridge */ /* synthetic */ boolean a(wo5 wo5Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(mo5 mo5Var) {
        return Integer.compare(this.f30927f, mo5Var.f30927f);
    }

    @Override // com.google.android.gms.internal.ads.wo5
    public final int zza() {
        return this.f30926e;
    }
}
