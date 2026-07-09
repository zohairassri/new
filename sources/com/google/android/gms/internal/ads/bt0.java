package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class bt0 extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f24138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ct0 f24139b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bt0(ct0 ct0Var, Runnable runnable, String str, Runnable runnable2) {
        super(runnable, str);
        this.f24138a = runnable2;
        Objects.requireNonNull(ct0Var);
        this.f24139b = ct0Var;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f24139b.a());
        this.f24138a.run();
    }
}
