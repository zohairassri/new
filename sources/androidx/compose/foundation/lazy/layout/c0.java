package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {
    public static final int a(b0 b0Var, Object obj, int i11) {
        int iC;
        return (obj == null || b0Var.a() == 0 || (i11 < b0Var.a() && Intrinsics.areEqual(obj, b0Var.d(i11))) || (iC = b0Var.c(obj)) == -1) ? i11 : iC;
    }
}
