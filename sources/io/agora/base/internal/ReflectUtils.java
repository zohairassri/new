package io.agora.base.internal;

import com.amazonaws.services.s3.model.InstructionFileId;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class ReflectUtils {
    private static final String TAG = "ReflectUtils";

    public static Object safeCallMethod(Class<?> cls, Object obj, String str, Class<?>[] clsArr, Object[] objArr) {
        Method method;
        try {
            method = cls.getMethod(str, clsArr);
        } catch (Throwable th2) {
            th2.printStackTrace();
            method = null;
        }
        if (method == null) {
            Logging.e(TAG, "cannot find method:  " + cls.getSimpleName() + InstructionFileId.DOT + str + ":" + Arrays.toString(clsArr));
            return null;
        }
        try {
            return method.invoke(obj, objArr);
        } catch (Throwable th3) {
            Logging.e(TAG, "cannot execute method:  " + cls.getSimpleName() + InstructionFileId.DOT + str + ":" + Arrays.toString(clsArr));
            th3.printStackTrace();
            return null;
        }
    }

    public static Class<?> safeFindClass(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    public static Method safeGetMethod(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }
}
