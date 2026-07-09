package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class n14 extends c34 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ o14 f31169b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n14(o14 o14Var, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(o14Var);
        this.f31169b = o14Var;
    }

    @Override // com.google.android.gms.internal.ads.b34
    final Object a(Object obj) {
        return this.f31169b.f31745b.apply(obj);
    }
}
