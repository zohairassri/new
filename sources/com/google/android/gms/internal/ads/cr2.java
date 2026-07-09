package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class cr2 implements oq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f24686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f24687f;

    public cr2(String str, int i11, int i12, int i13, boolean z11, int i14) {
        this.f24682a = str;
        this.f24683b = i11;
        this.f24684c = i12;
        this.f24685d = i13;
        this.f24686e = z11;
        this.f24687f = i14;
    }

    @Override // com.google.android.gms.internal.ads.oq2
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((f81) obj).f26097a;
        xz2.b(bundle, "carrier", this.f24682a, !TextUtils.isEmpty(r0));
        int i11 = this.f24683b;
        xz2.c(bundle, "cnt", i11, i11 != -2);
        bundle.putInt("gnt", this.f24684c);
        bundle.putInt("pt", this.f24685d);
        Bundle bundleA = xz2.a(bundle, "device");
        bundle.putBundle("device", bundleA);
        Bundle bundleA2 = xz2.a(bundleA, "network");
        bundleA.putBundle("network", bundleA2);
        bundleA2.putInt("active_network_state", this.f24687f);
        bundleA2.putBoolean("active_network_metered", this.f24686e);
    }
}
