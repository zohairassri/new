package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import java.util.ArrayDeque;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class rk3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MotionEvent f34246b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque f34245a = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private pk3 f34247c = new pk3();

    rk3() {
    }

    public final synchronized void a(MotionEvent motionEvent) {
        try {
            if (motionEvent.getAction() == 1) {
                this.f34246b = MotionEvent.obtain(motionEvent);
            }
            this.f34247c.a(motionEvent);
            ArrayDeque arrayDeque = this.f34245a;
            if (arrayDeque.size() >= 6) {
                arrayDeque.remove();
            }
            arrayDeque.add(new qk3(motionEvent));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Map map) {
        try {
            MotionEvent motionEvent = this.f34246b;
            if (motionEvent != null) {
                map.put("nv", motionEvent);
            }
            map.put("oe", this.f34247c);
            ArrayDeque arrayDeque = this.f34245a;
            map.put("ro", arrayDeque.toArray(new qk3[arrayDeque.size()]));
            this.f34247c = new pk3();
            arrayDeque.clear();
            MotionEvent motionEvent2 = this.f34246b;
            if (motionEvent2 != null) {
                motionEvent2.recycle();
                this.f34246b = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
