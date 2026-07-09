package androidx.transition;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class p {
    public static p a(ViewGroup viewGroup) {
        android.support.v4.media.a.a(viewGroup.getTag(n.transition_current_scene));
        return null;
    }

    static void b(ViewGroup viewGroup, p pVar) {
        viewGroup.setTag(n.transition_current_scene, pVar);
    }
}
