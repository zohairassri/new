package com.google.android.gms.internal.ads;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class n54 extends m54 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f31217a = AtomicReferenceFieldUpdater.newUpdater(p54.class, Set.class, QueryKeys.HOST);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f31218b = AtomicIntegerFieldUpdater.newUpdater(p54.class, QueryKeys.VIEW_TITLE);

    /* synthetic */ n54(byte[] bArr) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.m54
    final void a(p54 p54Var, Set set, Set set2) {
        androidx.concurrent.futures.b.a(f31217a, p54Var, null, set2);
    }

    @Override // com.google.android.gms.internal.ads.m54
    final int b(p54 p54Var) {
        return f31218b.decrementAndGet(p54Var);
    }
}
