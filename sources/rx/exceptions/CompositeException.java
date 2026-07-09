package rx.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class CompositeException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f125207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f125208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Throwable f125209c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class b extends RuntimeException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static String f125210a = "Chain of Causes for CompositeException In Order Received =>";

        b() {
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return f125210a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static abstract class c {
        private c() {
        }

        abstract Object a();

        abstract void b(Object obj);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class d extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final PrintStream f125211a;

        d(PrintStream printStream) {
            super();
            this.f125211a = printStream;
        }

        @Override // rx.exceptions.CompositeException.c
        Object a() {
            return this.f125211a;
        }

        @Override // rx.exceptions.CompositeException.c
        void b(Object obj) {
            this.f125211a.println(obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class e extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final PrintWriter f125212a;

        e(PrintWriter printWriter) {
            super();
            this.f125212a = printWriter;
        }

        @Override // rx.exceptions.CompositeException.c
        Object a() {
            return this.f125212a;
        }

        @Override // rx.exceptions.CompositeException.c
        void b(Object obj) {
            this.f125212a.println(obj);
        }
    }

    public CompositeException(String str, Collection collection) {
        this.f125209c = null;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Throwable th2 = (Throwable) it.next();
                if (th2 instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th2).b());
                } else if (th2 != null) {
                    linkedHashSet.add(th2);
                } else {
                    linkedHashSet.add(new NullPointerException());
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException());
        }
        arrayList.addAll(linkedHashSet);
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        this.f125207a = listUnmodifiableList;
        this.f125208b = listUnmodifiableList.size() + " exceptions occurred. ";
    }

    private void a(StringBuilder sb2, Throwable th2, String str) {
        sb2.append(str);
        sb2.append(th2);
        sb2.append("\n");
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            sb2.append("\t\tat ");
            sb2.append(stackTraceElement);
            sb2.append("\n");
        }
        if (th2.getCause() != null) {
            sb2.append("\tCaused by: ");
            a(sb2, th2.getCause(), "");
        }
    }

    private List c(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th2.getCause();
        if (cause != null) {
            while (true) {
                arrayList.add(cause);
                if (cause.getCause() == null) {
                    break;
                }
                cause = cause.getCause();
            }
        }
        return arrayList;
    }

    private void d(c cVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this);
        sb2.append("\n");
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb2.append("\tat ");
            sb2.append(stackTraceElement);
            sb2.append("\n");
        }
        int i11 = 1;
        for (Throwable th2 : this.f125207a) {
            sb2.append("  ComposedException ");
            sb2.append(i11);
            sb2.append(" :");
            sb2.append("\n");
            a(sb2, th2, "\t");
            i11++;
        }
        synchronized (cVar.a()) {
            cVar.b(sb2.toString());
        }
    }

    public List b() {
        return this.f125207a;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        try {
            if (this.f125209c == null) {
                b bVar = new b();
                HashSet hashSet = new HashSet();
                Throwable cause = bVar;
                for (Throwable runtimeException : this.f125207a) {
                    if (!hashSet.contains(runtimeException)) {
                        hashSet.add(runtimeException);
                        for (Throwable th2 : c(runtimeException)) {
                            if (hashSet.contains(th2)) {
                                runtimeException = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th2);
                            }
                        }
                        try {
                            cause.initCause(runtimeException);
                            cause = cause.getCause();
                        } catch (Throwable unused) {
                            cause = runtimeException;
                        }
                    }
                }
                this.f125209c = bVar;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.f125209c;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f125208b;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        d(new d(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        d(new e(printWriter));
    }

    public CompositeException(Collection collection) {
        this(null, collection);
    }
}
