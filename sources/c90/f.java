package c90;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class f implements y80.a, y80.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f17295a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f17296b = false;

    public void a() {
        a90.b.a();
        this.f17296b = true;
        Iterator it = this.f17295a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.a.a(it.next());
            throw null;
        }
    }
}
