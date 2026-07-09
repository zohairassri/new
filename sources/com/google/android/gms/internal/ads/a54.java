package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class a54 extends y44 {
    /* synthetic */ a54(byte[] bArr) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.y44
    public final void a(c54 c54Var, Thread thread) {
        c54Var.f24396a = thread;
    }

    @Override // com.google.android.gms.internal.ads.y44
    final void b(c54 c54Var, c54 c54Var2) {
        c54Var.f24397b = c54Var2;
    }

    @Override // com.google.android.gms.internal.ads.y44
    final boolean c(d54 d54Var, c54 c54Var, c54 c54Var2) {
        synchronized (d54Var) {
            try {
                if (d54Var.f24889c != c54Var) {
                    return false;
                }
                d54Var.f24889c = c54Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.y44
    final boolean d(d54 d54Var, u44 u44Var, u44 u44Var2) {
        synchronized (d54Var) {
            try {
                if (d54Var.f24888b != u44Var) {
                    return false;
                }
                d54Var.f24888b = u44Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.y44
    final c54 e(d54 d54Var, c54 c54Var) {
        c54 c54Var2;
        synchronized (d54Var) {
            try {
                c54Var2 = d54Var.f24889c;
                if (c54Var2 != c54Var) {
                    d54Var.f24889c = c54Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c54Var2;
    }

    @Override // com.google.android.gms.internal.ads.y44
    final u44 f(d54 d54Var, u44 u44Var) {
        u44 u44Var2;
        synchronized (d54Var) {
            try {
                u44Var2 = d54Var.f24888b;
                if (u44Var2 != u44Var) {
                    d54Var.f24888b = u44Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return u44Var2;
    }

    @Override // com.google.android.gms.internal.ads.y44
    final boolean g(d54 d54Var, Object obj, Object obj2) {
        synchronized (d54Var) {
            try {
                if (d54Var.f24887a != obj) {
                    return false;
                }
                d54Var.f24887a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
