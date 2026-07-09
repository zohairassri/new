package tj;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class h implements nj.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ve0.a f130130a;

    public h(ve0.a aVar) {
        this.f130130a = aVar;
    }

    public static h a(ve0.a aVar) {
        return new h(aVar);
    }

    public static String c(Context context) {
        return (String) nj.d.c(f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // ve0.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c((Context) this.f130130a.get());
    }
}
