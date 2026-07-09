package androidx.media3.datasource.cache;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface Cache {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class CacheException extends IOException {
        public CacheException(String str) {
            super(str);
        }

        public CacheException(Throwable th2) {
            super(th2);
        }

        public CacheException(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {
        void a(Cache cache, o6.c cVar);

        void b(Cache cache, o6.c cVar);

        void c(Cache cache, o6.c cVar, o6.c cVar2);
    }

    File a(String str, long j11, long j12);

    o6.d b(String str);

    void c(String str, o6.e eVar);

    o6.c d(String str, long j11, long j12);

    o6.c e(String str, long j11, long j12);

    void f(File file, long j11);

    void g(o6.c cVar);

    void h(o6.c cVar);
}
