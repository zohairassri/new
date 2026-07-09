package com.google.android.gms.internal.pal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class oj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ne f41631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qe f41632b;

    public oj(ne neVar) {
        this.f41631a = neVar;
        this.f41632b = null;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        ne neVar = this.f41631a;
        return neVar != null ? neVar.zza(bArr, bArr2) : this.f41632b.zza(bArr, bArr2);
    }

    public oj(qe qeVar) {
        this.f41631a = null;
        this.f41632b = qeVar;
    }
}
