package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f19204a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f19205b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f19206c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f19207d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f19208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f19209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f19210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ed.g f19211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final boolean f19212i;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class a extends l {
        a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public g a(int i11, int i12, int i13, int i14) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public float b(int i11, int i12, int i13, int i14) {
            if (Math.min(i12 / i14, i11 / i13) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class b extends l {
        b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public g a(int i11, int i12, int i13, int i14) {
            return g.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public float b(int i11, int i12, int i13, int i14) {
            int iCeil = (int) Math.ceil(Math.max(i12 / i14, i11 / i13));
            return 1.0f / (r1 << (Math.max(1, Integer.highestOneBit(iCeil)) >= iCeil ? 0 : 1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class c extends l {
        c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public g a(int i11, int i12, int i13, int i14) {
            return b(i11, i12, i13, i14) == 1.0f ? g.QUALITY : l.f19206c.a(i11, i12, i13, i14);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public float b(int i11, int i12, int i13, int i14) {
            return Math.min(1.0f, l.f19206c.b(i11, i12, i13, i14));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class d extends l {
        d() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public g a(int i11, int i12, int i13, int i14) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public float b(int i11, int i12, int i13, int i14) {
            return Math.max(i13 / i11, i14 / i12);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class e extends l {
        e() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public g a(int i11, int i12, int i13, int i14) {
            return l.f19212i ? g.QUALITY : g.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public float b(int i11, int i12, int i13, int i14) {
            if (l.f19212i) {
                return Math.min(i13 / i11, i14 / i12);
            }
            if (Math.max(i12 / i14, i11 / i13) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class f extends l {
        f() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public g a(int i11, int i12, int i13, int i14) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l
        public float b(int i11, int i12, int i13, int i14) {
            return 1.0f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f19208e = dVar;
        f19209f = new f();
        f19210g = dVar;
        f19211h = ed.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f19212i = true;
    }

    public abstract g a(int i11, int i12, int i13, int i14);

    public abstract float b(int i11, int i12, int i13, int i14);
}
