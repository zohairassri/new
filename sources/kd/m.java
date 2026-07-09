package kd;

import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zd.h f110557a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends zd.h {
        a(long j11) {
            super(j11);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // zd.h
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void j(b bVar, Object obj) {
            bVar.c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Queue f110559d = zd.l.g(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f110560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f110561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f110562c;

        private b() {
        }

        static b a(Object obj, int i11, int i12) {
            b bVar;
            Queue queue = f110559d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b();
            }
            bVar.b(obj, i11, i12);
            return bVar;
        }

        private void b(Object obj, int i11, int i12) {
            this.f110562c = obj;
            this.f110561b = i11;
            this.f110560a = i12;
        }

        public void c() {
            Queue queue = f110559d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f110561b == bVar.f110561b && this.f110560a == bVar.f110560a && this.f110562c.equals(bVar.f110562c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f110560a * 31) + this.f110561b) * 31) + this.f110562c.hashCode();
        }
    }

    public m(long j11) {
        this.f110557a = new a(j11);
    }

    public Object a(Object obj, int i11, int i12) {
        b bVarA = b.a(obj, i11, i12);
        Object objG = this.f110557a.g(bVarA);
        bVarA.c();
        return objG;
    }

    public void b(Object obj, int i11, int i12, Object obj2) {
        this.f110557a.k(b.a(obj, i11, i12), obj2);
    }
}
