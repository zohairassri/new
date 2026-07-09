package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class yc3 implements gd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f38416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f38417b;

    public yc3(float f11, float f12) {
        boolean z11 = false;
        if (f11 >= -90.0f && f11 <= 90.0f && f12 >= -180.0f && f12 <= 180.0f) {
            z11 = true;
        }
        jx3.b(z11, "Invalid latitude or longitude");
        this.f38416a = f11;
        this.f38417b = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yc3.class == obj.getClass()) {
            yc3 yc3Var = (yc3) obj;
            if (this.f38416a == yc3Var.f38416a && this.f38417b == yc3Var.f38417b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.hashCode(this.f38416a) + 527) * 31) + Float.hashCode(this.f38417b);
    }

    public final String toString() {
        float f11 = this.f38416a;
        int length = String.valueOf(f11).length();
        float f12 = this.f38417b;
        StringBuilder sb2 = new StringBuilder(length + 26 + String.valueOf(f12).length());
        sb2.append("xyz: latitude=");
        sb2.append(f11);
        sb2.append(", longitude=");
        sb2.append(f12);
        return sb2.toString();
    }
}
