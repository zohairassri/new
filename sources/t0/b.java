package t0;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f127695a;

    static {
        f127695a = Build.VERSION.SDK_INT >= 34;
    }

    public static final boolean a() {
        return f127695a;
    }
}
