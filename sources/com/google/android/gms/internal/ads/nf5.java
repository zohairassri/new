package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class nf5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f31368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f31369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31370c;

    public final nf5 a(boolean z11) {
        this.f31368a = z11;
        return this;
    }

    public final nf5 b(boolean z11) {
        this.f31369b = z11;
        return this;
    }

    public final nf5 c(boolean z11) {
        this.f31370c = z11;
        return this;
    }

    public final of5 d() {
        if (this.f31368a || !(this.f31369b || this.f31370c)) {
            return new of5(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    final /* synthetic */ boolean e() {
        return this.f31368a;
    }

    final /* synthetic */ boolean f() {
        return this.f31369b;
    }

    final /* synthetic */ boolean g() {
        return this.f31370c;
    }
}
