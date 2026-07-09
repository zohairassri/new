package com.google.android.gms.common;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f22622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f22623c;

    /* synthetic */ d0(String str, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, byte[] bArr) {
        this.f22621a = str;
        this.f22622b = z11;
        this.f22623c = z14;
    }

    final boolean a() {
        return this.f22623c;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [android.os.IBinder, com.google.android.gms.dynamic.a] */
    final zzp b(Context context) {
        return new zzp(this.f22621a, this.f22622b, false, com.google.android.gms.dynamic.b.k1(context), false, true, false);
    }
}
