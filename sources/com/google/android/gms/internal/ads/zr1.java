package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class zr1 implements q60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f39374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f39375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q60 f39376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ as1 f39377d;

    /* synthetic */ zr1(as1 as1Var, WeakReference weakReference, String str, q60 q60Var, byte[] bArr) {
        Objects.requireNonNull(as1Var);
        this.f39377d = as1Var;
        this.f39374a = weakReference;
        this.f39375b = str;
        this.f39376c = q60Var;
    }

    @Override // com.google.android.gms.internal.ads.q60
    public final void a(Object obj, Map map) {
        Object obj2 = this.f39374a.get();
        if (obj2 == null) {
            this.f39377d.e(this.f39375b, this);
        } else {
            this.f39376c.a(obj2, map);
        }
    }
}
