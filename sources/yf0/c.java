package yf0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f140426a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f140427b = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public c(c cVar) {
        this._prev$volatile = cVar;
    }

    private final c d() {
        c cVarH = h();
        while (cVarH != null && cVarH.k()) {
            cVarH = (c) f140427b.get(cVarH);
        }
        return cVarH;
    }

    private final c e() {
        c cVarF;
        c cVarF2 = f();
        Intrinsics.checkNotNull(cVarF2);
        while (cVarF2.k() && (cVarF = cVarF2.f()) != null) {
            cVarF2 = cVarF;
        }
        return cVarF2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g() {
        return f140426a.get(this);
    }

    public final void c() {
        f140427b.set(this, null);
    }

    public final c f() {
        Object objG = g();
        if (objG == b.f140423a) {
            return null;
        }
        return (c) objG;
    }

    public final c h() {
        return (c) f140427b.get(this);
    }

    public abstract boolean k();

    public final boolean l() {
        return f() == null;
    }

    public final boolean m() {
        return androidx.concurrent.futures.b.a(f140426a, this, null, b.f140423a);
    }

    public final void n() {
        Object obj;
        if (l()) {
            return;
        }
        while (true) {
            c cVarD = d();
            c cVarE = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f140427b;
            do {
                obj = atomicReferenceFieldUpdater.get(cVarE);
            } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, cVarE, obj, ((c) obj) == null ? null : cVarD));
            if (cVarD != null) {
                f140426a.set(cVarD, cVarE);
            }
            if (!cVarE.k() || cVarE.l()) {
                if (cVarD == null || !cVarD.k()) {
                    return;
                }
            }
        }
    }

    public final boolean o(c cVar) {
        return androidx.concurrent.futures.b.a(f140426a, this, null, cVar);
    }
}
