package v;

import kotlin.jvm.internal.Intrinsics;
import w.h0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f132127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h0 f132128b;

    public m(float f11, h0 h0Var) {
        this.f132127a = f11;
        this.f132128b = h0Var;
    }

    public final float a() {
        return this.f132127a;
    }

    public final h0 b() {
        return this.f132128b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.f132127a, mVar.f132127a) == 0 && Intrinsics.areEqual(this.f132128b, mVar.f132128b);
    }

    public int hashCode() {
        return (Float.hashCode(this.f132127a) * 31) + this.f132128b.hashCode();
    }

    public String toString() {
        return "Fade(alpha=" + this.f132127a + ", animationSpec=" + this.f132128b + ')';
    }
}
