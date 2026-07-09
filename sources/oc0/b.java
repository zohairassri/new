package oc0;

import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class b extends oc0.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f120305d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicLong f120306e = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Thread f120307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f120308c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1578b initialValue() {
            return new C1578b();
        }
    }

    /* JADX INFO: renamed from: oc0.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class C1578b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f120309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f120310b;

        C1578b() {
        }

        public boolean equals(Object obj) {
            if (obj instanceof C1578b) {
                return ((C1578b) obj).f120309a == this.f120309a;
            }
            android.support.v4.media.a.a(obj);
            throw null;
        }

        public int hashCode() {
            return this.f120310b;
        }
    }

    public b(boolean z11, boolean z12, ConcurrentMap concurrentMap) {
        super(concurrentMap);
        this.f120308c = z12;
        if (!z11) {
            this.f120307b = null;
            return;
        }
        Thread thread = new Thread(this);
        this.f120307b = thread;
        thread.setName("weak-ref-cleaner-" + f120306e.getAndIncrement());
        thread.setPriority(1);
        thread.setDaemon(true);
        thread.start();
    }

    @Override // oc0.a
    public /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // oc0.a, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    @Override // oc0.a
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
