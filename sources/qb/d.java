package qb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class d {
    public static final c a(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return cVar.a(null, null, null, null, false, null);
    }

    public static final c b(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return c.b(cVar, null, null, null, null, false, null, 15, null);
    }

    public static final boolean c(String str) {
        return Intrinsics.areEqual(str, "COMPONENTS_IN_A_GROUP") || Intrinsics.areEqual(str, "COLORS_IN_A_GROUP") || Intrinsics.areEqual(str, "TYPOGRAPHY_IN_A_GROUP");
    }
}
