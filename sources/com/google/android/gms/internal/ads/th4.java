package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class th4 implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f35483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f35484b;

    th4(wh4 wh4Var, List list, List list2) {
        this.f35483a = list;
        this.f35484b = list2;
        Objects.requireNonNull(wh4Var);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new vh4(this.f35483a.iterator(), this.f35484b.iterator(), null);
    }
}
