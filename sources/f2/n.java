package f2;

import android.graphics.DashPathEffect;
import android.graphics.PathEffect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final i1 a(float[] fArr, float f11) {
        return new m(new DashPathEffect(fArr, f11));
    }

    public static final PathEffect b(i1 i1Var) {
        Intrinsics.checkNotNull(i1Var, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return ((m) i1Var).a();
    }
}
