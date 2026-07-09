package g5;

import android.util.SparseArray;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SparseArray f98155a = new SparseArray();

    public static Object a(View view, Object obj, int i11) {
        Object tag = view.getTag(i11);
        view.setTag(i11, obj);
        return tag;
    }
}
