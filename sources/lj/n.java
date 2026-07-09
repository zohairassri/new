package lj;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class n implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f114461a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f114462a;

        a(Runnable runnable) {
            this.f114462a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f114462a.run();
            } catch (Exception e11) {
                pj.a.c("Executor", "Background execution failure.", e11);
            }
        }
    }

    n(Executor executor) {
        this.f114461a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f114461a.execute(new a(runnable));
    }
}
