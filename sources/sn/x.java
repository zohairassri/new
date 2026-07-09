package sn;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class x implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f127264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f127265b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f127266c;

    public x(Executor executor, d dVar) {
        this.f127264a = executor;
        this.f127266c = dVar;
    }

    @Override // sn.g0
    public final void b(Task task) {
        if (task.o()) {
            synchronized (this.f127265b) {
                try {
                    if (this.f127266c == null) {
                        return;
                    }
                    this.f127264a.execute(new w(this));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
