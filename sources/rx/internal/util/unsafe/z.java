package rx.internal.util.unsafe;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f125296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f125297b;

    static {
        f125297b = System.getProperty("rx.unsafe-disable") != null;
        Unsafe unsafe = null;
        try {
            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            unsafe = (Unsafe) declaredField.get(null);
        } catch (Throwable unused) {
        }
        f125296a = unsafe;
    }

    public static long a(Class cls, String str) {
        try {
            return f125296a.objectFieldOffset(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e11) {
            InternalError internalError = new InternalError();
            internalError.initCause(e11);
            throw internalError;
        }
    }

    public static boolean b() {
        return (f125296a == null || f125297b) ? false : true;
    }
}
