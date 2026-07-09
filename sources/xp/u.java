package xp;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class u implements vq.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Set f137953b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Set f137952a = Collections.newSetFromMap(new ConcurrentHashMap());

    u(Collection collection) {
        this.f137952a.addAll(collection);
    }

    static u b(Collection collection) {
        return new u((Set) collection);
    }

    private synchronized void d() {
        try {
            Iterator it = this.f137952a.iterator();
            while (it.hasNext()) {
                this.f137953b.add(((vq.b) it.next()).get());
            }
            this.f137952a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized void a(vq.b bVar) {
        try {
            if (this.f137953b == null) {
                this.f137952a.add(bVar);
            } else {
                this.f137953b.add(bVar.get());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // vq.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f137953b == null) {
            synchronized (this) {
                try {
                    if (this.f137953b == null) {
                        this.f137953b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f137953b);
    }
}
