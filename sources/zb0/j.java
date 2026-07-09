package zb0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class j {
    public static final StackTraceElement[] a(Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        try {
            return th2.getStackTrace();
        } catch (Exception unused) {
            return null;
        }
    }
}
