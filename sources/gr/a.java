package gr;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile a f98916c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f98917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f98918b;

    public a(c cVar) {
        this.f98918b = false;
        this.f98917a = cVar == null ? c.c() : cVar;
    }

    public static a e() {
        if (f98916c == null) {
            synchronized (a.class) {
                try {
                    if (f98916c == null) {
                        f98916c = new a();
                    }
                } finally {
                }
            }
        }
        return f98916c;
    }

    public void a(String str) {
        if (this.f98918b) {
            this.f98917a.a(str);
        }
    }

    public void b(String str, Object... objArr) {
        if (this.f98918b) {
            this.f98917a.a(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void c(String str) {
        if (this.f98918b) {
            this.f98917a.b(str);
        }
    }

    public void d(String str, Object... objArr) {
        if (this.f98918b) {
            this.f98917a.b(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void f(String str) {
        if (this.f98918b) {
            this.f98917a.d(str);
        }
    }

    public void g(String str, Object... objArr) {
        if (this.f98918b) {
            this.f98917a.d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public boolean h() {
        return this.f98918b;
    }

    public void i(boolean z11) {
        this.f98918b = z11;
    }

    public void j(String str) {
        if (this.f98918b) {
            this.f98917a.e(str);
        }
    }

    public void k(String str, Object... objArr) {
        if (this.f98918b) {
            this.f98917a.e(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    private a() {
        this(null);
    }
}
