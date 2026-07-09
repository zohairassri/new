package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class tu3 extends vv3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBinder f35748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f35750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f35751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f35753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte f35754g;

    tu3() {
    }

    @Override // com.google.android.gms.internal.ads.vv3
    public final vv3 a(IBinder iBinder) {
        if (iBinder == null) {
            throw new NullPointerException("Null windowToken");
        }
        this.f35748a = iBinder;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.vv3
    public final vv3 b(String str) {
        this.f35749b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.vv3
    public final vv3 c(int i11) {
        this.f35750c = i11;
        this.f35754g = (byte) (this.f35754g | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.vv3
    public final vv3 d(float f11) {
        this.f35751d = f11;
        this.f35754g = (byte) (this.f35754g | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.vv3
    public final vv3 e(int i11) {
        this.f35754g = (byte) (this.f35754g | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.vv3
    public final vv3 f(int i11) {
        this.f35754g = (byte) (this.f35754g | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.vv3
    public final vv3 g(int i11) {
        this.f35752e = i11;
        this.f35754g = (byte) (this.f35754g | 16);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.vv3
    public final vv3 h(String str) {
        this.f35753f = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.vv3
    public final wv3 i() {
        IBinder iBinder;
        if (this.f35754g == 31 && (iBinder = this.f35748a) != null) {
            return new uu3(iBinder, this.f35749b, this.f35750c, this.f35751d, 0, 0, null, this.f35752e, null, this.f35753f, null, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f35748a == null) {
            sb2.append(" windowToken");
        }
        if ((this.f35754g & 1) == 0) {
            sb2.append(" layoutGravity");
        }
        if ((this.f35754g & 2) == 0) {
            sb2.append(" layoutVerticalMargin");
        }
        if ((this.f35754g & 4) == 0) {
            sb2.append(" displayMode");
        }
        if ((this.f35754g & 8) == 0) {
            sb2.append(" triggerMode");
        }
        if ((this.f35754g & 16) == 0) {
            sb2.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
