package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class op {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f32056e = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f32057a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f32058b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f32059c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f32060d = false;

    op(Context context, Executor executor, String[] strArr) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new np(this));
        } catch (IllegalArgumentException | NoSuchMethodError unused) {
        }
    }

    public static op a(Context context, Executor executor) {
        return new op(context, executor, f32056e);
    }

    public final void b() {
        if (this.f32060d) {
            this.f32058b = System.currentTimeMillis();
        }
    }

    public final long c() {
        if (this.f32060d) {
            return this.f32058b - this.f32057a;
        }
        return -1L;
    }

    public final long d() {
        long j11 = this.f32059c;
        this.f32059c = -1L;
        return j11;
    }

    final /* synthetic */ void e(long j11) {
        this.f32057a = j11;
    }

    final /* synthetic */ long f() {
        return this.f32058b;
    }

    final /* synthetic */ void g(long j11) {
        this.f32059c = j11;
    }

    final /* synthetic */ void h(boolean z11) {
        this.f32060d = z11;
    }
}
