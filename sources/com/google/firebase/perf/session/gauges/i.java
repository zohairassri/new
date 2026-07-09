package com.google.firebase.perf.session.gauges;

import android.app.ActivityManager;
import android.content.Context;
import mr.n;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final gr.a f46871e = gr.a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runtime f46872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ActivityManager f46873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ActivityManager.MemoryInfo f46874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f46875d;

    i(Context context) {
        this(Runtime.getRuntime(), context);
    }

    public int a() {
        return n.c(mr.k.f116929f.a(this.f46874c.totalMem));
    }

    public int b() {
        return n.c(mr.k.f116929f.a(this.f46872a.maxMemory()));
    }

    public int c() {
        return n.c(mr.k.f116927d.a(this.f46873b.getMemoryClass()));
    }

    i(Runtime runtime, Context context) {
        this.f46872a = runtime;
        this.f46875d = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f46873b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f46874c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
