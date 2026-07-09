package androidx.work;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13545a;

    static {
        String strI = z.i("InputMerger");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"InputMerger\")");
        f13545a = strI;
    }

    public static final p a(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        try {
            Object objNewInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
            return (p) objNewInstance;
        } catch (Exception e11) {
            z.e().d(f13545a, "Trouble instantiating " + className, e11);
            return null;
        }
    }
}
