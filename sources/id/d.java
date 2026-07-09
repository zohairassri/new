package id;

import id.a;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class d implements a.InterfaceC1245a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f103614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f103615b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {
        File getCacheDirectory();
    }

    public d(a aVar, long j11) {
        this.f103614a = j11;
        this.f103615b = aVar;
    }

    @Override // id.a.InterfaceC1245a
    public id.a build() {
        File cacheDirectory = this.f103615b.getCacheDirectory();
        if (cacheDirectory == null) {
            return null;
        }
        if (cacheDirectory.isDirectory() || cacheDirectory.mkdirs()) {
            return e.c(cacheDirectory, this.f103614a);
        }
        return null;
    }
}
