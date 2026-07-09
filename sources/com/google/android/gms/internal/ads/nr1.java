package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class nr1 implements yl.a, f50, am.x, h50, am.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private yl.a f31551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f50 f31552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private am.x f31553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h50 f31554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private am.e f31555e;

    @Override // com.google.android.gms.internal.ads.h50
    public final synchronized void B0(String str, String str2) {
        h50 h50Var = this.f31554d;
        if (h50Var != null) {
            h50Var.B0(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.f50
    public final synchronized void D(String str, Bundle bundle) {
        f50 f50Var = this.f31552b;
        if (f50Var != null) {
            f50Var.D(str, bundle);
        }
    }

    @Override // am.x
    public final synchronized void D5() {
        am.x xVar = this.f31553c;
        if (xVar != null) {
            xVar.D5();
        }
    }

    @Override // am.x
    public final void I0() {
        am.x xVar = this.f31553c;
        if (xVar != null) {
            xVar.I0();
        }
    }

    @Override // am.x
    public final void M4() {
        am.x xVar = this.f31553c;
        if (xVar != null) {
            xVar.M4();
        }
    }

    @Override // am.x
    public final void V1() {
        am.x xVar = this.f31553c;
        if (xVar != null) {
            xVar.V1();
        }
    }

    protected final synchronized void b(yl.a aVar, f50 f50Var, am.x xVar, h50 h50Var, am.e eVar) {
        this.f31551a = aVar;
        this.f31552b = f50Var;
        this.f31553c = xVar;
        this.f31554d = h50Var;
        this.f31555e = eVar;
    }

    @Override // am.x
    public final synchronized void b4(int i11) {
        am.x xVar = this.f31553c;
        if (xVar != null) {
            xVar.b4(i11);
        }
    }

    @Override // am.x
    public final synchronized void c3() {
        am.x xVar = this.f31553c;
        if (xVar != null) {
            xVar.c3();
        }
    }

    @Override // am.x
    public final synchronized void c5() {
        am.x xVar = this.f31553c;
        if (xVar != null) {
            xVar.c5();
        }
    }

    @Override // yl.a
    public final synchronized void i() {
        yl.a aVar = this.f31551a;
        if (aVar != null) {
            aVar.i();
        }
    }

    @Override // am.x
    public final void o4() {
        am.x xVar = this.f31553c;
        if (xVar != null) {
            xVar.o4();
        }
    }

    @Override // am.x
    public final synchronized void x2() {
        am.x xVar = this.f31553c;
        if (xVar != null) {
            xVar.x2();
        }
    }

    @Override // am.x
    public final void z1() {
        am.x xVar = this.f31553c;
        if (xVar != null) {
            xVar.z1();
        }
    }

    @Override // am.x
    public final synchronized void zzh() {
        am.x xVar = this.f31553c;
        if (xVar != null) {
            xVar.zzh();
        }
    }

    @Override // am.e
    public final synchronized void zzl() {
        am.e eVar = this.f31555e;
        if (eVar != null) {
            eVar.zzl();
        }
    }
}
