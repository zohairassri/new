package mr;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String[] f116932a;

    public static boolean a(URI uri, Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        gr.a.e().a("Detected domain allowlist, only allowlisted domains will be measured.");
        if (f116932a == null) {
            f116932a = resources.getStringArray(identifier);
        }
        String host = uri.getHost();
        if (host == null) {
            return true;
        }
        for (String str : f116932a) {
            if (host.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
