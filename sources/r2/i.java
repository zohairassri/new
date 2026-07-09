package r2;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f123511a = new i();

    private i() {
    }

    public final long a(MotionEvent motionEvent, int i11) {
        float rawX = motionEvent.getRawX(i11);
        return e2.f.e((((long) Float.floatToRawIntBits(motionEvent.getRawY(i11))) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32));
    }
}
