package com.google.android.gms.internal.pal;

import java.security.interfaces.ECPrivateKey;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zs implements re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ECPrivateKey f42298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bt f42299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f42300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f42301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ys f42302e;

    public zs(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i11, ys ysVar) {
        this.f42298a = eCPrivateKey;
        this.f42299b = new bt(eCPrivateKey);
        this.f42301d = bArr;
        this.f42300c = str;
        this.f42302e = ysVar;
    }
}
