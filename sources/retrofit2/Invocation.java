package retrofit2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class Invocation {
    private final List<?> arguments;
    private final Object instance;
    private final Method method;
    private final Class<?> service;

    Invocation(Class<?> cls, Object obj, Method method, List<?> list) {
        this.service = cls;
        this.instance = obj;
        this.method = method;
        this.arguments = Collections.unmodifiableList(list);
    }

    public static <T> Invocation of(Class<T> cls, T t11, Method method, List<?> list) {
        Objects.requireNonNull(cls, "service == null");
        Objects.requireNonNull(t11, "instance == null");
        Objects.requireNonNull(method, "method == null");
        Objects.requireNonNull(list, "arguments == null");
        return new Invocation(cls, t11, method, new ArrayList(list));
    }

    public List<?> arguments() {
        return this.arguments;
    }

    public Object instance() {
        return this.instance;
    }

    public Method method() {
        return this.method;
    }

    public Class<?> service() {
        return this.service;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.service.getName(), this.method.getName(), this.arguments);
    }

    @Deprecated
    public static Invocation of(Method method, List<?> list) {
        Objects.requireNonNull(method, "method == null");
        Objects.requireNonNull(list, "arguments == null");
        return new Invocation(method.getDeclaringClass(), null, method, new ArrayList(list));
    }
}
