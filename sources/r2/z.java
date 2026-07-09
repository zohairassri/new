package r2;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f123606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f123607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MotionEvent f123608c;

    public z(long j11, List list, MotionEvent motionEvent) {
        this.f123606a = j11;
        this.f123607b = list;
        this.f123608c = motionEvent;
    }

    public final MotionEvent a() {
        return this.f123608c;
    }

    public final List b() {
        return this.f123607b;
    }

    public final void c(MotionEvent motionEvent) {
        this.f123608c = motionEvent;
    }
}
