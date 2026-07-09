package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class tf5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f35465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f35466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f35468d = 0;

    public final tf5 a(boolean z11) {
        this.f35465a = z11;
        return this;
    }

    public final tf5 b(boolean z11) {
        this.f35466b = z11;
        return this;
    }

    public final tf5 c(boolean z11) {
        this.f35467c = z11;
        return this;
    }

    public final tf5 d(int i11) {
        this.f35468d = i11;
        return this;
    }

    public final uf5 e() {
        if (this.f35465a || !(this.f35466b || this.f35467c)) {
            return new uf5(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }

    final /* synthetic */ boolean f() {
        return this.f35465a;
    }

    final /* synthetic */ boolean g() {
        return this.f35466b;
    }

    final /* synthetic */ boolean h() {
        return this.f35467c;
    }

    final /* synthetic */ int i() {
        return this.f35468d;
    }
}
