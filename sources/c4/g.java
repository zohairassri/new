package c4;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f17166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f17167b;

    g(int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f17166a = new Object[i11];
    }

    @Override // c4.f
    public boolean a(Object obj) {
        int i11 = this.f17167b;
        Object[] objArr = this.f17166a;
        if (i11 >= objArr.length) {
            return false;
        }
        objArr[i11] = obj;
        this.f17167b = i11 + 1;
        return true;
    }

    @Override // c4.f
    public Object b() {
        int i11 = this.f17167b;
        if (i11 <= 0) {
            return null;
        }
        int i12 = i11 - 1;
        Object[] objArr = this.f17166a;
        Object obj = objArr[i12];
        objArr[i12] = null;
        this.f17167b = i11 - 1;
        return obj;
    }

    @Override // c4.f
    public void c(Object[] objArr, int i11) {
        if (i11 > objArr.length) {
            i11 = objArr.length;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = objArr[i12];
            int i13 = this.f17167b;
            Object[] objArr2 = this.f17166a;
            if (i13 < objArr2.length) {
                objArr2[i13] = obj;
                this.f17167b = i13 + 1;
            }
        }
    }
}
