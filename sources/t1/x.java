package t1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f127892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f127893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f127894c;

    public x(int i11, long[] jArr, Object[] objArr) {
        this.f127892a = i11;
        this.f127893b = jArr;
        this.f127894c = objArr;
    }

    private final int a(long j11) {
        int i11 = this.f127892a - 1;
        if (i11 != -1) {
            int i12 = 0;
            if (i11 != 0) {
                while (i12 <= i11) {
                    int i13 = (i12 + i11) >>> 1;
                    long j12 = this.f127893b[i13] - j11;
                    if (j12 < 0) {
                        i12 = i13 + 1;
                    } else {
                        if (j12 <= 0) {
                            return i13;
                        }
                        i11 = i13 - 1;
                    }
                }
                return -(i12 + 1);
            }
            long j13 = this.f127893b[0];
            if (j13 == j11) {
                return 0;
            }
            if (j13 > j11) {
                return -2;
            }
        }
        return -1;
    }

    public final Object b(long j11) {
        int iA = a(j11);
        if (iA >= 0) {
            return this.f127894c[iA];
        }
        return null;
    }

    public final x c(long j11, Object obj) {
        int i11 = this.f127892a;
        int i12 = 0;
        int i13 = 0;
        for (Object obj2 : this.f127894c) {
            if (obj2 != null) {
                i13++;
            }
        }
        int i14 = i13 + 1;
        long[] jArr = new long[i14];
        Object[] objArr = new Object[i14];
        if (i14 > 1) {
            int i15 = 0;
            while (true) {
                if (i12 >= i14 || i15 >= i11) {
                    break;
                }
                long j12 = this.f127893b[i15];
                Object obj3 = this.f127894c[i15];
                if (j12 > j11) {
                    jArr[i12] = j11;
                    objArr[i12] = obj;
                    i12++;
                    break;
                }
                if (obj3 != null) {
                    jArr[i12] = j12;
                    objArr[i12] = obj3;
                    i12++;
                }
                i15++;
            }
            if (i15 == i11) {
                jArr[i13] = j11;
                objArr[i13] = obj;
            } else {
                while (i12 < i14) {
                    long j13 = this.f127893b[i15];
                    Object obj4 = this.f127894c[i15];
                    if (obj4 != null) {
                        jArr[i12] = j13;
                        objArr[i12] = obj4;
                        i12++;
                    }
                    i15++;
                }
            }
        } else {
            jArr[0] = j11;
            objArr[0] = obj;
        }
        return new x(i14, jArr, objArr);
    }

    public final boolean d(long j11, Object obj) {
        int iA = a(j11);
        if (iA < 0) {
            return false;
        }
        this.f127894c[iA] = obj;
        return true;
    }
}
