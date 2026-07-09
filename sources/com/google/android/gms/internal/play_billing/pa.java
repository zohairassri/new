package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class pa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f42524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    sa f42525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ua f42526c = ua.i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f42527d;

    pa() {
    }

    final void a() {
        this.f42524a = null;
        this.f42525b = null;
        this.f42526c.d(null);
    }

    public final boolean b(Object obj) {
        this.f42527d = true;
        sa saVar = this.f42525b;
        boolean z11 = saVar != null && saVar.b(obj);
        if (z11) {
            this.f42524a = null;
            this.f42525b = null;
            this.f42526c = null;
        }
        return z11;
    }

    protected final void finalize() {
        ua uaVar;
        sa saVar = this.f42525b;
        if (saVar != null && !saVar.isDone()) {
            saVar.c(new qa("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f42524a))));
        }
        if (this.f42527d || (uaVar = this.f42526c) == null) {
            return;
        }
        uaVar.d(null);
    }
}
