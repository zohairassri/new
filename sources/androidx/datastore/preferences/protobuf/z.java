package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
class z implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator f7815a;

    public z(Iterator it) {
        this.f7815a = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f7815a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f7815a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f7815a.remove();
    }
}
