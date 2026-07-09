package com.google.android.gms.internal.pal;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class o8 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f41619e = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f41620a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f41621b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f41622c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f41623d = false;

    o8(Context context, Executor executor, String[] strArr) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new n8(this));
        } catch (IllegalArgumentException | NoSuchMethodError unused) {
        }
    }

    public static o8 d(Context context, Executor executor) {
        return new o8(context, executor, f41619e);
    }

    public final long b() {
        long j11 = this.f41622c;
        this.f41622c = -1L;
        return j11;
    }

    public final long c() {
        if (this.f41623d) {
            return this.f41621b - this.f41620a;
        }
        return -1L;
    }

    public final void h() {
        if (this.f41623d) {
            this.f41621b = System.currentTimeMillis();
        }
    }
}
