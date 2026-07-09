package c4;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class i implements Comparable {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static int f17178y = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f17180b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f17184f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    a f17188l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17181c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f17182d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17183e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17185g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float[] f17186h = new float[9];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float[] f17187i = new float[9];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    b[] f17189m = new b[16];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f17190n = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17191r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean f17192s = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f17193v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    float f17194w = 0.0f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    HashSet f17195x = null;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f17188l = aVar;
    }

    static void c() {
        f17178y++;
    }

    public final void a(b bVar) {
        int i11 = 0;
        while (true) {
            int i12 = this.f17190n;
            if (i11 >= i12) {
                b[] bVarArr = this.f17189m;
                if (i12 >= bVarArr.length) {
                    this.f17189m = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f17189m;
                int i13 = this.f17190n;
                bVarArr2[i13] = bVar;
                this.f17190n = i13 + 1;
                return;
            }
            if (this.f17189m[i11] == bVar) {
                return;
            } else {
                i11++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return this.f17181c - iVar.f17181c;
    }

    public final void e(b bVar) {
        int i11 = this.f17190n;
        int i12 = 0;
        while (i12 < i11) {
            if (this.f17189m[i12] == bVar) {
                while (i12 < i11 - 1) {
                    b[] bVarArr = this.f17189m;
                    int i13 = i12 + 1;
                    bVarArr[i12] = bVarArr[i13];
                    i12 = i13;
                }
                this.f17190n--;
                return;
            }
            i12++;
        }
    }

    public void f() {
        this.f17180b = null;
        this.f17188l = a.UNKNOWN;
        this.f17183e = 0;
        this.f17181c = -1;
        this.f17182d = -1;
        this.f17184f = 0.0f;
        this.f17185g = false;
        this.f17192s = false;
        this.f17193v = -1;
        this.f17194w = 0.0f;
        int i11 = this.f17190n;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f17189m[i12] = null;
        }
        this.f17190n = 0;
        this.f17191r = 0;
        this.f17179a = false;
        Arrays.fill(this.f17187i, 0.0f);
    }

    public void g(d dVar, float f11) {
        this.f17184f = f11;
        this.f17185g = true;
        this.f17192s = false;
        this.f17193v = -1;
        this.f17194w = 0.0f;
        int i11 = this.f17190n;
        this.f17182d = -1;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f17189m[i12].A(dVar, this, false);
        }
        this.f17190n = 0;
    }

    public void h(a aVar, String str) {
        this.f17188l = aVar;
    }

    public final void j(d dVar, b bVar) {
        int i11 = this.f17190n;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f17189m[i12].B(dVar, bVar, false);
        }
        this.f17190n = 0;
    }

    public String toString() {
        if (this.f17180b != null) {
            return "" + this.f17180b;
        }
        return "" + this.f17181c;
    }
}
