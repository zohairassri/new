package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class t24 extends ky3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Iterator f35241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Set f35242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Set f35243e;

    t24(u24 u24Var, Set set, Set set2) {
        this.f35242d = set;
        this.f35243e = set2;
        Objects.requireNonNull(u24Var);
        this.f35241c = set.iterator();
    }

    @Override // com.google.android.gms.internal.ads.ky3
    protected final Object zza() {
        Set set;
        Object next;
        do {
            Iterator it = this.f35241c;
            if (!it.hasNext()) {
                a();
                return null;
            }
            set = this.f35243e;
            next = it.next();
        } while (!set.contains(next));
        return next;
    }
}
