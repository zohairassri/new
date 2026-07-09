package x4;

import android.content.Context;
import android.view.PointerIcon;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointerIcon f137093a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a {
        static PointerIcon a(Context context, int i11) {
            return PointerIcon.getSystemIcon(context, i11);
        }
    }

    private h0(PointerIcon pointerIcon) {
        this.f137093a = pointerIcon;
    }

    public static h0 b(Context context, int i11) {
        return new h0(a.a(context, i11));
    }

    public Object a() {
        return this.f137093a;
    }
}
