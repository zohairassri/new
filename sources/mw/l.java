package mw;

import kotlin.jvm.internal.Intrinsics;
import mw.k;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class l {
    public static final k a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        k.b bVar = k.b.f117034c;
        if (!Intrinsics.areEqual(str, bVar.b())) {
            k.a aVar = k.a.f117033c;
            if (Intrinsics.areEqual(str, aVar.b())) {
                return aVar;
            }
            k.c cVar = k.c.f117035c;
            if (Intrinsics.areEqual(str, cVar.b())) {
                return cVar;
            }
            k.d dVar = k.d.f117036c;
            if (Intrinsics.areEqual(str, dVar.b())) {
                return dVar;
            }
        }
        return bVar;
    }
}
