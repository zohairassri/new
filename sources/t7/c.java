package t7;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f129392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f129393b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f129394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f129395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f129396c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f129397d;

        public a(String str, String str2, long j11, long j12) {
            this.f129394a = str;
            this.f129395b = str2;
            this.f129396c = j11;
            this.f129397d = j12;
        }
    }

    public c(long j11, List list) {
        this.f129392a = j11;
        this.f129393b = list;
    }

    public a8.a a(long j11) {
        long j12;
        if (this.f129393b.size() < 2) {
            return null;
        }
        long j13 = j11;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        long j17 = -1;
        boolean z11 = false;
        for (int size = this.f129393b.size() - 1; size >= 0; size--) {
            a aVar = (a) this.f129393b.get(size);
            boolean zEquals = "video/mp4".equals(aVar.f129394a) | z11;
            if (size == 0) {
                j13 -= aVar.f129397d;
                j12 = 0;
            } else {
                j12 = j13 - aVar.f129396c;
            }
            long j18 = j12;
            long j19 = j13;
            j13 = j18;
            if (!zEquals || j13 == j19) {
                z11 = zEquals;
            } else {
                j17 = j19 - j13;
                j16 = j13;
                z11 = false;
            }
            if (size == 0) {
                j14 = j13;
                j15 = j19;
            }
        }
        if (j16 == -1 || j17 == -1 || j14 == -1 || j15 == -1) {
            return null;
        }
        return new a8.a(j14, j15, this.f129392a, j16, j17);
    }
}
