package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.exoplayer2.video.spherical.b;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class h extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, b.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f21843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f21844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final GestureDetector f21845e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointF f21841a = new PointF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PointF f21842b = new PointF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile float f21846f = 3.1415927f;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {
        void b(PointF pointF);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    public h(Context context, a aVar, float f11) {
        this.f21843c = aVar;
        this.f21844d = f11;
        this.f21845e = new GestureDetector(context, this);
    }

    @Override // com.google.android.exoplayer2.video.spherical.b.a
    public void a(float[] fArr, float f11) {
        this.f21846f = -f11;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f21841a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
        float x11 = (motionEvent2.getX() - this.f21841a.x) / this.f21844d;
        float y11 = motionEvent2.getY();
        PointF pointF = this.f21841a;
        float f13 = (y11 - pointF.y) / this.f21844d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d11 = this.f21846f;
        float fCos = (float) Math.cos(d11);
        float fSin = (float) Math.sin(d11);
        PointF pointF2 = this.f21842b;
        pointF2.x -= (fCos * x11) - (fSin * f13);
        float f14 = pointF2.y + (fSin * x11) + (fCos * f13);
        pointF2.y = f14;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f14));
        this.f21843c.b(this.f21842b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f21843c.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f21845e.onTouchEvent(motionEvent);
    }
}
