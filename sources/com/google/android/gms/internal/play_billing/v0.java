package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class v0 implements Comparable, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparable f42613a = "";

    v0(Comparable comparable) {
    }

    public abstract int a(v0 v0Var);

    abstract void b(StringBuilder sb2);

    abstract void c(StringBuilder sb2);

    public final boolean equals(Object obj) {
        if (obj instanceof v0) {
            try {
                if (a((v0) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();
}
