package s90;

import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public interface f {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public static Pair a(f fVar) {
            return new Pair(fVar.getKey().c(), fVar.getValue());
        }
    }

    Pair a();

    d getKey();

    String getValue();
}
