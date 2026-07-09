package g1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.compose.ui.window.u f96554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f96555b;

    public k1(androidx.compose.ui.window.u uVar, boolean z11) {
        this.f96554a = uVar;
        this.f96555b = z11;
    }

    public final androidx.compose.ui.window.u a() {
        return this.f96554a;
    }

    public final boolean b() {
        return this.f96555b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1) && this.f96554a == ((k1) obj).f96554a;
    }

    public int hashCode() {
        return (this.f96554a.hashCode() * 31) + Boolean.hashCode(this.f96555b);
    }

    public /* synthetic */ k1(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11);
    }

    public k1(boolean z11) {
        this(androidx.compose.ui.window.u.f6289a, z11);
    }
}
