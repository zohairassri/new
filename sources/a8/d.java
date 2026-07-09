package a8;

import h6.u;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f443b;

    public d(float f11, int i11) {
        this.f442a = f11;
        this.f443b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f442a == dVar.f442a && this.f443b == dVar.f443b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + com.google.common.primitives.c.a(this.f442a)) * 31) + this.f443b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f442a + ", svcTemporalLayerCount=" + this.f443b;
    }
}
