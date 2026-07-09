package s6;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f125615a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f125615a.post(runnable);
    }
}
