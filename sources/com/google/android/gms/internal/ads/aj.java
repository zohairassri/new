package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class aj implements zi {
    @Override // com.google.android.gms.internal.ads.zi
    public final byte a(lj ljVar, int i11) {
        return ljVar.b(i11);
    }

    @Override // com.google.android.gms.internal.ads.zi
    public final lj b(lj ljVar, int i11, int i12) {
        byte[] bArr;
        int length;
        if (i11 < 0 || i11 > i12 || i12 > (length = (bArr = ljVar.f30255a).length) || i11 > i12 || i12 > length) {
            throw new IndexOutOfBoundsException();
        }
        return new lj(lj.h(bArr, i11, i12 - i11));
    }

    @Override // com.google.android.gms.internal.ads.zi
    public final zi zzc() {
        return new aj();
    }
}
