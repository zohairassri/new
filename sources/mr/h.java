package mr;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class h implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f116916a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f116917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f116918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f116919d;

    private h(View view, Runnable runnable, Runnable runnable2) {
        this.f116917b = new AtomicReference(view);
        this.f116918c = runnable;
        this.f116919d = runnable2;
    }

    public static void a(View view, Runnable runnable, Runnable runnable2) {
        view.getViewTreeObserver().addOnPreDrawListener(new h(view, runnable, runnable2));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        View view = (View) this.f116917b.getAndSet(null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f116916a.post(this.f116918c);
        this.f116916a.postAtFrontOfQueue(this.f116919d);
        return true;
    }
}
