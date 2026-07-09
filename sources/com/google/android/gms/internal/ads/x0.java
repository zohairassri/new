package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class x0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f37704c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f37706e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private w0 f37702a = new w0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private w0 f37703b = new w0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f37705d = -9223372036854775807L;

    public final void a() {
        this.f37702a.a();
        this.f37703b.a();
        this.f37704c = false;
        this.f37705d = -9223372036854775807L;
        this.f37706e = 0;
    }

    public final void b(long j11) {
        this.f37702a.f(j11);
        if (this.f37702a.b()) {
            this.f37704c = false;
        } else if (this.f37705d != -9223372036854775807L) {
            if (!this.f37704c || this.f37703b.c()) {
                this.f37703b.a();
                this.f37703b.f(this.f37705d);
            }
            this.f37704c = true;
            this.f37703b.f(j11);
        }
        if (this.f37704c && this.f37703b.b()) {
            w0 w0Var = this.f37702a;
            this.f37702a = this.f37703b;
            this.f37703b = w0Var;
            this.f37704c = false;
        }
        this.f37705d = j11;
        this.f37706e = this.f37702a.b() ? 0 : this.f37706e + 1;
    }

    public final boolean c() {
        return this.f37702a.b();
    }

    public final int d() {
        return this.f37706e;
    }

    public final long e() {
        if (this.f37702a.b()) {
            return this.f37702a.d();
        }
        return -9223372036854775807L;
    }

    public final long f() {
        if (this.f37702a.b()) {
            return this.f37702a.e();
        }
        return -9223372036854775807L;
    }

    public final float g() {
        if (this.f37702a.b()) {
            return (float) (1.0E9d / this.f37702a.e());
        }
        return -1.0f;
    }
}
