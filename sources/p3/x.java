package p3;

import android.graphics.Typeface;
import androidx.compose.runtime.i5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i5 f121166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f121167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f121168c;

    public x(i5 i5Var, x xVar) {
        this.f121166a = i5Var;
        this.f121167b = xVar;
        this.f121168c = i5Var.getValue();
    }

    public final Typeface a() {
        Object obj = this.f121168c;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    public final boolean b() {
        if (this.f121166a.getValue() != this.f121168c) {
            return true;
        }
        x xVar = this.f121167b;
        return xVar != null && xVar.b();
    }
}
