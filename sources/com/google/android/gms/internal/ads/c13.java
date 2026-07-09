package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class c13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b13 f24341a = new b13();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f24343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f24344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f24345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f24346f;

    c13() {
    }

    public final void a() {
        this.f24344d++;
    }

    public final void b() {
        this.f24345e++;
    }

    public final void c() {
        this.f24342b++;
        this.f24341a.f23644a = true;
    }

    public final void d() {
        this.f24343c++;
        this.f24341a.f23645b = true;
    }

    public final void e() {
        this.f24346f++;
    }

    public final b13 f() {
        b13 b13Var = this.f24341a;
        b13 b13VarClone = b13Var.clone();
        b13Var.f23644a = false;
        b13Var.f23645b = false;
        return b13VarClone;
    }

    public final String g() {
        return "\n\tPool does not exist: " + this.f24344d + "\n\tNew pools created: " + this.f24342b + "\n\tPools removed: " + this.f24343c + "\n\tEntries added: " + this.f24346f + "\n\tNo entries retrieved: " + this.f24345e + "\n";
    }
}
