package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class r34 implements Closeable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final q34 f33976c = q34.f33414a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Deque f33977a = new ArrayDeque(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Throwable f33978b;

    r34(q34 q34Var) {
    }

    public static r34 a() {
        return new r34(f33976c);
    }

    public final Closeable c(Closeable closeable) {
        this.f33977a.addFirst(closeable);
        return closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Throwable th2 = this.f33978b;
        while (true) {
            Deque deque = this.f33977a;
            if (deque.isEmpty()) {
                break;
            }
            Closeable closeable = (Closeable) deque.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else if (th2 != th3) {
                    try {
                        th2.addSuppressed(th3);
                    } catch (Throwable unused) {
                        p34.f32690a.logp(Level.WARNING, "com.google.common.io.Closer", "<init>", "Suppressing exception thrown when closing ".concat(String.valueOf(closeable)), th3);
                    }
                }
            }
        }
        if (this.f33978b != null || th2 == null) {
            return;
        }
        gy3.a(th2, IOException.class);
        gy3.b(th2);
        throw new AssertionError(th2);
    }

    public final RuntimeException e(Throwable th2) throws Throwable {
        this.f33978b = th2;
        gy3.a(th2, IOException.class);
        gy3.b(th2);
        throw new RuntimeException(th2);
    }
}
