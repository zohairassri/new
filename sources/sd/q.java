package sd;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f126455a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f126456b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f126457c;

    public boolean a(vd.c cVar) {
        boolean z11 = true;
        if (cVar == null) {
            return true;
        }
        boolean zRemove = this.f126455a.remove(cVar);
        if (!this.f126456b.remove(cVar) && !zRemove) {
            z11 = false;
        }
        if (z11) {
            cVar.clear();
        }
        return z11;
    }

    public void b() {
        Iterator it = zd.l.k(this.f126455a).iterator();
        while (it.hasNext()) {
            a((vd.c) it.next());
        }
        this.f126456b.clear();
    }

    public void c() {
        this.f126457c = true;
        for (vd.c cVar : zd.l.k(this.f126455a)) {
            if (cVar.isRunning() || cVar.a()) {
                cVar.clear();
                this.f126456b.add(cVar);
            }
        }
    }

    public void d() {
        this.f126457c = true;
        for (vd.c cVar : zd.l.k(this.f126455a)) {
            if (cVar.isRunning()) {
                cVar.pause();
                this.f126456b.add(cVar);
            }
        }
    }

    public void e() {
        for (vd.c cVar : zd.l.k(this.f126455a)) {
            if (!cVar.a() && !cVar.g()) {
                cVar.clear();
                if (this.f126457c) {
                    this.f126456b.add(cVar);
                } else {
                    cVar.j();
                }
            }
        }
    }

    public void f() {
        this.f126457c = false;
        for (vd.c cVar : zd.l.k(this.f126455a)) {
            if (!cVar.a() && !cVar.isRunning()) {
                cVar.j();
            }
        }
        this.f126456b.clear();
    }

    public void g(vd.c cVar) {
        this.f126455a.add(cVar);
        if (!this.f126457c) {
            cVar.j();
            return;
        }
        cVar.clear();
        Log.isLoggable("RequestTracker", 2);
        this.f126456b.add(cVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f126455a.size() + ", isPaused=" + this.f126457c + "}";
    }
}
