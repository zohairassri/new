package qd0;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Map f122695a;

    public c(Map map) {
        this.f122695a = map;
    }

    @Override // qd0.b, java.lang.Iterable
    public Iterator iterator() {
        return this.f122695a.entrySet().iterator();
    }
}
