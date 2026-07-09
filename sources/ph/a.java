package ph;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class a implements h {
    @Override // ph.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean accept(Activity component) {
        Intrinsics.checkNotNullParameter(component, "component");
        return true;
    }

    @Override // ph.h
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String a(Activity component) {
        Intrinsics.checkNotNullParameter(component, "component");
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null);
    }

    public int hashCode() {
        return getClass().hashCode();
    }
}
