package tj;

import tj.e;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class a extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f130109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f130110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f130111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f130112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f130113f;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class b extends e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f130114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f130115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f130116c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f130117d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f130118e;

        b() {
        }

        @Override // tj.e.a
        e a() {
            String str = "";
            if (this.f130114a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f130115b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f130116c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f130117d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f130118e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f130114a.longValue(), this.f130115b.intValue(), this.f130116c.intValue(), this.f130117d.longValue(), this.f130118e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // tj.e.a
        e.a b(int i11) {
            this.f130116c = Integer.valueOf(i11);
            return this;
        }

        @Override // tj.e.a
        e.a c(long j11) {
            this.f130117d = Long.valueOf(j11);
            return this;
        }

        @Override // tj.e.a
        e.a d(int i11) {
            this.f130115b = Integer.valueOf(i11);
            return this;
        }

        @Override // tj.e.a
        e.a e(int i11) {
            this.f130118e = Integer.valueOf(i11);
            return this;
        }

        @Override // tj.e.a
        e.a f(long j11) {
            this.f130114a = Long.valueOf(j11);
            return this;
        }
    }

    @Override // tj.e
    int b() {
        return this.f130111d;
    }

    @Override // tj.e
    long c() {
        return this.f130112e;
    }

    @Override // tj.e
    int d() {
        return this.f130110c;
    }

    @Override // tj.e
    int e() {
        return this.f130113f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f130109b == eVar.f() && this.f130110c == eVar.d() && this.f130111d == eVar.b() && this.f130112e == eVar.c() && this.f130113f == eVar.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // tj.e
    long f() {
        return this.f130109b;
    }

    public int hashCode() {
        long j11 = this.f130109b;
        int i11 = (((((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ this.f130110c) * 1000003) ^ this.f130111d) * 1000003;
        long j12 = this.f130112e;
        return this.f130113f ^ ((i11 ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f130109b + ", loadBatchSize=" + this.f130110c + ", criticalSectionEnterTimeoutMs=" + this.f130111d + ", eventCleanUpAge=" + this.f130112e + ", maxBlobByteSizePerRow=" + this.f130113f + "}";
    }

    private a(long j11, int i11, int i12, long j12, int i13) {
        this.f130109b = j11;
        this.f130110c = i11;
        this.f130111d = i12;
        this.f130112e = j12;
        this.f130113f = i13;
    }
}
