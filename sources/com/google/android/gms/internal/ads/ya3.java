package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ya3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue f38386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f38387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque f38388c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private xa3 f38389d = null;

    public ya3() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f38386a = linkedBlockingQueue;
        this.f38387b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void c() {
        xa3 xa3Var = (xa3) this.f38388c.poll();
        this.f38389d = xa3Var;
        if (xa3Var != null) {
            xa3Var.executeOnExecutor(this.f38387b, new Object[0]);
        }
    }

    public final void a(xa3 xa3Var) {
        xa3Var.b(this);
        this.f38388c.add(xa3Var);
        if (this.f38389d == null) {
            c();
        }
    }

    public final void b(xa3 xa3Var) {
        this.f38389d = null;
        c();
    }
}
