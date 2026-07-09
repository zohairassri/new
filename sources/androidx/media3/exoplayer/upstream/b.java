package androidx.media3.exoplayer.upstream;

import b7.i;
import b7.j;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface b {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10568c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f10569d;

        public a(int i11, int i12, int i13, int i14) {
            this.f10566a = i11;
            this.f10567b = i12;
            this.f10568c = i13;
            this.f10569d = i14;
        }

        public boolean a(int i11) {
            return i11 == 1 ? this.f10566a - this.f10567b > 1 : this.f10568c - this.f10569d > 1;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.upstream.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C0161b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f10571b;

        public C0161b(int i11, long j11) {
            k6.a.a(j11 >= 0);
            this.f10570a = i11;
            this.f10571b = j11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f10572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f10573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IOException f10574c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f10575d;

        public c(i iVar, j jVar, IOException iOException, int i11) {
            this.f10572a = iVar;
            this.f10573b = jVar;
            this.f10574c = iOException;
            this.f10575d = i11;
        }
    }

    int a(int i11);

    long c(c cVar);

    C0161b d(a aVar, c cVar);

    default void b(long j11) {
    }
}
