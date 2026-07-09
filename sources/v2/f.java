package v2;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f132371a = a.f132372a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f132372a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final f f132373b = new C1834a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final f f132374c = new e();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final f f132375d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final f f132376e = new d();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final f f132377f = new C1835f();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final i f132378g = new i(1.0f);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final f f132379h = new b();

        /* JADX INFO: renamed from: v2.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class C1834a implements f {
            C1834a() {
            }

            @Override // v2.f
            public long a(long j11, long j12) {
                float fC = g.c(j11, j12);
                return q0.a((((long) Float.floatToRawIntBits(fC)) << 32) | (((long) Float.floatToRawIntBits(fC)) & 4294967295L));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class b implements f {
            b() {
            }

            @Override // v2.f
            public long a(long j11, long j12) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32)) / Float.intBitsToFloat((int) (j11 >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L)) / Float.intBitsToFloat((int) (j11 & 4294967295L));
                return q0.a((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class c implements f {
            c() {
            }

            @Override // v2.f
            public long a(long j11, long j12) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 & 4294967295L)) / Float.intBitsToFloat((int) (j11 & 4294967295L));
                return q0.a((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class d implements f {
            d() {
            }

            @Override // v2.f
            public long a(long j11, long j12) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32)) / Float.intBitsToFloat((int) (j11 >> 32));
                return q0.a((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class e implements f {
            e() {
            }

            @Override // v2.f
            public long a(long j11, long j12) {
                float fD = g.d(j11, j12);
                return q0.a((((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fD)) & 4294967295L));
            }
        }

        /* JADX INFO: renamed from: v2.f$a$f, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class C1835f implements f {
            C1835f() {
            }

            @Override // v2.f
            public long a(long j11, long j12) {
                if (Float.intBitsToFloat((int) (j11 >> 32)) <= Float.intBitsToFloat((int) (j12 >> 32)) && Float.intBitsToFloat((int) (j11 & 4294967295L)) <= Float.intBitsToFloat((int) (j12 & 4294967295L))) {
                    return q0.a((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L));
                }
                float fD = g.d(j11, j12);
                return q0.a((((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fD)) & 4294967295L));
            }
        }

        private a() {
        }

        public final f a() {
            return f132373b;
        }

        public final f b() {
            return f132379h;
        }

        public final f c() {
            return f132375d;
        }

        public final f d() {
            return f132376e;
        }

        public final f e() {
            return f132374c;
        }

        public final f f() {
            return f132377f;
        }

        public final i g() {
            return f132378g;
        }
    }

    long a(long j11, long j12);
}
