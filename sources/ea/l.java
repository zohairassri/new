package ea;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ca.b f91592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f91593b;

    public l(ca.b _bounds, float f11) {
        Intrinsics.checkNotNullParameter(_bounds, "_bounds");
        this.f91592a = _bounds;
        this.f91593b = f11;
    }

    public final Rect a() {
        return this.f91592a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(l.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        l lVar = (l) obj;
        return Intrinsics.areEqual(this.f91592a, lVar.f91592a) && this.f91593b == lVar.f91593b;
    }

    public int hashCode() {
        return (this.f91592a.hashCode() * 31) + Float.hashCode(this.f91593b);
    }

    public String toString() {
        return "WindowMetrics(_bounds=" + this.f91592a + ", density=" + this.f91593b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(Rect bounds, float f11) {
        this(new ca.b(bounds), f11);
        Intrinsics.checkNotNullParameter(bounds, "bounds");
    }
}
