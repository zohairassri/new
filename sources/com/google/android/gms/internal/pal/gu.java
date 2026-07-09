package com.google.android.gms.internal.pal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class gu extends hu implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f41385a = new ArrayList();

    @Override // com.google.android.gms.internal.pal.hu
    public final int a() {
        if (this.f41385a.size() == 1) {
            return ((hu) this.f41385a.get(0)).a();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.pal.hu
    public final String b() {
        if (this.f41385a.size() == 1) {
            return ((hu) this.f41385a.get(0)).b();
        }
        throw new IllegalStateException();
    }

    public final int e() {
        return this.f41385a.size();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof gu) && ((gu) obj).f41385a.equals(this.f41385a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f41385a.hashCode();
    }

    public final hu i(int i11) {
        return (hu) this.f41385a.get(i11);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f41385a.iterator();
    }

    public final void j(hu huVar) {
        this.f41385a.add(huVar);
    }
}
