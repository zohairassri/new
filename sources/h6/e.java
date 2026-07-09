package h6;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f100109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f100110b;

    public e(int i11, float f11) {
        this.f100109a = i11;
        this.f100110b = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f100109a == eVar.f100109a && Float.compare(eVar.f100110b, this.f100110b) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f100109a) * 31) + Float.floatToIntBits(this.f100110b);
    }
}
