package com.google.android.gms.internal.ads;

import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class cg4 extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24567a;

    public cg4(String str) {
        this.f24567a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f24567a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cg4) {
            return this.f24567a.equals(((cg4) obj).f24567a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f24567a);
    }

    public final int hashCode() {
        return this.f24567a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.f24567a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f24567a);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f24567a).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.f24567a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f24567a).longValue();
        }
    }

    public final String toString() {
        return this.f24567a;
    }
}
