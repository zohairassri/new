package hi0;

import java.util.HashSet;
import java.util.List;
import rx.c;
import rx.exceptions.CompositeException;
import rx.exceptions.OnCompletedFailedException;
import rx.exceptions.OnErrorFailedException;
import rx.exceptions.OnErrorNotImplementedException;
import rx.exceptions.OnErrorThrowable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public static void a(Throwable th2, Throwable th3) {
        HashSet hashSet = new HashSet();
        int i11 = 0;
        while (th2.getCause() != null) {
            int i12 = i11 + 1;
            if (i11 >= 25) {
                return;
            }
            th2 = th2.getCause();
            if (!hashSet.contains(th2.getCause())) {
                hashSet.add(th2.getCause());
                i11 = i12;
            }
        }
        try {
            th2.initCause(th3);
        } catch (Throwable unused) {
        }
    }

    public static Throwable b(Throwable th2) {
        int i11 = 0;
        while (th2.getCause() != null) {
            int i12 = i11 + 1;
            if (i11 >= 25) {
                return new RuntimeException("Stack too deep to get final cause");
            }
            th2 = th2.getCause();
            i11 = i12;
        }
        return th2;
    }

    public static void c(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (list.size() != 1) {
            throw new CompositeException(list);
        }
        Throwable th2 = (Throwable) list.get(0);
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (!(th2 instanceof Error)) {
            throw new RuntimeException(th2);
        }
        throw ((Error) th2);
    }

    public static void d(Throwable th2) {
        if (th2 instanceof OnErrorNotImplementedException) {
            throw ((OnErrorNotImplementedException) th2);
        }
        if (th2 instanceof OnErrorFailedException) {
            throw ((OnErrorFailedException) th2);
        }
        if (th2 instanceof OnCompletedFailedException) {
            throw ((OnCompletedFailedException) th2);
        }
        if (th2 instanceof StackOverflowError) {
            throw ((StackOverflowError) th2);
        }
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }

    public static void e(Throwable th2, c cVar) {
        d(th2);
        cVar.onError(th2);
    }

    public static void f(Throwable th2, c cVar, Object obj) {
        d(th2);
        cVar.onError(OnErrorThrowable.a(th2, obj));
    }
}
