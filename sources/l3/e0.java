package l3;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f113112a = new e0();

    private e0() {
    }

    public final int a(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return f0.f113113a.a(context);
        }
        return 0;
    }
}
