package zb;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f142076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f142077b;

    public d(float[] fArr, int[] iArr) {
        this.f142076a = fArr;
        this.f142077b = iArr;
    }

    private void a(d dVar) {
        int i11 = 0;
        while (true) {
            int[] iArr = dVar.f142077b;
            if (i11 >= iArr.length) {
                return;
            }
            this.f142076a[i11] = dVar.f142076a[i11];
            this.f142077b[i11] = iArr[i11];
            i11++;
        }
    }

    private int c(float f11) {
        int iBinarySearch = Arrays.binarySearch(this.f142076a, f11);
        if (iBinarySearch >= 0) {
            return this.f142077b[iBinarySearch];
        }
        int i11 = -(iBinarySearch + 1);
        if (i11 == 0) {
            return this.f142077b[0];
        }
        int[] iArr = this.f142077b;
        if (i11 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.f142076a;
        int i12 = i11 - 1;
        float f12 = fArr[i12];
        return ec.b.c((f11 - f12) / (fArr[i11] - f12), iArr[i12], iArr[i11]);
    }

    public d b(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i11 = 0; i11 < fArr.length; i11++) {
            iArr[i11] = c(fArr[i11]);
        }
        return new d(fArr, iArr);
    }

    public int[] d() {
        return this.f142077b;
    }

    public float[] e() {
        return this.f142076a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            if (Arrays.equals(this.f142076a, dVar.f142076a) && Arrays.equals(this.f142077b, dVar.f142077b)) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f142077b.length;
    }

    public void g(d dVar, d dVar2, float f11) {
        int[] iArr;
        if (dVar.equals(dVar2)) {
            a(dVar);
            return;
        }
        if (f11 <= 0.0f) {
            a(dVar);
            return;
        }
        if (f11 >= 1.0f) {
            a(dVar2);
            return;
        }
        if (dVar.f142077b.length != dVar2.f142077b.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + dVar.f142077b.length + " vs " + dVar2.f142077b.length + ")");
        }
        int i11 = 0;
        while (true) {
            iArr = dVar.f142077b;
            if (i11 >= iArr.length) {
                break;
            }
            this.f142076a[i11] = ec.i.i(dVar.f142076a[i11], dVar2.f142076a[i11], f11);
            this.f142077b[i11] = ec.b.c(f11, dVar.f142077b[i11], dVar2.f142077b[i11]);
            i11++;
        }
        int length = iArr.length;
        while (true) {
            float[] fArr = this.f142076a;
            if (length >= fArr.length) {
                return;
            }
            int[] iArr2 = dVar.f142077b;
            fArr[length] = fArr[iArr2.length - 1];
            int[] iArr3 = this.f142077b;
            iArr3[length] = iArr3[iArr2.length - 1];
            length++;
        }
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f142076a) * 31) + Arrays.hashCode(this.f142077b);
    }
}
