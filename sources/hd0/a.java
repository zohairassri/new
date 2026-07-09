package hd0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rc0.b f100712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f100713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f100714c;

    private a(rc0.b bVar, long j11, long j12) {
        this.f100712a = bVar;
        this.f100713b = j11;
        this.f100714c = j12;
    }

    public static a a(rc0.b bVar) {
        return new a(bVar, bVar.a(), bVar.nanoTime());
    }

    long b() {
        return this.f100713b + (this.f100712a.nanoTime() - this.f100714c);
    }

    long c() {
        return this.f100713b;
    }
}
