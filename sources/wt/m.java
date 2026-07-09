package wt;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class m {
    public final String a(vt.f validatedStatus) {
        Intrinsics.checkNotNullParameter(validatedStatus, "validatedStatus");
        return validatedStatus.name();
    }

    public final vt.f b(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return vt.f.valueOf(value);
    }
}
