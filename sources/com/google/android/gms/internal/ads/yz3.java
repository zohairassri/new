package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class yz3 extends a04 {
    yz3() {
        super(null);
    }

    static final a04 j(int i11) {
        return i11 < 0 ? a04.f23005b : i11 > 0 ? a04.f23006c : a04.f23004a;
    }

    @Override // com.google.android.gms.internal.ads.a04
    public final a04 a(Object obj, Object obj2, Comparator comparator) {
        return j(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.a04
    public final a04 b(int i11, int i12) {
        return j(Integer.compare(i11, i12));
    }

    @Override // com.google.android.gms.internal.ads.a04
    public final a04 c(boolean z11, boolean z12) {
        return j(Boolean.compare(z12, z11));
    }

    @Override // com.google.android.gms.internal.ads.a04
    public final a04 d(boolean z11, boolean z12) {
        return j(Boolean.compare(z11, z12));
    }

    @Override // com.google.android.gms.internal.ads.a04
    public final int e() {
        return 0;
    }
}
