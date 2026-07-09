package dg0;

import yf0.e0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e0 f89741a = new e0("NO_OWNER");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e0 f89742b = new e0("ALREADY_LOCKED_BY_OWNER");

    public static final a a(boolean z11) {
        return new f(z11);
    }

    public static /* synthetic */ a b(boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return a(z11);
    }
}
