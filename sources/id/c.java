package id;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import zd.k;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f103609a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f103610b = new b();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Lock f103611a = new ReentrantLock();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f103612b;

        a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue f103613a = new ArrayDeque();

        b() {
        }

        a a() {
            a aVar;
            synchronized (this.f103613a) {
                aVar = (a) this.f103613a.poll();
            }
            return aVar == null ? new a() : aVar;
        }

        void b(a aVar) {
            synchronized (this.f103613a) {
                try {
                    if (this.f103613a.size() < 10) {
                        this.f103613a.offer(aVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    c() {
    }

    void a(String str) {
        a aVarA;
        synchronized (this) {
            try {
                aVarA = (a) this.f103609a.get(str);
                if (aVarA == null) {
                    aVarA = this.f103610b.a();
                    this.f103609a.put(str, aVarA);
                }
                aVarA.f103612b++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVarA.f103611a.lock();
    }

    void b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) k.d(this.f103609a.get(str));
                int i11 = aVar.f103612b;
                if (i11 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f103612b);
                }
                int i12 = i11 - 1;
                aVar.f103612b = i12;
                if (i12 == 0) {
                    a aVar2 = (a) this.f103609a.remove(str);
                    if (!aVar2.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                    this.f103610b.b(aVar2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVar.f103611a.unlock();
    }
}
