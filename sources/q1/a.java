package q1;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends kotlin.collections.j {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return d((Map.Entry) obj);
        }
        return false;
    }

    public final boolean d(Map.Entry entry) {
        if ((entry != null ? entry : null) == null) {
            return false;
        }
        return e(entry);
    }

    public abstract boolean e(Map.Entry entry);

    public final boolean i(Map.Entry entry) {
        if ((entry != null ? entry : null) == null) {
            return false;
        }
        return j(entry);
    }

    public abstract boolean j(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return i((Map.Entry) obj);
        }
        return false;
    }
}
