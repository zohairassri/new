package com.google.android.gms.internal.ads;

import java.security.spec.ECParameterSpec;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class jp4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final jp4 f29160c = new jp4("NIST_P256", vf4.f36783a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final jp4 f29161d = new jp4("NIST_P384", vf4.f36784b);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final jp4 f29162e = new jp4("NIST_P521", vf4.f36785c);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ECParameterSpec f29164b;

    private jp4(String str, ECParameterSpec eCParameterSpec) {
        this.f29163a = str;
        this.f29164b = eCParameterSpec;
    }

    public final ECParameterSpec a() {
        return this.f29164b;
    }

    public final String toString() {
        return this.f29163a;
    }
}
