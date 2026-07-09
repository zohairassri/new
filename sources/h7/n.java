package h7;

import h7.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Comparator f100517h = new Comparator() { // from class: h7.l
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return n.b((n.b) obj, (n.b) obj2);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator f100518i = new Comparator() { // from class: h7.m
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((n.b) obj).f100528c, ((n.b) obj2).f100528c);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f100519a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f100523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f100524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f100525g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b[] f100521c = new b[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f100520b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f100522d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f100526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f100527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f100528c;

        private b() {
        }
    }

    public n(int i11) {
        this.f100519a = i11;
    }

    public static /* synthetic */ int b(b bVar, b bVar2) {
        return bVar.f100526a - bVar2.f100526a;
    }

    private void d() {
        if (this.f100522d != 1) {
            Collections.sort(this.f100520b, f100517h);
            this.f100522d = 1;
        }
    }

    private void e() {
        if (this.f100522d != 0) {
            Collections.sort(this.f100520b, f100518i);
            this.f100522d = 0;
        }
    }

    public void c(int i11, float f11) {
        b bVar;
        d();
        int i12 = this.f100525g;
        if (i12 > 0) {
            b[] bVarArr = this.f100521c;
            int i13 = i12 - 1;
            this.f100525g = i13;
            bVar = bVarArr[i13];
        } else {
            bVar = new b();
        }
        int i14 = this.f100523e;
        this.f100523e = i14 + 1;
        bVar.f100526a = i14;
        bVar.f100527b = i11;
        bVar.f100528c = f11;
        this.f100520b.add(bVar);
        this.f100524f += i11;
        while (true) {
            int i15 = this.f100524f;
            int i16 = this.f100519a;
            if (i15 <= i16) {
                return;
            }
            int i17 = i15 - i16;
            b bVar2 = (b) this.f100520b.get(0);
            int i18 = bVar2.f100527b;
            if (i18 <= i17) {
                this.f100524f -= i18;
                this.f100520b.remove(0);
                int i19 = this.f100525g;
                if (i19 < 5) {
                    b[] bVarArr2 = this.f100521c;
                    this.f100525g = i19 + 1;
                    bVarArr2[i19] = bVar2;
                }
            } else {
                bVar2.f100527b = i18 - i17;
                this.f100524f -= i17;
            }
        }
    }

    public float f(float f11) {
        e();
        float f12 = f11 * this.f100524f;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f100520b.size(); i12++) {
            b bVar = (b) this.f100520b.get(i12);
            i11 += bVar.f100527b;
            if (i11 >= f12) {
                return bVar.f100528c;
            }
        }
        if (this.f100520b.isEmpty()) {
            return Float.NaN;
        }
        return ((b) this.f100520b.get(r4.size() - 1)).f100528c;
    }

    public void g() {
        this.f100520b.clear();
        this.f100522d = -1;
        this.f100523e = 0;
        this.f100524f = 0;
    }
}
