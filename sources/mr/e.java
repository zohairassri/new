package mr;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class e implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f116910a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f116911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f116912c;

    private e(View view, Runnable runnable) {
        this.f116911b = new AtomicReference(view);
        this.f116912c = runnable;
    }

    public static /* synthetic */ void a(e eVar, View view) {
        eVar.getClass();
        view.getViewTreeObserver().removeOnDrawListener(eVar);
    }

    public static void b(View view, Runnable runnable) {
        view.getViewTreeObserver().addOnDrawListener(new e(view, runnable));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View view = (View) this.f116911b.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: mr.d
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                e.a(this.f116908a, view);
            }
        });
        this.f116910a.postAtFrontOfQueue(this.f116912c);
    }
}
