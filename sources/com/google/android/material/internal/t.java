package com.google.android.material.internal;

import android.animation.TimeInterpolator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class t implements TimeInterpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimeInterpolator f44904a;

    public t(TimeInterpolator timeInterpolator) {
        this.f44904a = timeInterpolator;
    }

    public static TimeInterpolator a(boolean z11, TimeInterpolator timeInterpolator) {
        return z11 ? timeInterpolator : new t(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f11) {
        return 1.0f - this.f44904a.getInterpolation(f11);
    }
}
