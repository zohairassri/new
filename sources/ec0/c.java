package ec0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public interface c {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public static ec0.a a(c cVar, String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return cVar.createSpan(name, null);
        }
    }

    ec0.a createSpan(String str, ec0.a aVar);
}
