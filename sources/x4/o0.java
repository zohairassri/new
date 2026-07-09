package x4;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map f137140a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class a {
        static float a(VelocityTracker velocityTracker, int i11) {
            return velocityTracker.getAxisVelocity(i11);
        }
    }

    public static void a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f137140a.containsKey(velocityTracker)) {
                f137140a.put(velocityTracker, new p0());
            }
            ((p0) f137140a.get(velocityTracker)).a(motionEvent);
        }
    }

    public static void b(VelocityTracker velocityTracker, int i11) {
        c(velocityTracker, i11, Float.MAX_VALUE);
    }

    public static void c(VelocityTracker velocityTracker, int i11, float f11) {
        velocityTracker.computeCurrentVelocity(i11, f11);
        p0 p0VarE = e(velocityTracker);
        if (p0VarE != null) {
            p0VarE.c(i11, f11);
        }
    }

    public static float d(VelocityTracker velocityTracker, int i11) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(velocityTracker, i11);
        }
        if (i11 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i11 == 1) {
            return velocityTracker.getYVelocity();
        }
        p0 p0VarE = e(velocityTracker);
        if (p0VarE != null) {
            return p0VarE.d(i11);
        }
        return 0.0f;
    }

    private static p0 e(VelocityTracker velocityTracker) {
        return (p0) f137140a.get(velocityTracker);
    }
}
