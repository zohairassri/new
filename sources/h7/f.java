package h7;

import android.net.Uri;
import k6.k0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final zo.h f100479a = zo.h.g(",");

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public abstract f a();

        public abstract a b(long j11);

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(String str);
    }

    public static Uri b(Uri uri) {
        return uri.getQueryParameter("CMCD") != null ? k0.e(uri, "CMCD") : uri;
    }

    public abstract n6.g a(n6.g gVar);
}
