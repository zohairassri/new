package bm;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f14798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double[] f14799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double[] f14800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f14801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f14802e;

    /* synthetic */ e0(d0 d0Var, byte[] bArr) {
        int size = d0Var.d().size();
        this.f14798a = (String[]) d0Var.c().toArray(new String[size]);
        this.f14799b = c(d0Var.d());
        this.f14800c = c(d0Var.e());
        this.f14801d = new int[size];
        this.f14802e = 0;
    }

    private static final double[] c(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i11 = 0; i11 < size; i11++) {
            dArr[i11] = ((Double) list.get(i11)).doubleValue();
        }
        return dArr;
    }

    public final void a(double d11) {
        this.f14802e++;
        int i11 = 0;
        while (true) {
            double[] dArr = this.f14800c;
            if (i11 >= dArr.length) {
                return;
            }
            double d12 = dArr[i11];
            if (d12 <= d11 && d11 < this.f14799b[i11]) {
                int[] iArr = this.f14801d;
                iArr[i11] = iArr[i11] + 1;
            }
            if (d11 < d12) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final List b() {
        String[] strArr = this.f14798a;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (int i11 = 0; i11 < strArr.length; i11++) {
            String str = strArr[i11];
            double[] dArr = this.f14800c;
            double[] dArr2 = this.f14799b;
            int[] iArr = this.f14801d;
            double d11 = dArr[i11];
            double d12 = dArr2[i11];
            int i12 = iArr[i11];
            arrayList.add(new c0(str, d11, d12, ((double) i12) / ((double) this.f14802e), i12));
        }
        return arrayList;
    }
}
