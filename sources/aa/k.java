package aa;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f466c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f468b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class a extends k {
        a(String str, String str2) {
            super(str, str2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class b extends k {
        b(String str, String str2) {
            super(str, str2);
        }
    }

    k(String str, String str2) {
        this.f467a = str;
        this.f468b = str2;
        f466c.add(this);
    }
}
