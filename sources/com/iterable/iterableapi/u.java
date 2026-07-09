package com.iterable.iterableapi;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class u implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f47861a = new ArrayList();

    u() {
    }

    @Override // com.iterable.iterableapi.w
    public synchronized List a() {
        return new ArrayList(this.f47861a);
    }

    @Override // com.iterable.iterableapi.w
    public synchronized void b(v vVar) {
        this.f47861a.remove(vVar);
    }

    @Override // com.iterable.iterableapi.w
    public String c(String str) {
        return null;
    }

    @Override // com.iterable.iterableapi.w
    public synchronized v d(String str) {
        for (v vVar : this.f47861a) {
            if (vVar.g().equals(str)) {
                return vVar;
            }
        }
        return null;
    }

    @Override // com.iterable.iterableapi.w
    public synchronized void f(v vVar) {
        this.f47861a.add(vVar);
    }
}
