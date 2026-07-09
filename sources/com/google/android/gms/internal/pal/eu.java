package com.google.android.gms.internal.pal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class eu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f41292a;

    private eu(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12];
        this.f41292a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i12);
    }

    public static eu b(byte[] bArr) {
        if (bArr != null) {
            return new eu(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final int a() {
        return this.f41292a.length;
    }

    public final byte[] c() {
        byte[] bArr = this.f41292a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eu) {
            return Arrays.equals(((eu) obj).f41292a, this.f41292a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f41292a);
    }

    public final String toString() {
        return "Bytes(" + st.a(this.f41292a) + ")";
    }
}
