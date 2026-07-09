package s90;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c {
    public static final String a(String str, boolean z11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (z11 ? "emb.private." : "emb.") + str;
    }

    public static /* synthetic */ String b(String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return a(str, z11);
    }

    public static final String c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return "emb.properties." + str;
    }
}
