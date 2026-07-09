package com.bumptech.glide;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class m implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private xd.e f19269a = xd.c.c();

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m clone() {
        try {
            return (m) super.clone();
        } catch (CloneNotSupportedException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final m c() {
        return f(xd.c.c());
    }

    final xd.e d() {
        return this.f19269a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            return zd.l.e(this.f19269a, ((m) obj).f19269a);
        }
        return false;
    }

    public final m f(xd.e eVar) {
        this.f19269a = (xd.e) zd.k.d(eVar);
        return e();
    }

    public int hashCode() {
        xd.e eVar = this.f19269a;
        if (eVar != null) {
            return eVar.hashCode();
        }
        return 0;
    }

    private m e() {
        return this;
    }
}
