package js;

import yd0.q;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f105928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f105929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f105930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f105931d;

    /* JADX INFO: renamed from: js.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface InterfaceC1310a extends q {
        @Override // yd0.q
        boolean test(Object obj);
    }

    a(int i11) {
        this.f105928a = i11;
        Object[] objArr = new Object[i11 + 1];
        this.f105929b = objArr;
        this.f105930c = objArr;
    }

    void a(Object obj) {
        int i11 = this.f105928a;
        int i12 = this.f105931d;
        if (i12 == i11) {
            Object[] objArr = new Object[i11 + 1];
            this.f105930c[i11] = objArr;
            this.f105930c = objArr;
            i12 = 0;
        }
        this.f105930c[i12] = obj;
        this.f105931d = i12 + 1;
    }

    void b(InterfaceC1310a interfaceC1310a) {
        int i11;
        int i12 = this.f105928a;
        for (Object[] objArr = this.f105929b; objArr != null; objArr = objArr[i12]) {
            while (i11 < i12) {
                Object obj = objArr[i11];
                i11 = (obj == null || interfaceC1310a.test(obj)) ? 0 : i11 + 1;
            }
        }
    }
}
