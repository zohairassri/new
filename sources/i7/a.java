package i7;

import java.util.concurrent.Executor;
import k6.m;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface a extends Executor {

    /* JADX INFO: renamed from: i7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class C1231a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Executor f103243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f103244b;

        C1231a(Executor executor, m mVar) {
            this.f103243a = executor;
            this.f103244b = mVar;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f103243a.execute(runnable);
        }

        @Override // i7.a
        public void release() {
            this.f103244b.accept(this.f103243a);
        }
    }

    static a p0(Executor executor, m mVar) {
        return new C1231a(executor, mVar);
    }

    void release();
}
