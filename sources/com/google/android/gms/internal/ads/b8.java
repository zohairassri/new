package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class b8 implements gd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f23723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23724b;

    public b8(float f11, int i11) {
        this.f23723a = f11;
        this.f23724b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b8.class == obj.getClass()) {
            b8 b8Var = (b8) obj;
            if (this.f23723a == b8Var.f23723a && this.f23724b == b8Var.f23724b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.hashCode(this.f23723a) + 527) * 31) + this.f23724b;
    }

    public final String toString() {
        float f11 = this.f23723a;
        int length = String.valueOf(f11).length();
        int i11 = this.f23724b;
        StringBuilder sb2 = new StringBuilder(length + 47 + String.valueOf(i11).length());
        sb2.append("smta: captureFrameRate=");
        sb2.append(f11);
        sb2.append(", svcTemporalLayerCount=");
        sb2.append(i11);
        return sb2.toString();
    }
}
