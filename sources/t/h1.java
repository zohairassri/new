package t;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f127551a = new Object();

    public static final Object c(g1 g1Var, int i11) {
        Object obj;
        Intrinsics.checkNotNullParameter(g1Var, "<this>");
        int iA = u.a.a(g1Var.f127536b, g1Var.f127538d, i11);
        if (iA < 0 || (obj = g1Var.f127537c[iA]) == f127551a) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(g1 g1Var) {
        int i11 = g1Var.f127538d;
        int[] iArr = g1Var.f127536b;
        Object[] objArr = g1Var.f127537c;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[i13];
            if (obj != f127551a) {
                if (i13 != i12) {
                    iArr[i12] = iArr[i13];
                    objArr[i12] = obj;
                    objArr[i13] = null;
                }
                i12++;
            }
        }
        g1Var.f127535a = false;
        g1Var.f127538d = i12;
    }
}
