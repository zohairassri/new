package mj;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class j implements nj.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ve0.a f116371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ve0.a f116372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ve0.a f116373c;

    public j(ve0.a aVar, ve0.a aVar2, ve0.a aVar3) {
        this.f116371a = aVar;
        this.f116372b = aVar2;
        this.f116373c = aVar3;
    }

    public static j a(ve0.a aVar, ve0.a aVar2, ve0.a aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, vj.a aVar, vj.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // ve0.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c((Context) this.f116371a.get(), (vj.a) this.f116372b.get(), (vj.a) this.f116373c.get());
    }
}
