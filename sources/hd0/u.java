package hd0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f100794a = 128;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f100795b = 128;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f100796c = 128;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f100797d = 128;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f100798e = 128;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f100799f = Integer.MAX_VALUE;

    u() {
    }

    public t a() {
        return t.a(this.f100794a, this.f100795b, this.f100796c, this.f100797d, this.f100798e, this.f100799f);
    }

    public u b(int i11) {
        jc0.j.a(i11 > -1, "maxAttributeValueLength must be non-negative");
        this.f100799f = i11;
        return this;
    }

    public u c(int i11) {
        jc0.j.a(i11 > 0, "maxNumberOfAttributes must be greater than 0");
        this.f100794a = i11;
        return this;
    }

    public u d(int i11) {
        jc0.j.a(i11 > 0, "maxNumberOfAttributesPerEvent must be greater than 0");
        this.f100797d = i11;
        return this;
    }

    public u e(int i11) {
        jc0.j.a(i11 > 0, "maxNumberOfAttributesPerLink must be greater than 0");
        this.f100798e = i11;
        return this;
    }

    public u f(int i11) {
        jc0.j.a(i11 > 0, "maxNumberOfEvents must be greater than 0");
        this.f100795b = i11;
        return this;
    }

    public u g(int i11) {
        jc0.j.a(i11 > 0, "maxNumberOfLinks must be greater than 0");
        this.f100796c = i11;
        return this;
    }
}
