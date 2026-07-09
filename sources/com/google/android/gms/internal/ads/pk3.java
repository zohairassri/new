package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class pk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f32994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f32995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f32996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f32997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f32998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f32999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f33000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f33001h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f33002i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f33003j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f33004k;

    private static double b(MotionEvent motionEvent, double d11, double d12, double d13) {
        return d13 + Math.hypot(((double) motionEvent.getRawX()) - d11, ((double) motionEvent.getRawY()) - d12);
    }

    final /* synthetic */ void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f32994a++;
            this.f33000g = 0.0d;
            this.f32998e = motionEvent.getRawX();
            this.f32999f = motionEvent.getRawY();
            this.f33001h = motionEvent.getX();
            this.f33002i = motionEvent.getY();
            this.f33003j = motionEvent.getRawX();
            this.f33004k = motionEvent.getRawY();
            return;
        }
        if (action == 1) {
            this.f32996c++;
            this.f33000g = b(motionEvent, this.f32998e, this.f32999f, this.f33000g);
            this.f32998e = motionEvent.getRawX();
            this.f32999f = motionEvent.getRawY();
            return;
        }
        if (action != 2) {
            if (action != 3) {
                return;
            }
            this.f32997d++;
        } else {
            this.f32995b += (long) (motionEvent.getHistorySize() + 1);
            this.f33000g = b(motionEvent, this.f32998e, this.f32999f, this.f33000g);
            this.f32998e = motionEvent.getRawX();
            this.f32999f = motionEvent.getRawY();
        }
    }
}
