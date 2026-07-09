package rg;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements ye.j {
    @Override // ye.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public UUID a(String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        try {
            return UUID.fromString(model);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
