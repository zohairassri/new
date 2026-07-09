package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class fw4 extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26733a;

    public fw4(String str) {
        this.f26733a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f26733a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fw4) {
            return this.f26733a.equals(((fw4) obj).f26733a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f26733a);
    }

    public final int hashCode() {
        return this.f26733a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.f26733a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f26733a);
            }
        } catch (NumberFormatException unused2) {
            return pw4.a(this.f26733a).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.f26733a);
        } catch (NumberFormatException unused) {
            return pw4.a(this.f26733a).longValue();
        }
    }

    public final String toString() {
        return this.f26733a;
    }
}
