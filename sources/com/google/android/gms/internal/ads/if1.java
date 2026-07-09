package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class if1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Map f28376a = new HashMap();

    protected if1(Set set) {
        i0(set);
    }

    public final synchronized void g0(lh1 lh1Var) {
        h0(lh1Var.f30227a, lh1Var.f30228b);
    }

    public final synchronized void h0(Object obj, Executor executor) {
        this.f28376a.put(obj, executor);
    }

    public final synchronized void i0(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            g0((lh1) it.next());
        }
    }

    protected final synchronized void j0(final hf1 hf1Var) {
        for (Map.Entry entry : this.f28376a.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.gf1
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    try {
                        hf1Var.zza(key);
                    } catch (Throwable th2) {
                        xl.r.l().k(th2, "EventEmitter.notify");
                        bm.k1.l("Event emitter exception.", th2);
                    }
                }
            });
        }
    }
}
