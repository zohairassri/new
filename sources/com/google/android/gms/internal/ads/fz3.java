package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class fz3 implements w14 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Set f26760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Collection f26761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Map f26762c;

    fz3() {
    }

    @Override // com.google.android.gms.internal.ads.w14
    public Collection a() {
        Collection collection = this.f26761b;
        if (collection != null) {
            return collection;
        }
        Collection collectionE = e();
        this.f26761b = collectionE;
        return collectionE;
    }

    @Override // com.google.android.gms.internal.ads.w14
    public Map b() {
        Map map = this.f26762c;
        if (map != null) {
            return map;
        }
        Map mapG = g();
        this.f26762c = mapG;
        return mapG;
    }

    abstract Set d();

    abstract Collection e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w14) {
            return b().equals(((w14) obj).b());
        }
        return false;
    }

    Iterator f() {
        throw null;
    }

    abstract Map g();

    public boolean h(Object obj) {
        Iterator it = b().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final Set i() {
        Set set = this.f26760a;
        if (set != null) {
            return set;
        }
        Set setD = d();
        this.f26760a = setD;
        return setD;
    }

    public final String toString() {
        return b().toString();
    }
}
