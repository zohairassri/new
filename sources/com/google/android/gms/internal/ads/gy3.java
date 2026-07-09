package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class gy3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f27418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f27419b = 0;

    static {
        Object objC = c();
        f27418a = objC;
        if (objC != null) {
            e("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (objC == null) {
            return;
        }
        d(objC);
    }

    public static void a(Throwable th2, Class cls) throws Throwable {
        if (cls.isInstance(th2)) {
            throw ((Throwable) cls.cast(th2));
        }
    }

    public static void b(Throwable th2) {
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
    }

    private static Object c() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e11) {
            throw e11;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Object obj) {
        try {
            Method methodE = e("getStackTraceDepth", Throwable.class);
            if (methodE == null) {
                return null;
            }
            methodE.invoke(obj, new Throwable());
            return methodE;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static Method e(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e11) {
            throw e11;
        } catch (Throwable unused) {
            return null;
        }
    }
}
