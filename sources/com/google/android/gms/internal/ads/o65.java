package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class o65 implements mi {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final z65 f31784h = z65.b(o65.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f31785a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ByteBuffer f31788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f31789e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    t65 f31791g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f31790f = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f31787c = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f31786b = true;

    protected o65(String str) {
        this.f31785a = str;
    }

    private final synchronized void b() {
        try {
            if (this.f31787c) {
                return;
            }
            try {
                z65 z65Var = f31784h;
                String str = this.f31785a;
                z65Var.a(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.f31788d = this.f31791g.i(this.f31789e, this.f31790f);
                this.f31787c = true;
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.mi
    public final void a(t65 t65Var, ByteBuffer byteBuffer, long j11, ji jiVar) {
        this.f31789e = t65Var.zzc();
        byteBuffer.remaining();
        this.f31790f = j11;
        this.f31791g = t65Var;
        t65Var.r(t65Var.zzc() + j11);
        this.f31787c = false;
        this.f31786b = false;
        d();
    }

    protected abstract void c(ByteBuffer byteBuffer);

    public final synchronized void d() {
        try {
            b();
            z65 z65Var = f31784h;
            String str = this.f31785a;
            z65Var.a(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.f31788d;
            if (byteBuffer != null) {
                this.f31786b = true;
                byteBuffer.rewind();
                c(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.f31788d = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.mi
    public final String zza() {
        return this.f31785a;
    }
}
