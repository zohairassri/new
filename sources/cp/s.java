package cp;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArrayList f87253a = new CopyOnWriteArrayList();

    public static r a(String str) throws GeneralSecurityException {
        for (r rVar : f87253a) {
            if (rVar.a(str)) {
                return rVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
