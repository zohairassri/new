package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class u14 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Set f35873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Collection f35874b;

    u14() {
    }

    abstract Set a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f35873a;
        if (set != null) {
            return set;
        }
        Set setA = a();
        this.f35873a = setA;
        return setA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f35874b;
        if (collection != null) {
            return collection;
        }
        t14 t14Var = new t14(this);
        this.f35874b = t14Var;
        return t14Var;
    }
}
