package com.bumptech.glide.load.engine;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class d implements ed.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ed.e f18980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ed.e f18981c;

    d(ed.e eVar, ed.e eVar2) {
        this.f18980b = eVar;
        this.f18981c = eVar2;
    }

    @Override // ed.e
    public void a(MessageDigest messageDigest) {
        this.f18980b.a(messageDigest);
        this.f18981c.a(messageDigest);
    }

    @Override // ed.e
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f18980b.equals(dVar.f18980b) && this.f18981c.equals(dVar.f18981c)) {
                return true;
            }
        }
        return false;
    }

    @Override // ed.e
    public int hashCode() {
        return (this.f18980b.hashCode() * 31) + this.f18981c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f18980b + ", signature=" + this.f18981c + '}';
    }
}
