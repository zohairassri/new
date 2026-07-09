package cp;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final y f87279a = new y();

    private y() {
    }

    static y a() {
        return f87279a;
    }

    public static y b(y yVar) throws GeneralSecurityException {
        if (yVar != null) {
            return yVar;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
