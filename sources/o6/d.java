package o6;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface d {
    static Uri b(d dVar) {
        String strC = dVar.c("exo_redir", null);
        if (strC == null) {
            return null;
        }
        return Uri.parse(strC);
    }

    static long d(d dVar) {
        return dVar.a("exo_len", -1L);
    }

    long a(String str, long j11);

    String c(String str, String str2);
}
