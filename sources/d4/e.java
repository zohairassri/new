package d4;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d4.b f89158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f89159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f89160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f89161d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f89162e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f89163f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ArrayList f89164g = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            return Integer.compare(cVar.f89182a, cVar2.f89182a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f89166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        h f89167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f89168c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f89169d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f89170e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float[] f89171f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        double[] f89172g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float[] f89173h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float[] f89174i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float[] f89175j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float[] f89176k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f89177l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        d4.b f89178m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        double[] f89179n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        double[] f89180o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f89181p;

        b(int i11, String str, int i12, int i13) {
            h hVar = new h();
            this.f89167b = hVar;
            this.f89168c = 0;
            this.f89169d = 1;
            this.f89170e = 2;
            this.f89177l = i11;
            this.f89166a = i12;
            hVar.g(i11, str);
            this.f89171f = new float[i13];
            this.f89172g = new double[i13];
            this.f89173h = new float[i13];
            this.f89174i = new float[i13];
            this.f89175j = new float[i13];
            this.f89176k = new float[i13];
        }

        public double a(float f11) {
            d4.b bVar = this.f89178m;
            if (bVar != null) {
                double d11 = f11;
                bVar.g(d11, this.f89180o);
                this.f89178m.d(d11, this.f89179n);
            } else {
                double[] dArr = this.f89180o;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d12 = f11;
            double dE = this.f89167b.e(d12, this.f89179n[1]);
            double d13 = this.f89167b.d(d12, this.f89179n[1], this.f89180o[1]);
            double[] dArr2 = this.f89180o;
            return dArr2[0] + (dE * dArr2[2]) + (d13 * this.f89179n[2]);
        }

        public double b(float f11) {
            d4.b bVar = this.f89178m;
            if (bVar != null) {
                bVar.d(f11, this.f89179n);
            } else {
                double[] dArr = this.f89179n;
                dArr[0] = this.f89174i[0];
                dArr[1] = this.f89175j[0];
                dArr[2] = this.f89171f[0];
            }
            double[] dArr2 = this.f89179n;
            return dArr2[0] + (this.f89167b.e(f11, dArr2[1]) * this.f89179n[2]);
        }

        public void c(int i11, int i12, float f11, float f12, float f13, float f14) {
            this.f89172g[i11] = ((double) i12) / 100.0d;
            this.f89173h[i11] = f11;
            this.f89174i[i11] = f12;
            this.f89175j[i11] = f13;
            this.f89171f[i11] = f14;
        }

        public void d(float f11) {
            this.f89181p = f11;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.f89172g.length, 3);
            float[] fArr = this.f89171f;
            this.f89179n = new double[fArr.length + 2];
            this.f89180o = new double[fArr.length + 2];
            if (this.f89172g[0] > 0.0d) {
                this.f89167b.a(0.0d, this.f89173h[0]);
            }
            double[] dArr2 = this.f89172g;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.f89167b.a(1.0d, this.f89173h[length]);
            }
            for (int i11 = 0; i11 < dArr.length; i11++) {
                double[] dArr3 = dArr[i11];
                dArr3[0] = this.f89174i[i11];
                dArr3[1] = this.f89175j[i11];
                dArr3[2] = this.f89171f[i11];
                this.f89167b.a(this.f89172g[i11], this.f89173h[i11]);
            }
            this.f89167b.f();
            double[] dArr4 = this.f89172g;
            if (dArr4.length > 1) {
                this.f89178m = d4.b.a(0, dArr4, dArr);
            } else {
                this.f89178m = null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f89182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f89183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f89184c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f89185d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f89186e;

        c(int i11, float f11, float f12, float f13, float f14) {
            this.f89182a = i11;
            this.f89183b = f14;
            this.f89184c = f12;
            this.f89185d = f11;
            this.f89186e = f13;
        }
    }

    public float a(float f11) {
        return (float) this.f89159b.b(f11);
    }

    public float b(float f11) {
        return (float) this.f89159b.a(f11);
    }

    public void d(int i11, int i12, String str, int i13, float f11, float f12, float f13, float f14) {
        this.f89164g.add(new c(i11, f11, f12, f13, f14));
        if (i13 != -1) {
            this.f89163f = i13;
        }
        this.f89161d = i12;
        this.f89162e = str;
    }

    public void e(int i11, int i12, String str, int i13, float f11, float f12, float f13, float f14, Object obj) {
        this.f89164g.add(new c(i11, f11, f12, f13, f14));
        if (i13 != -1) {
            this.f89163f = i13;
        }
        this.f89161d = i12;
        c(obj);
        this.f89162e = str;
    }

    public void f(String str) {
        this.f89160c = str;
    }

    public void g(float f11) {
        int size = this.f89164g.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f89164g, new a());
        double[] dArr = new double[size];
        char c11 = 2;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        this.f89159b = new b(this.f89161d, this.f89162e, this.f89163f, size);
        ArrayList arrayList = this.f89164g;
        int size2 = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i11 < size2) {
            int i13 = i11 + 1;
            c cVar = (c) arrayList.get(i11);
            float f12 = cVar.f89185d;
            dArr[i12] = ((double) f12) * 0.01d;
            double[] dArr3 = dArr2[i12];
            float f13 = cVar.f89183b;
            dArr3[0] = f13;
            float f14 = cVar.f89184c;
            char c12 = c11;
            dArr3[1] = f14;
            float f15 = cVar.f89186e;
            dArr3[c12] = f15;
            this.f89159b.c(i12, cVar.f89182a, f12, f14, f15, f13);
            i12++;
            i11 = i13;
            c11 = c12;
            dArr2 = dArr2;
        }
        this.f89159b.d(f11);
        this.f89158a = d4.b.a(0, dArr, dArr2);
    }

    public boolean h() {
        return this.f89163f == 1;
    }

    public String toString() {
        String str = this.f89160c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        ArrayList arrayList = this.f89164g;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            str = str + "[" + ((c) obj).f89182a + " , " + decimalFormat.format(r4.f89183b) + "] ";
        }
        return str;
    }

    protected void c(Object obj) {
    }
}
