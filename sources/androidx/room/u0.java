package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class u0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f12575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque f12576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f12577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f12578d;

    public u0(Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f12575a = executor;
        this.f12576b = new ArrayDeque();
        this.f12578d = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Runnable runnable, u0 u0Var) {
        try {
            runnable.run();
        } finally {
            u0Var.c();
        }
    }

    public final void c() {
        synchronized (this.f12578d) {
            try {
                Object objPoll = this.f12576b.poll();
                Runnable runnable = (Runnable) objPoll;
                this.f12577c = runnable;
                if (objPoll != null) {
                    this.f12575a.execute(runnable);
                }
                Unit unit = Unit.f111650a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        synchronized (this.f12578d) {
            try {
                this.f12576b.offer(new Runnable() { // from class: androidx.room.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        u0.b(command, this);
                    }
                });
                if (this.f12577c == null) {
                    c();
                }
                Unit unit = Unit.f111650a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
