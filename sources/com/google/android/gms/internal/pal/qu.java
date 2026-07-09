package com.google.android.gms.internal.pal;

import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class qu extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f41697a;

    public qu(String str) {
        this.f41697a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f41697a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu)) {
            return false;
        }
        String str = this.f41697a;
        String str2 = ((qu) obj).f41697a;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f41697a);
    }

    public final int hashCode() {
        return this.f41697a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.f41697a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f41697a);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f41697a).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.f41697a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f41697a).longValue();
        }
    }

    public final String toString() {
        return this.f41697a;
    }
}
