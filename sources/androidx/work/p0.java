package androidx.work;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class p0 {
    public static final Object a(o0 o0Var, String label, Function0 block) {
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean zIsEnabled = o0Var.isEnabled();
        if (zIsEnabled) {
            try {
                o0Var.a(label);
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                if (zIsEnabled) {
                    o0Var.d();
                }
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
        Object objInvoke = block.invoke();
        InlineMarker.finallyStart(1);
        if (zIsEnabled) {
            o0Var.d();
        }
        InlineMarker.finallyEnd(1);
        return objInvoke;
    }
}
