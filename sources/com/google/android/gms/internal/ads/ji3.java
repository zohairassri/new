package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ji3 implements hi3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f29076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue f29077b = new PriorityQueue();

    public ji3(Executor executor, jg3 jg3Var) {
        this.f29076a = executor;
    }

    @Override // com.google.android.gms.internal.ads.hi3
    public final void a(Runnable runnable, long j11) {
        if (j11 <= 0) {
            this.f29076a.execute(runnable);
            return;
        }
        li3 li3Var = new li3(runnable, System.currentTimeMillis() + j11);
        Queue queue = this.f29077b;
        synchronized (queue) {
            queue.add(li3Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.hi3
    public final void zzb() {
        Queue queue = this.f29077b;
        synchronized (queue) {
            try {
                if (queue.isEmpty()) {
                    return;
                }
                PriorityQueue priorityQueue = new PriorityQueue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (li3 li3Var = (li3) queue.peek(); li3Var != null && li3Var.f30239b <= jCurrentTimeMillis; li3Var = (li3) queue.peek()) {
                    priorityQueue.add(li3Var);
                }
                Iterator it = priorityQueue.iterator();
                while (it.hasNext()) {
                    try {
                        this.f29076a.execute(((li3) it.next()).f30238a);
                    } catch (RuntimeException unused) {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
