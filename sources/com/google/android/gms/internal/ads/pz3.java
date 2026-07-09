package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class pz3 extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ uz3 f33321a;

    /* synthetic */ pz3(uz3 uz3Var, byte[] bArr) {
        Objects.requireNonNull(uz3Var);
        this.f33321a = uz3Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f33321a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        uz3 uz3Var = this.f33321a;
        Map mapH = uz3Var.h();
        if (mapH != null) {
            return mapH.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iN = uz3Var.n(entry.getKey());
            if (iN != -1 && Objects.equals(uz3Var.z(iN), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        uz3 uz3Var = this.f33321a;
        Map mapH = uz3Var.h();
        return mapH != null ? mapH.entrySet().iterator() : new nz3(uz3Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM;
        int iE;
        uz3 uz3Var = this.f33321a;
        Map mapH = uz3Var.h();
        if (mapH != null) {
            return mapH.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (uz3Var.g() || (iE = vz3.e(entry.getKey(), entry.getValue(), (iM = uz3Var.m()), uz3Var.q(), uz3Var.r(), uz3Var.s(), uz3Var.t())) == -1) {
            return false;
        }
        uz3Var.j(iE, iM);
        uz3Var.E(uz3Var.D() - 1);
        uz3Var.i();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f33321a.size();
    }
}
