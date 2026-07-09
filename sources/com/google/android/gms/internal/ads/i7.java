package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class i7 extends r7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f28213b;

    public i7(String str, byte[] bArr) {
        super(str);
        this.f28213b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i7.class == obj.getClass()) {
            i7 i7Var = (i7) obj;
            if (this.f34013a.equals(i7Var.f34013a) && Arrays.equals(this.f28213b, i7Var.f28213b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f34013a.hashCode() + 527) * 31) + Arrays.hashCode(this.f28213b);
    }
}
