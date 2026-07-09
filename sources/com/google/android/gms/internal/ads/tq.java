package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class tq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fp f35696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f35697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f35698c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Class[] f35700e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Method f35699d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CountDownLatch f35701f = new CountDownLatch(1);

    public tq(fp fpVar, String str, String str2, Class... clsArr) {
        this.f35696a = fpVar;
        this.f35697b = str;
        this.f35698c = str2;
        this.f35700e = clsArr;
        fpVar.d().submit(new sq(this));
    }

    private final String c(byte[] bArr, String str) {
        return new String(this.f35696a.f().b(bArr, str), "UTF-8");
    }

    public final Method a() {
        if (this.f35699d != null) {
            return this.f35699d;
        }
        try {
            if (this.f35701f.await(2L, TimeUnit.SECONDS)) {
                return this.f35699d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    final /* synthetic */ void b() {
        try {
            fp fpVar = this.f35696a;
            Class<?> clsLoadClass = fpVar.e().loadClass(c(fpVar.g(), this.f35697b));
            if (clsLoadClass != null) {
                this.f35699d = clsLoadClass.getMethod(c(fpVar.g(), this.f35698c), this.f35700e);
            }
        } catch (zzazo | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th2) {
            this.f35701f.countDown();
            throw th2;
        }
        this.f35701f.countDown();
    }
}
