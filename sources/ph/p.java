package ph;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f121628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f121629b;

    public p(WeakReference viewRef, m mVar) {
        Intrinsics.checkNotNullParameter(viewRef, "viewRef");
        this.f121628a = viewRef;
        this.f121629b = mVar;
    }

    public final m a() {
        return this.f121629b;
    }

    public final WeakReference b() {
        return this.f121628a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.areEqual(this.f121628a.get(), pVar.f121628a.get()) && Intrinsics.areEqual(this.f121629b, pVar.f121629b);
    }

    public int hashCode() {
        Object obj = this.f121628a.get();
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        m mVar = this.f121629b;
        return iHashCode + (mVar != null ? mVar.hashCode() : 0);
    }

    public /* synthetic */ p(WeakReference weakReference, m mVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new WeakReference(null) : weakReference, (i11 & 2) != 0 ? null : mVar);
    }
}
