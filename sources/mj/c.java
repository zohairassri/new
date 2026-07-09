package mj;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f116359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vj.a f116360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vj.a f116361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f116362d;

    c(Context context, vj.a aVar, vj.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f116359a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f116360b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f116361c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f116362d = str;
    }

    @Override // mj.h
    public Context b() {
        return this.f116359a;
    }

    @Override // mj.h
    public String c() {
        return this.f116362d;
    }

    @Override // mj.h
    public vj.a d() {
        return this.f116361c;
    }

    @Override // mj.h
    public vj.a e() {
        return this.f116360b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f116359a.equals(hVar.b()) && this.f116360b.equals(hVar.e()) && this.f116361c.equals(hVar.d()) && this.f116362d.equals(hVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f116362d.hashCode() ^ ((((((this.f116359a.hashCode() ^ 1000003) * 1000003) ^ this.f116360b.hashCode()) * 1000003) ^ this.f116361c.hashCode()) * 1000003);
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f116359a + ", wallClock=" + this.f116360b + ", monotonicClock=" + this.f116361c + ", backendName=" + this.f116362d + "}";
    }
}
