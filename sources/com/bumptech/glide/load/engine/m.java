package com.bumptech.glide.load.engine;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class m implements ed.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f19109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f19110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f19111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Class f19112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Class f19113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ed.e f19114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f19115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ed.h f19116i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19117j;

    m(Object obj, ed.e eVar, int i11, int i12, Map map, Class cls, Class cls2, ed.h hVar) {
        this.f19109b = zd.k.d(obj);
        this.f19114g = (ed.e) zd.k.e(eVar, "Signature must not be null");
        this.f19110c = i11;
        this.f19111d = i12;
        this.f19115h = (Map) zd.k.d(map);
        this.f19112e = (Class) zd.k.e(cls, "Resource class must not be null");
        this.f19113f = (Class) zd.k.e(cls2, "Transcode class must not be null");
        this.f19116i = (ed.h) zd.k.d(hVar);
    }

    @Override // ed.e
    public void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // ed.e
    public boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f19109b.equals(mVar.f19109b) && this.f19114g.equals(mVar.f19114g) && this.f19111d == mVar.f19111d && this.f19110c == mVar.f19110c && this.f19115h.equals(mVar.f19115h) && this.f19112e.equals(mVar.f19112e) && this.f19113f.equals(mVar.f19113f) && this.f19116i.equals(mVar.f19116i)) {
                return true;
            }
        }
        return false;
    }

    @Override // ed.e
    public int hashCode() {
        if (this.f19117j == 0) {
            int iHashCode = this.f19109b.hashCode();
            this.f19117j = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f19114g.hashCode()) * 31) + this.f19110c) * 31) + this.f19111d;
            this.f19117j = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f19115h.hashCode();
            this.f19117j = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f19112e.hashCode();
            this.f19117j = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f19113f.hashCode();
            this.f19117j = iHashCode5;
            this.f19117j = (iHashCode5 * 31) + this.f19116i.hashCode();
        }
        return this.f19117j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f19109b + ", width=" + this.f19110c + ", height=" + this.f19111d + ", resourceClass=" + this.f19112e + ", transcodeClass=" + this.f19113f + ", signature=" + this.f19114g + ", hashCode=" + this.f19117j + ", transformations=" + this.f19115h + ", options=" + this.f19116i + '}';
    }
}
