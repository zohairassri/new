package ll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import ll.w;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Comparator f114670h = new Comparator() { // from class: ll.u
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return w.a((w.b) obj, (w.b) obj2);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator f114671i = new Comparator() { // from class: ll.v
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((w.b) obj).f114681c, ((w.b) obj2).f114681c);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f114672a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f114676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f114677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f114678g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b[] f114674c = new b[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f114673b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f114675d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f114679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f114680b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f114681c;

        private b() {
        }
    }

    public w(int i11) {
        this.f114672a = i11;
    }

    public static /* synthetic */ int a(b bVar, b bVar2) {
        return bVar.f114679a - bVar2.f114679a;
    }

    private void d() {
        if (this.f114675d != 1) {
            Collections.sort(this.f114673b, f114670h);
            this.f114675d = 1;
        }
    }

    private void e() {
        if (this.f114675d != 0) {
            Collections.sort(this.f114673b, f114671i);
            this.f114675d = 0;
        }
    }

    public void c(int i11, float f11) {
        b bVar;
        d();
        int i12 = this.f114678g;
        if (i12 > 0) {
            b[] bVarArr = this.f114674c;
            int i13 = i12 - 1;
            this.f114678g = i13;
            bVar = bVarArr[i13];
        } else {
            bVar = new b();
        }
        int i14 = this.f114676e;
        this.f114676e = i14 + 1;
        bVar.f114679a = i14;
        bVar.f114680b = i11;
        bVar.f114681c = f11;
        this.f114673b.add(bVar);
        this.f114677f += i11;
        while (true) {
            int i15 = this.f114677f;
            int i16 = this.f114672a;
            if (i15 <= i16) {
                return;
            }
            int i17 = i15 - i16;
            b bVar2 = (b) this.f114673b.get(0);
            int i18 = bVar2.f114680b;
            if (i18 <= i17) {
                this.f114677f -= i18;
                this.f114673b.remove(0);
                int i19 = this.f114678g;
                if (i19 < 5) {
                    b[] bVarArr2 = this.f114674c;
                    this.f114678g = i19 + 1;
                    bVarArr2[i19] = bVar2;
                }
            } else {
                bVar2.f114680b = i18 - i17;
                this.f114677f -= i17;
            }
        }
    }

    public float f(float f11) {
        e();
        float f12 = f11 * this.f114677f;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f114673b.size(); i12++) {
            b bVar = (b) this.f114673b.get(i12);
            i11 += bVar.f114680b;
            if (i11 >= f12) {
                return bVar.f114681c;
            }
        }
        if (this.f114673b.isEmpty()) {
            return Float.NaN;
        }
        return ((b) this.f114673b.get(r4.size() - 1)).f114681c;
    }

    public void g() {
        this.f114673b.clear();
        this.f114675d = -1;
        this.f114676e = 0;
        this.f114677f = 0;
    }
}
