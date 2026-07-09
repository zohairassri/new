package z1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f141618a = new LinkedHashMap();

    public final Map a() {
        return this.f141618a;
    }

    public final Unit b(int i11, String str) {
        android.support.v4.media.a.a(this.f141618a.get(Integer.valueOf(i11)));
        return null;
    }
}
