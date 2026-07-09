package ne0;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import w.c1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Throwable f117805a = new a();

    public static boolean a(AtomicReference atomicReference, Throwable th2) {
        Throwable th3;
        do {
            th3 = (Throwable) atomicReference.get();
            if (th3 == f117805a) {
                return false;
            }
        } while (!c1.a(atomicReference, th3, th3 == null ? th2 : new CompositeException(th3, th2)));
        return true;
    }

    public static Throwable b(AtomicReference atomicReference) {
        Throwable th2 = (Throwable) atomicReference.get();
        Throwable th3 = f117805a;
        return th2 != th3 ? (Throwable) atomicReference.getAndSet(th3) : th2;
    }

    public static String c(long j11, TimeUnit timeUnit) {
        return "The source did not signal an event for " + j11 + " " + timeUnit.toString().toLowerCase() + " and has been terminated.";
    }

    public static RuntimeException d(Throwable th2) {
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
        return th2 instanceof RuntimeException ? (RuntimeException) th2 : new RuntimeException(th2);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class a extends Throwable {
        a() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            return this;
        }
    }
}
