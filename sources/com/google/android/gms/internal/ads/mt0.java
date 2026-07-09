package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class mt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private VersionInfoParcel f31000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f31001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f31002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WeakReference f31003d;

    public final mt0 a(VersionInfoParcel versionInfoParcel) {
        this.f31000a = versionInfoParcel;
        return this;
    }

    public final mt0 b(Context context) {
        this.f31003d = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f31001b = context;
        return this;
    }

    public final mt0 c(long j11) {
        this.f31002c = j11;
        return this;
    }

    final /* synthetic */ VersionInfoParcel d() {
        return this.f31000a;
    }

    final /* synthetic */ Context e() {
        return this.f31001b;
    }

    final /* synthetic */ long f() {
        return this.f31002c;
    }

    final /* synthetic */ WeakReference g() {
        return this.f31003d;
    }
}
