package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.h;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Executor f12080h = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f12081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final androidx.recyclerview.widget.c f12082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Executor f12083c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f12085e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f12087g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f12084d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f12086f = Collections.EMPTY_LIST;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f12088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f12089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f12090c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Runnable f12091d;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class C0175a extends h.b {
            C0175a() {
            }

            @Override // androidx.recyclerview.widget.h.b
            public boolean a(int i11, int i12) {
                Object obj = a.this.f12088a.get(i11);
                Object obj2 = a.this.f12089b.get(i12);
                if (obj != null && obj2 != null) {
                    return d.this.f12082b.b().a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.h.b
            public boolean b(int i11, int i12) {
                Object obj = a.this.f12088a.get(i11);
                Object obj2 = a.this.f12089b.get(i12);
                return (obj == null || obj2 == null) ? obj == null && obj2 == null : d.this.f12082b.b().b(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.h.b
            public Object c(int i11, int i12) {
                Object obj = a.this.f12088a.get(i11);
                Object obj2 = a.this.f12089b.get(i12);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return d.this.f12082b.b().c(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.h.b
            public int d() {
                return a.this.f12089b.size();
            }

            @Override // androidx.recyclerview.widget.h.b
            public int e() {
                return a.this.f12088a.size();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h.e f12094a;

            b(h.e eVar) {
                this.f12094a = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f12087g == aVar.f12090c) {
                    dVar.c(aVar.f12089b, this.f12094a, aVar.f12091d);
                }
            }
        }

        a(List list, List list2, int i11, Runnable runnable) {
            this.f12088a = list;
            this.f12089b = list2;
            this.f12090c = i11;
            this.f12091d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f12083c.execute(new b(h.b(new C0175a())));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface b {
        void a(List list, List list2);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class c implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Handler f12096a = new Handler(Looper.getMainLooper());

        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f12096a.post(runnable);
        }
    }

    public d(n nVar, androidx.recyclerview.widget.c cVar) {
        this.f12081a = nVar;
        this.f12082b = cVar;
        if (cVar.c() != null) {
            this.f12083c = cVar.c();
        } else {
            this.f12083c = f12080h;
        }
    }

    private void d(List list, Runnable runnable) {
        Iterator it = this.f12084d.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(list, this.f12086f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(b bVar) {
        this.f12084d.add(bVar);
    }

    public List b() {
        return this.f12086f;
    }

    void c(List list, h.e eVar, Runnable runnable) {
        List list2 = this.f12086f;
        this.f12085e = list;
        this.f12086f = Collections.unmodifiableList(list);
        eVar.b(this.f12081a);
        d(list2, runnable);
    }

    public void e(List list) {
        f(list, null);
    }

    public void f(List list, Runnable runnable) {
        int i11 = this.f12087g + 1;
        this.f12087g = i11;
        List list2 = this.f12085e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List list3 = this.f12086f;
        if (list == null) {
            int size = list2.size();
            this.f12085e = null;
            this.f12086f = Collections.EMPTY_LIST;
            this.f12081a.b(0, size);
            d(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f12082b.a().execute(new a(list2, list, i11, runnable));
            return;
        }
        this.f12085e = list;
        this.f12086f = Collections.unmodifiableList(list);
        this.f12081a.a(0, list.size());
        d(list3, runnable);
    }
}
