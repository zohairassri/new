package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class i03 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Deque f28126a = new LinkedBlockingDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Callable f28127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u64 f28128c;

    public i03(Callable callable, u64 u64Var) {
        this.f28127b = callable;
        this.f28128c = u64Var;
    }

    public final synchronized void a(int i11) {
        Deque deque = this.f28126a;
        int size = i11 - deque.size();
        for (int i12 = 0; i12 < size; i12++) {
            deque.add(this.f28128c.M0(this.f28127b));
        }
    }

    public final synchronized com.google.common.util.concurrent.e b() {
        a(1);
        return (com.google.common.util.concurrent.e) this.f28126a.poll();
    }

    public final synchronized void c(com.google.common.util.concurrent.e eVar) {
        this.f28126a.addFirst(eVar);
    }
}
