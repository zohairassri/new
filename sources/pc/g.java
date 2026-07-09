package pc;

import java.io.Closeable;
import lc.z0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface g extends Closeable {
    g O(int i11);

    g U0(z0 z0Var);

    String b();

    g beginArray();

    g beginObject();

    g endArray();

    g endObject();

    g j2();

    g name(String str);

    g value(double d11);

    g value(long j11);

    g value(String str);

    g value(boolean z11);

    g w2(e eVar);
}
