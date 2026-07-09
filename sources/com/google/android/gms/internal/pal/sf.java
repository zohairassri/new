package com.google.android.gms.internal.pal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class sf implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f41766a;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        sf sfVar = (sf) obj;
        int length = this.f41766a.length;
        int length2 = sfVar.f41766a.length;
        if (length != length2) {
            return length - length2;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f41766a;
            if (i11 >= bArr.length) {
                return 0;
            }
            byte b11 = bArr[i11];
            byte b12 = sfVar.f41766a[i11];
            if (b11 != b12) {
                return b11 - b12;
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sf) {
            return Arrays.equals(this.f41766a, ((sf) obj).f41766a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f41766a);
    }

    public final String toString() {
        return st.a(this.f41766a);
    }
}
