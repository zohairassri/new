package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class s0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static WeakReference f46681d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f46682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o0 f46683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f46684c;

    private s0(SharedPreferences sharedPreferences, Executor executor) {
        this.f46684c = executor;
        this.f46682a = sharedPreferences;
    }

    public static synchronized s0 a(Context context, Executor executor) {
        s0 s0Var;
        try {
            WeakReference weakReference = f46681d;
            s0Var = weakReference != null ? (s0) weakReference.get() : null;
            if (s0Var == null) {
                s0Var = new s0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                s0Var.c();
                f46681d = new WeakReference(s0Var);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return s0Var;
    }

    private synchronized void c() {
        this.f46683b = o0.c(this.f46682a, "topic_operation_queue", ",", this.f46684c);
    }

    synchronized r0 b() {
        return r0.a(this.f46683b.e());
    }

    synchronized boolean d(r0 r0Var) {
        return this.f46683b.f(r0Var.e());
    }
}
