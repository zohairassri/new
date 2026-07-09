package h90;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class e implements d, w80.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e f100553b = new e(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f100554a;

    private e(Object obj) {
        this.f100554a = obj;
    }

    public static d a(Object obj) {
        return new e(h.c(obj, "instance cannot be null"));
    }

    @Override // ve0.a
    public Object get() {
        return this.f100554a;
    }
}
