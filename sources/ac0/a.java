package ac0;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f818a = new a();

    private a() {
    }

    public static final RuntimeException a(Throwable th2) {
        if (th2 instanceof InvocationTargetException) {
            throw a(((InvocationTargetException) th2).getCause());
        }
        if (th2 instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        throw new RuntimeException(th2);
    }
}
