package com.google.firebase.remoteconfig.internal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class w implements pr.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f47067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pr.l f47069c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f47070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f47071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private pr.l f47072c;

        public w a() {
            return new w(this.f47070a, this.f47071b, this.f47072c);
        }

        b b(pr.l lVar) {
            this.f47072c = lVar;
            return this;
        }

        b c(int i11) {
            this.f47071b = i11;
            return this;
        }

        public b d(long j11) {
            this.f47070a = j11;
            return this;
        }

        private b() {
        }
    }

    static b c() {
        return new b();
    }

    @Override // pr.k
    public long a() {
        return this.f47067a;
    }

    @Override // pr.k
    public int b() {
        return this.f47068b;
    }

    private w(long j11, int i11, pr.l lVar) {
        this.f47067a = j11;
        this.f47068b = i11;
        this.f47069c = lVar;
    }
}
