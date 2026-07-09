package androidx.media3.datasource;

import android.net.Uri;
import h6.i;
import java.util.Collections;
import java.util.Map;
import n6.g;
import n6.m;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface a extends i {

    /* JADX INFO: renamed from: androidx.media3.datasource.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface InterfaceC0151a {
        a a();
    }

    default Map c() {
        return Collections.EMPTY_MAP;
    }

    void close();

    long e(g gVar);

    Uri getUri();

    void n(m mVar);
}
