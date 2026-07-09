package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class gl5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicLong f27139a = new AtomicLong();

    public gl5(long j11, zb4 zb4Var, Uri uri, Map map, long j12, long j13, long j14) {
    }

    public static long a() {
        return f27139a.getAndIncrement();
    }
}
