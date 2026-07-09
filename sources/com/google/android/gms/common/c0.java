package com.google.android.gms.common;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f22616a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f22617b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f22618c = null;

    /* synthetic */ c0(byte[] bArr) {
    }

    final c0 a(String str) {
        this.f22616a = str;
        return this;
    }

    final c0 b(boolean z11) {
        this.f22617b = Boolean.valueOf(z11);
        return this;
    }

    final c0 c(boolean z11) {
        this.f22618c = Boolean.valueOf(z11);
        return this;
    }

    final d0 d() {
        Boolean bool = this.f22617b;
        if (bool == null) {
            throw new IllegalStateException("allowTestKeys must be set");
        }
        if (this.f22618c != null) {
            return new d0(this.f22616a, bool.booleanValue(), false, false, this.f22618c.booleanValue(), false, null);
        }
        throw new IllegalStateException("isGoogleOrPlatformOnly must be set");
    }
}
