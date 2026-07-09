package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class cw4 extends dw4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ dw4 f24761a;

    /* synthetic */ cw4(dw4 dw4Var, byte[] bArr) {
        Objects.requireNonNull(dw4Var);
        this.f24761a = dw4Var;
    }

    @Override // com.google.android.gms.internal.ads.dw4
    public final void a(ex4 ex4Var, Object obj) {
        throw null;
    }

    public final String toString() {
        String string = this.f24761a.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 21);
        sb2.append("NullSafeTypeAdapter[");
        sb2.append(string);
        sb2.append("]");
        return sb2.toString();
    }
}
