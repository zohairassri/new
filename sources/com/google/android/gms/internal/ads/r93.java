package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class r93 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final r93 f34054b = new r93();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f34055a;

    private r93() {
    }

    public static r93 a() {
        return f34054b;
    }

    public final Context b() {
        return this.f34055a;
    }

    public final void c(Context context) {
        this.f34055a = context != null ? context.getApplicationContext() : null;
    }
}
