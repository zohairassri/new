package kotlin.collections;

import java.util.AbstractList;
import java.util.List;
import kotlin.jvm.internal.markers.KMutableList;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class h extends AbstractList implements List, KMutableList {
    protected h() {
    }

    public abstract int a();

    public abstract Object d(int i11);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i11) {
        return d(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
