package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class mw0 implements lv0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected js0 f31062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected js0 f31063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private js0 f31064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private js0 f31065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ByteBuffer f31066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ByteBuffer f31067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f31068h;

    public mw0() {
        ByteBuffer byteBuffer = lv0.f30452a;
        this.f31066f = byteBuffer;
        this.f31067g = byteBuffer;
        js0 js0Var = js0.f29198e;
        this.f31064d = js0Var;
        this.f31065e = js0Var;
        this.f31062b = js0Var;
        this.f31063c = js0Var;
    }

    @Override // com.google.android.gms.internal.ads.lv0
    public final void c(kt0 kt0Var) {
        this.f31067g = lv0.f30452a;
        this.f31068h = false;
        this.f31062b = this.f31064d;
        this.f31063c = this.f31065e;
        i();
    }

    @Override // com.google.android.gms.internal.ads.lv0
    public final js0 d(js0 js0Var) {
        this.f31064d = js0Var;
        this.f31065e = g(js0Var);
        return zzc() ? this.f31065e : js0.f29198e;
    }

    protected final ByteBuffer e(int i11) {
        if (this.f31066f.capacity() < i11) {
            this.f31066f = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
        } else {
            this.f31066f.clear();
        }
        ByteBuffer byteBuffer = this.f31066f;
        this.f31067g = byteBuffer;
        return byteBuffer;
    }

    protected final boolean f() {
        return this.f31067g.hasRemaining();
    }

    protected abstract js0 g(js0 js0Var);

    @Override // com.google.android.gms.internal.ads.lv0
    public boolean zzc() {
        return this.f31065e != js0.f29198e;
    }

    @Override // com.google.android.gms.internal.ads.lv0
    public final void zze() {
        this.f31068h = true;
        h();
    }

    @Override // com.google.android.gms.internal.ads.lv0
    public ByteBuffer zzf() {
        ByteBuffer byteBuffer = this.f31067g;
        this.f31067g = lv0.f30452a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.lv0
    public boolean zzg() {
        return this.f31068h && this.f31067g == lv0.f30452a;
    }

    @Override // com.google.android.gms.internal.ads.lv0
    public final void zzj() {
        ByteBuffer byteBuffer = lv0.f30452a;
        this.f31067g = byteBuffer;
        this.f31068h = false;
        this.f31066f = byteBuffer;
        js0 js0Var = js0.f29198e;
        this.f31064d = js0Var;
        this.f31065e = js0Var;
        this.f31062b = js0Var;
        this.f31063c = js0Var;
        j();
    }

    protected void h() {
    }

    protected void i() {
    }

    protected void j() {
    }
}
