package l0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m3.g0 f112869a = new x5(m3.g0.f115656a.a(), 0, 0);

    public static final m3.a1 c(m3.c1 c1Var, h3.e eVar) {
        m3.a1 a1VarA = c1Var.a(eVar);
        f(a1VarA, eVar.length(), 0, 2, null);
        return new m3.a1(a1VarA.b(), new x5(a1VarA.a(), eVar.length(), a1VarA.b().length()));
    }

    public static final m3.g0 d() {
        return f112869a;
    }

    public static final void e(m3.a1 a1Var, int i11, int i12) {
        int length = a1Var.b().length();
        int iMin = Math.min(i11, i12);
        for (int i13 = 0; i13 < iMin; i13++) {
            g(a1Var.a().b(i13), length, i13);
        }
        g(a1Var.a().b(i11), length, i11);
        int iMin2 = Math.min(length, i12);
        for (int i14 = 0; i14 < iMin2; i14++) {
            h(a1Var.a().a(i14), i11, i14);
        }
        h(a1Var.a().a(length), i11, length);
    }

    public static /* synthetic */ void f(m3.a1 a1Var, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 100;
        }
        e(a1Var, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(int i11, int i12, int i13) {
        boolean z11 = false;
        if (i11 >= 0 && i11 <= i12) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        c0.e.c("OffsetMapping.originalToTransformed returned invalid mapping: " + i13 + " -> " + i11 + " is not in range of transformed text [0, " + i12 + ']');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(int i11, int i12, int i13) {
        boolean z11 = false;
        if (i11 >= 0 && i11 <= i12) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        c0.e.c("OffsetMapping.transformedToOriginal returned invalid mapping: " + i13 + " -> " + i11 + " is not in range of original text [0, " + i12 + ']');
    }
}
