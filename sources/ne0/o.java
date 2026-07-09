package ne0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final float f117812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f117813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f117814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f117815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object[] f117816e;

    public o() {
        this(16, 0.75f);
    }

    static int c(int i11) {
        int i12 = i11 * (-1640531527);
        return i12 ^ (i12 >>> 16);
    }

    public boolean a(Object obj) {
        Object obj2;
        Object[] objArr = this.f117816e;
        int i11 = this.f117813b;
        int iC = c(obj.hashCode()) & i11;
        Object obj3 = objArr[iC];
        if (obj3 != null) {
            if (obj3.equals(obj)) {
                return false;
            }
            do {
                iC = (iC + 1) & i11;
                obj2 = objArr[iC];
                if (obj2 == null) {
                }
            } while (!obj2.equals(obj));
            return false;
        }
        objArr[iC] = obj;
        int i12 = this.f117814c + 1;
        this.f117814c = i12;
        if (i12 >= this.f117815d) {
            d();
        }
        return true;
    }

    public Object[] b() {
        return this.f117816e;
    }

    void d() {
        Object obj;
        Object[] objArr = this.f117816e;
        int length = objArr.length;
        int i11 = length << 1;
        int i12 = i11 - 1;
        Object[] objArr2 = new Object[i11];
        int i13 = this.f117814c;
        while (true) {
            int i14 = i13 - 1;
            if (i13 == 0) {
                this.f117813b = i12;
                this.f117815d = (int) (i11 * this.f117812a);
                this.f117816e = objArr2;
                return;
            }
            do {
                length--;
                obj = objArr[length];
            } while (obj == null);
            int iC = c(obj.hashCode()) & i12;
            if (objArr2[iC] != null) {
                do {
                    iC = (iC + 1) & i12;
                } while (objArr2[iC] != null);
            }
            objArr2[iC] = objArr[length];
            i13 = i14;
        }
    }

    public boolean e(Object obj) {
        Object obj2;
        Object[] objArr = this.f117816e;
        int i11 = this.f117813b;
        int iC = c(obj.hashCode()) & i11;
        Object obj3 = objArr[iC];
        if (obj3 == null) {
            return false;
        }
        if (obj3.equals(obj)) {
            return f(iC, objArr, i11);
        }
        do {
            iC = (iC + 1) & i11;
            obj2 = objArr[iC];
            if (obj2 == null) {
                return false;
            }
        } while (!obj2.equals(obj));
        return f(iC, objArr, i11);
    }

    boolean f(int i11, Object[] objArr, int i12) {
        int i13;
        Object obj;
        this.f117814c--;
        while (true) {
            int i14 = i11 + 1;
            while (true) {
                i13 = i14 & i12;
                obj = objArr[i13];
                if (obj == null) {
                    objArr[i11] = null;
                    return true;
                }
                int iC = c(obj.hashCode()) & i12;
                if (i11 <= i13) {
                    if (i11 >= iC || iC > i13) {
                        break;
                    }
                    i14 = i13 + 1;
                } else if (i11 < iC || iC <= i13) {
                    i14 = i13 + 1;
                }
            }
            objArr[i11] = obj;
            i11 = i13;
        }
    }

    public int g() {
        return this.f117814c;
    }

    public o(int i11, float f11) {
        this.f117812a = f11;
        int iA = p.a(i11);
        this.f117813b = iA - 1;
        this.f117815d = (int) (f11 * iA);
        this.f117816e = new Object[iA];
    }
}
