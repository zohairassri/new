package com.google.android.gms.internal.pal;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class r9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e8 f41708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f41709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f41710c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Class[] f41712e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Method f41711d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CountDownLatch f41713f = new CountDownLatch(1);

    public r9(e8 e8Var, String str, String str2, Class... clsArr) {
        this.f41708a = e8Var;
        this.f41709b = str;
        this.f41710c = str2;
        this.f41712e = clsArr;
        e8Var.k().submit(new q9(this));
    }

    static /* bridge */ /* synthetic */ void b(r9 r9Var) {
        CountDownLatch countDownLatch;
        Class<?> clsLoadClass;
        try {
            try {
                e8 e8Var = r9Var.f41708a;
                clsLoadClass = e8Var.i().loadClass(r9Var.c(e8Var.u(), r9Var.f41709b));
            } catch (zzda | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused) {
            }
            if (clsLoadClass == null) {
                countDownLatch = r9Var.f41713f;
            } else {
                r9Var.f41711d = clsLoadClass.getMethod(r9Var.c(r9Var.f41708a.u(), r9Var.f41710c), r9Var.f41712e);
                countDownLatch = r9Var.f41711d == null ? r9Var.f41713f : r9Var.f41713f;
            }
        } catch (NullPointerException unused2) {
            countDownLatch = r9Var.f41713f;
        } catch (Throwable th2) {
            r9Var.f41713f.countDown();
            throw th2;
        }
        countDownLatch.countDown();
    }

    private final String c(byte[] bArr, String str) {
        return new String(this.f41708a.e().b(bArr, str), "UTF-8");
    }

    public final Method a() {
        if (this.f41711d != null) {
            return this.f41711d;
        }
        try {
            if (this.f41713f.await(2L, TimeUnit.SECONDS)) {
                return this.f41711d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
