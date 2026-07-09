package nc0;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
abstract class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f117702b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f117701a = Logger.getLogger(f.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List f117703c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f117704d = new Object();

    static List a() {
        List list;
        synchronized (f117704d) {
            list = f117703c;
        }
        return list;
    }

    static void b() {
        synchronized (f117704d) {
            f117702b = true;
        }
    }
}
