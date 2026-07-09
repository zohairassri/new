package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class nz3 extends qz3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ uz3 f31712e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    nz3(uz3 uz3Var) {
        super(uz3Var, null);
        Objects.requireNonNull(uz3Var);
        this.f31712e = uz3Var;
    }

    @Override // com.google.android.gms.internal.ads.qz3
    final /* bridge */ /* synthetic */ Object a(int i11) {
        return new sz3(this.f31712e, i11);
    }
}
