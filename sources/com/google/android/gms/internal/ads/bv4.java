package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class bv4 implements vk4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final vk4 f24247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final vk4 f24248b;

    /* synthetic */ bv4(vk4 vk4Var, vk4 vk4Var2, byte[] bArr) {
        this.f24247a = vk4Var;
        this.f24248b = vk4Var2;
    }

    @Override // com.google.android.gms.internal.ads.vk4
    public final byte[] a(byte[] bArr, int i11) {
        return bArr.length <= 64 ? this.f24247a.a(bArr, i11) : this.f24248b.a(bArr, i11);
    }
}
