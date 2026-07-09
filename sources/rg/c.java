package rg;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class c implements nf.c {
    @Override // nf.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(UUID model) {
        Intrinsics.checkNotNullParameter(model, "model");
        String string = model.toString();
        Intrinsics.checkNotNullExpressionValue(string, "model.toString()");
        return string;
    }
}
