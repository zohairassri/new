package com.bumptech.glide.load.engine;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class GlideException extends Exception {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final StackTraceElement[] f18950g = new StackTraceElement[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f18951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ed.e f18952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ed.a f18953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Class f18954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f18955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Exception f18956f;

    public GlideException(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    private void a(Throwable th2, List list) {
        if (!(th2 instanceof GlideException)) {
            list.add(th2);
            return;
        }
        Iterator it = ((GlideException) th2).e().iterator();
        while (it.hasNext()) {
            a((Throwable) it.next(), list);
        }
    }

    private static void b(List list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    private static void c(List list, Appendable appendable) throws IOException {
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            appendable.append("Cause (").append(String.valueOf(i12)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th2 = (Throwable) list.get(i11);
            if (th2 instanceof GlideException) {
                ((GlideException) th2).h(appendable);
            } else {
                d(th2, appendable);
            }
            i11 = i12;
        }
    }

    private static void d(Throwable th2, Appendable appendable) {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    private void h(Appendable appendable) {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public List e() {
        return this.f18951a;
    }

    public List f() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    public void g(String str) {
        List listF = f();
        int size = listF.size();
        int i11 = 0;
        while (i11 < size) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Root cause (");
            int i12 = i11 + 1;
            sb2.append(i12);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i(str, sb2.toString(), (Throwable) listF.get(i11));
            i11 = i12;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f18955e);
        sb2.append(this.f18954d != null ? ", " + this.f18954d : "");
        sb2.append(this.f18953c != null ? ", " + this.f18953c : "");
        sb2.append(this.f18952b != null ? ", " + this.f18952b : "");
        List<Throwable> listF = f();
        if (listF.isEmpty()) {
            return sb2.toString();
        }
        if (listF.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(listF.size());
            sb2.append(" root causes:");
        }
        for (Throwable th2 : listF) {
            sb2.append('\n');
            sb2.append(th2.getClass().getName());
            sb2.append('(');
            sb2.append(th2.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    void i(ed.e eVar, ed.a aVar) {
        j(eVar, aVar, null);
    }

    void j(ed.e eVar, ed.a aVar, Class cls) {
        this.f18952b = eVar;
        this.f18953c = aVar;
        this.f18954d = cls;
    }

    public void k(Exception exc) {
        this.f18956f = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public GlideException(String str, Throwable th2) {
        this(str, Collections.singletonList(th2));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        h(printStream);
    }

    public GlideException(String str, List list) {
        this.f18955e = str;
        setStackTrace(f18950g);
        this.f18951a = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        h(printWriter);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class a implements Appendable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Appendable f18957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f18958b = true;

        a(Appendable appendable) {
            this.f18957a = appendable;
        }

        private CharSequence a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c11) throws IOException {
            if (this.f18958b) {
                this.f18958b = false;
                this.f18957a.append("  ");
            }
            this.f18958b = c11 == '\n';
            this.f18957a.append(c11);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence charSequenceA = a(charSequence);
            return append(charSequenceA, 0, charSequenceA.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i11, int i12) throws IOException {
            CharSequence charSequenceA = a(charSequence);
            boolean z11 = false;
            if (this.f18958b) {
                this.f18958b = false;
                this.f18957a.append("  ");
            }
            if (charSequenceA.length() > 0 && charSequenceA.charAt(i12 - 1) == '\n') {
                z11 = true;
            }
            this.f18958b = z11;
            this.f18957a.append(charSequenceA, i11, i12);
            return this;
        }
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }
}
