package o4;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: o4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class C1565a {
        static ColorFilter a(int i11, Object obj) {
            return new BlendModeColorFilter(i11, (BlendMode) obj);
        }
    }

    public static ColorFilter a(int i11, b bVar) {
        Object objA = d.a(bVar);
        if (objA != null) {
            return C1565a.a(i11, objA);
        }
        return null;
    }
}
