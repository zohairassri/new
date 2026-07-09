package com.google.android.gms.internal.ads;

import com.chartbeat.androidsdk.QueryKeys;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class b54 extends y44 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Unsafe f23690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final long f23691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final long f23692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final long f23693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final long f23694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final long f23695f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(e54.f25601a);
            }
            try {
                f23692c = unsafe.objectFieldOffset(d54.class.getDeclaredField(QueryKeys.TIME_ON_VIEW_IN_MINUTES));
                f23691b = unsafe.objectFieldOffset(d54.class.getDeclaredField(QueryKeys.PAGE_LOAD_TIME));
                f23693d = unsafe.objectFieldOffset(d54.class.getDeclaredField("a"));
                f23694e = unsafe.objectFieldOffset(c54.class.getDeclaredField("a"));
                f23695f = unsafe.objectFieldOffset(c54.class.getDeclaredField(QueryKeys.PAGE_LOAD_TIME));
                f23690a = unsafe;
            } catch (NoSuchFieldException e11) {
                throw new RuntimeException(e11);
            }
        } catch (PrivilegedActionException e12) {
            throw new RuntimeException("Could not initialize intrinsics", e12.getCause());
        }
    }

    /* synthetic */ b54(byte[] bArr) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.y44
    public final void a(c54 c54Var, Thread thread) {
        f23690a.putObject(c54Var, f23694e, thread);
    }

    @Override // com.google.android.gms.internal.ads.y44
    final void b(c54 c54Var, c54 c54Var2) {
        f23690a.putObject(c54Var, f23695f, c54Var2);
    }

    @Override // com.google.android.gms.internal.ads.y44
    final boolean c(d54 d54Var, c54 c54Var, c54 c54Var2) {
        return com.google.ads.interactivemedia.v3.internal.b.a(f23690a, d54Var, f23692c, c54Var, c54Var2);
    }

    @Override // com.google.android.gms.internal.ads.y44
    final boolean d(d54 d54Var, u44 u44Var, u44 u44Var2) {
        return com.google.ads.interactivemedia.v3.internal.b.a(f23690a, d54Var, f23691b, u44Var, u44Var2);
    }

    @Override // com.google.android.gms.internal.ads.y44
    final c54 e(d54 d54Var, c54 c54Var) {
        c54 c54Var2;
        do {
            c54Var2 = d54Var.f24889c;
            if (c54Var == c54Var2) {
                break;
            }
        } while (!c(d54Var, c54Var2, c54Var));
        return c54Var2;
    }

    @Override // com.google.android.gms.internal.ads.y44
    final u44 f(d54 d54Var, u44 u44Var) {
        u44 u44Var2;
        do {
            u44Var2 = d54Var.f24888b;
            if (u44Var == u44Var2) {
                break;
            }
        } while (!d(d54Var, u44Var2, u44Var));
        return u44Var2;
    }

    @Override // com.google.android.gms.internal.ads.y44
    final boolean g(d54 d54Var, Object obj, Object obj2) {
        return com.google.ads.interactivemedia.v3.internal.b.a(f23690a, d54Var, f23693d, obj, obj2);
    }
}
