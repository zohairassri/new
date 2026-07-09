package lj;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class k implements nj.b {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final k f114459a = new k();
    }

    public static k a() {
        return a.f114459a;
    }

    public static Executor b() {
        return (Executor) nj.d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // ve0.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
