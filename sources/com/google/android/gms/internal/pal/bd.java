package com.google.android.gms.internal.pal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class bd extends wc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f41126a;

    bd(Object obj) {
        this.f41126a = obj;
    }

    @Override // com.google.android.gms.internal.pal.wc
    public final wc a(tc tcVar) {
        return new bd(tcVar.zza(this.f41126a));
    }

    @Override // com.google.android.gms.internal.pal.wc
    public final Object b() {
        return this.f41126a;
    }

    @Override // com.google.android.gms.internal.pal.wc
    public final Object c(Object obj) {
        return this.f41126a;
    }

    @Override // com.google.android.gms.internal.pal.wc
    public final boolean d() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bd) {
            return this.f41126a.equals(((bd) obj).f41126a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41126a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f41126a + ")";
    }
}
