package ya;

import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f140178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f140179b;

    c(boolean z11, Map map) {
        this.f140178a = z11;
        this.f140179b = map;
    }

    String a() {
        return String.format(Locale.getDefault(), "{\"auth\":\"%s\", \"info\":\"%s\"}", Boolean.valueOf(this.f140178a), this.f140179b);
    }
}
