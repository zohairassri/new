package com.google.android.gms.internal.pal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class qc extends wc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final qc f41681a = new qc();

    private qc() {
    }

    @Override // com.google.android.gms.internal.pal.wc
    public final wc a(tc tcVar) {
        tcVar.getClass();
        return f41681a;
    }

    @Override // com.google.android.gms.internal.pal.wc
    public final Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.pal.wc
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.android.gms.internal.pal.wc
    public final Object c(Object obj) {
        return obj;
    }
}
