package f6;

import androidx.lifecycle.t0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f93746a = new e();

    private e() {
    }

    public final t0 a(Class modelClass) throws InvocationTargetException {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        try {
            Constructor declaredConstructor = modelClass.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + modelClass);
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                Intrinsics.checkNotNull(objNewInstance);
                return (t0) objNewInstance;
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e11);
            } catch (InstantiationException e12) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e12);
            }
        } catch (NoSuchMethodException e13) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e13);
        }
    }
}
