package bb;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f14160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f14161b;

    public e(Drawable drawable, boolean z11) {
        this.f14160a = drawable;
        this.f14161b = z11;
    }

    public final Drawable a() {
        return this.f14160a;
    }

    public final boolean b() {
        return this.f14161b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f14160a, eVar.f14160a) && this.f14161b == eVar.f14161b;
    }

    public int hashCode() {
        return (this.f14160a.hashCode() * 31) + Boolean.hashCode(this.f14161b);
    }
}
