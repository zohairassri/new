package sm;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class k {
    public static j a(Object obj, Looper looper, String str) {
        com.google.android.gms.common.internal.n.m(obj, "Listener must not be null");
        com.google.android.gms.common.internal.n.m(looper, "Looper must not be null");
        com.google.android.gms.common.internal.n.m(str, "Listener type must not be null");
        return new j(looper, obj, str);
    }
}
