package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class t implements r, Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f40739a;

    public t(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f40739a = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x017d A[PHI: r4 r7
      0x017d: PHI (r4v5 java.lang.String) = (r4v4 java.lang.String), (r4v6 java.lang.String) binds: [B:109:0x017b, B:105:0x016a] A[DONT_GENERATE, DONT_INLINE]
      0x017d: PHI (r7v2 java.lang.String) = (r7v1 java.lang.String), (r7v3 java.lang.String) binds: [B:109:0x017b, B:105:0x016a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.measurement.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.r a(java.lang.String r24, com.google.android.gms.internal.measurement.r6 r25, java.util.List r26) {
        /*
            Method dump skipped, instruction units count: 1762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.t.a(java.lang.String, com.google.android.gms.internal.measurement.r6, java.util.List):com.google.android.gms.internal.measurement.r");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return this.f40739a.equals(((t) obj).f40739a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40739a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new v(this);
    }

    public final String toString() {
        return "\"" + this.f40739a + "\"";
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r zzc() {
        return new t(this.f40739a);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean zzd() {
        return Boolean.valueOf(!this.f40739a.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double zze() {
        if (this.f40739a.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.f40739a);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String zzf() {
        return this.f40739a;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator zzh() {
        return new w(this);
    }
}
