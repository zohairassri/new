package x4;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import io.agora.base.internal.video.FactorBitrateAdjuster;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f137083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f137084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f137085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f137086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private VelocityTracker f137087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f137088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f137089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f137090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f137091i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f137092j;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i11);
    }

    public h(Context context, i iVar) {
        this(context, iVar, new b() { // from class: x4.f
            @Override // x4.h.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i11) {
                h.c(context2, iArr, motionEvent, i11);
            }
        }, new a() { // from class: x4.g
            @Override // x4.h.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i11) {
                return h.f(velocityTracker, motionEvent, i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i11) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = u0.g(context, viewConfiguration, motionEvent.getDeviceId(), i11, motionEvent.getSource());
        iArr[1] = u0.f(context, viewConfiguration, motionEvent.getDeviceId(), i11, motionEvent.getSource());
    }

    private boolean d(MotionEvent motionEvent, int i11) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f137090h == source && this.f137091i == deviceId && this.f137089g == i11) {
            return false;
        }
        this.f137085c.a(this.f137083a, this.f137092j, motionEvent, i11);
        this.f137090h = source;
        this.f137091i = deviceId;
        this.f137089g = i11;
        return true;
    }

    private float e(MotionEvent motionEvent, int i11) {
        if (this.f137087e == null) {
            this.f137087e = VelocityTracker.obtain();
        }
        return this.f137086d.a(this.f137087e, motionEvent, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i11) {
        o0.a(velocityTracker, motionEvent);
        o0.b(velocityTracker, FactorBitrateAdjuster.FACTOR_BASE);
        return o0.d(velocityTracker, i11);
    }

    public void g(MotionEvent motionEvent, int i11) {
        boolean zD = d(motionEvent, i11);
        if (this.f137092j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f137087e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f137087e = null;
                return;
            }
            return;
        }
        float fE = e(motionEvent, i11) * this.f137084b.b();
        float fSignum = Math.signum(fE);
        if (zD || (fSignum != Math.signum(this.f137088f) && fSignum != 0.0f)) {
            this.f137084b.c();
        }
        float fAbs = Math.abs(fE);
        int[] iArr = this.f137092j;
        if (fAbs < iArr[0]) {
            return;
        }
        float fMax = Math.max(-r6, Math.min(fE, iArr[1]));
        this.f137088f = this.f137084b.a(fMax) ? fMax : 0.0f;
    }

    h(Context context, i iVar, b bVar, a aVar) {
        this.f137089g = -1;
        this.f137090h = -1;
        this.f137091i = -1;
        this.f137092j = new int[]{Integer.MAX_VALUE, 0};
        this.f137083a = context;
        this.f137084b = iVar;
        this.f137085c = bVar;
        this.f137086d = aVar;
    }
}
