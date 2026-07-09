package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class d8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f42350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f42351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f42352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c8 f42353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f42354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f42355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final long f42356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final boolean f42357h;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    static {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.d8.<clinit>():void");
    }

    static boolean A(Class cls) {
        int i11 = c5.f42337a;
        try {
            Class cls2 = f42351b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean B(Object obj, long j11) {
        return f42353d.g(obj, j11);
    }

    static boolean C() {
        return f42355f;
    }

    static boolean D() {
        return f42354e;
    }

    private static int E(Class cls) {
        if (f42355f) {
            return f42353d.f42339a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (f42355f) {
            return f42353d.f42339a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field b() {
        int i11 = c5.f42337a;
        Field fieldC = c(Buffer.class, "effectiveDirectAddress");
        if (fieldC != null) {
            return fieldC;
        }
        Field fieldC2 = c(Buffer.class, "address");
        if (fieldC2 == null || fieldC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldC2;
    }

    private static Field c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, long j11, byte b11) {
        c8 c8Var = f42353d;
        long j12 = (-4) & j11;
        int i11 = c8Var.f42339a.getInt(obj, j12);
        int i12 = ((~((int) j11)) & 3) << 3;
        c8Var.f42339a.putInt(obj, j12, ((255 & b11) << i12) | (i11 & (~(255 << i12))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j11, byte b11) {
        c8 c8Var = f42353d;
        long j12 = (-4) & j11;
        int i11 = (((int) j11) & 3) << 3;
        c8Var.f42339a.putInt(obj, j12, ((255 & b11) << i11) | (c8Var.f42339a.getInt(obj, j12) & (~(255 << i11))));
    }

    static double f(Object obj, long j11) {
        return f42353d.a(obj, j11);
    }

    static float g(Object obj, long j11) {
        return f42353d.b(obj, j11);
    }

    static int h(Object obj, long j11) {
        return f42353d.f42339a.getInt(obj, j11);
    }

    static long i(Object obj, long j11) {
        return f42353d.f42339a.getLong(obj, j11);
    }

    static Object j(Class cls) {
        try {
            return f42350a.allocateInstance(cls);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        }
    }

    static Object k(Object obj, long j11) {
        return f42353d.f42339a.getObject(obj, j11);
    }

    static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new z7());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void m(Throwable th2) {
        Logger.getLogger(d8.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    static void r(Object obj, long j11, boolean z11) {
        f42353d.c(obj, j11, z11);
    }

    static void s(byte[] bArr, long j11, byte b11) {
        f42353d.d(bArr, f42356g + j11, b11);
    }

    static void t(Object obj, long j11, double d11) {
        f42353d.e(obj, j11, d11);
    }

    static void u(Object obj, long j11, float f11) {
        f42353d.f(obj, j11, f11);
    }

    static void v(Object obj, long j11, int i11) {
        f42353d.f42339a.putInt(obj, j11, i11);
    }

    static void w(Object obj, long j11, long j12) {
        f42353d.f42339a.putLong(obj, j11, j12);
    }

    static void x(Object obj, long j11, Object obj2) {
        f42353d.f42339a.putObject(obj, j11, obj2);
    }

    static /* bridge */ /* synthetic */ boolean y(Object obj, long j11) {
        return ((byte) ((f42353d.f42339a.getInt(obj, (-4) & j11) >>> ((int) (((~j11) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean z(Object obj, long j11) {
        return ((byte) ((f42353d.f42339a.getInt(obj, (-4) & j11) >>> ((int) ((j11 & 3) << 3))) & 255)) != 0;
    }
}
