package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class q1 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Looper f40649a;

    public q1(Looper looper) {
        super(looper);
        this.f40649a = Looper.getMainLooper();
    }
}
