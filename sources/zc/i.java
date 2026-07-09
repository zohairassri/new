package zc;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class i implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f142231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f142232b;

    public i(String str, Map map) {
        this.f142231a = str;
        this.f142232b = map;
    }

    public final Map a() {
        return this.f142232b;
    }

    @Override // zc.d
    public String getId() {
        return this.f142231a;
    }
}
