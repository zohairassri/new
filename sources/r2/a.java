package r2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f123447b;

    public a(int i11) {
        this.f123447b = i11;
    }

    public final int a() {
        return this.f123447b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f123447b == ((a) obj).f123447b;
    }

    public int hashCode() {
        return this.f123447b;
    }

    public String toString() {
        return "AndroidPointerIcon(type=" + this.f123447b + ')';
    }
}
