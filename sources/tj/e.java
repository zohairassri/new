package tj;

import com.amazonaws.services.s3.internal.Constants;
import com.statsig.androidsdk.NetworkFallbackResolverKt;
import tj.a;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final e f130127a = a().f(10485760).d(200).b(Constants.MAXIMUM_UPLOAD_PARTS).c(NetworkFallbackResolverKt.DEFAULT_TTL_MS).e(81920).a();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static abstract class a {
        a() {
        }

        abstract e a();

        abstract a b(int i11);

        abstract a c(long j11);

        abstract a d(int i11);

        abstract a e(int i11);

        abstract a f(long j11);
    }

    e() {
    }

    static a a() {
        return new a.b();
    }

    abstract int b();

    abstract long c();

    abstract int d();

    abstract int e();

    abstract long f();
}
