package sj;

import android.app.job.JobInfo;
import com.theathletic.network.apollo.FetchPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import sj.c;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private vj.a f127008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f127009b = new HashMap();

        public a a(jj.d dVar, b bVar) {
            this.f127009b.put(dVar, bVar);
            return this;
        }

        public f b() {
            if (this.f127008a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f127009b.keySet().size() < jj.d.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f127009b;
            this.f127009b = new HashMap();
            return f.d(this.f127008a, map);
        }

        public a c(vj.a aVar) {
            this.f127008a = aVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class b {

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j11);

            public abstract a c(Set set);

            public abstract a d(long j11);
        }

        public static a a() {
            return new c.b().c(Collections.EMPTY_SET);
        }

        abstract long b();

        abstract Set c();

        abstract long d();
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i11, long j11) {
        return (long) (Math.pow(3.0d, i11 - 1) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j11 > 1 ? j11 : 2L) * ((long) r7))));
    }

    public static a b() {
        return new a();
    }

    static f d(vj.a aVar, Map map) {
        return new sj.b(aVar, map);
    }

    public static f f(vj.a aVar) {
        return b().a(jj.d.DEFAULT, b.a().b(30000L).d(FetchPolicy.ONE_DAY).a()).a(jj.d.HIGHEST, b.a().b(1000L).d(FetchPolicy.ONE_DAY).a()).a(jj.d.VERY_LOW, b.a().b(FetchPolicy.ONE_DAY).d(FetchPolicy.ONE_DAY).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static Set i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    private void j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, jj.d dVar, long j11, int i11) {
        builder.setMinimumLatency(g(dVar, j11, i11));
        j(builder, ((b) h().get(dVar)).c());
        return builder;
    }

    abstract vj.a e();

    public long g(jj.d dVar, long j11, int i11) {
        long jB = j11 - e().b();
        b bVar = (b) h().get(dVar);
        return Math.min(Math.max(a(i11, bVar.b()), jB), bVar.d());
    }

    abstract Map h();
}
