package com.google.android.gms.internal.pal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class yk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f42247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f42248b;

    /* synthetic */ yk(Class cls, Class cls2, xk xkVar) {
        this.f42247a = cls;
        this.f42248b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yk)) {
            return false;
        }
        yk ykVar = (yk) obj;
        return ykVar.f42247a.equals(this.f42247a) && ykVar.f42248b.equals(this.f42248b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42247a, this.f42248b});
    }

    public final String toString() {
        return this.f42247a.getSimpleName() + " with serialization type: " + this.f42248b.getSimpleName();
    }
}
