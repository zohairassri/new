package mr;

import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final URL f116933a;

    public m(URL url) {
        this.f116933a = url;
    }

    public URLConnection a() {
        return this.f116933a.openConnection();
    }

    public String toString() {
        return this.f116933a.toString();
    }
}
