package yl;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final /* synthetic */ class s2 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ s2 f140815a = new s2();

    private /* synthetic */ s2() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        List list = ql.o.f122833f;
        return list.indexOf((String) obj) - list.indexOf((String) obj2);
    }
}
