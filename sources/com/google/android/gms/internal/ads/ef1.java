package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ef1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Executor f25719a;

    public static synchronized Executor a() {
        try {
            if (f25719a == null) {
                f25719a = yy2.B("ExoPlayer:BackgroundExecutor");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f25719a;
    }
}
