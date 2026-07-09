package x4;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GestureDetector f137097a;

    public k(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean a(MotionEvent motionEvent) {
        return this.f137097a.onTouchEvent(motionEvent);
    }

    public k(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f137097a = new GestureDetector(context, onGestureListener, handler);
    }
}
