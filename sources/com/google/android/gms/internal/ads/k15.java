package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class k15 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f29335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f29336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f29337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final j15 f29338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f29339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f29340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final long f29341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f29342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final boolean f29343i;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    static {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k15.<clinit>():void");
    }

    static boolean A(Class cls) {
        int i11 = kx4.f29903a;
        try {
            Class cls2 = f29336b;
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

    static /* synthetic */ boolean D(Object obj, long j11) {
        return ((byte) ((f29338d.f28836a.getInt(obj, (-4) & j11) >>> ((int) (((~j11) & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ boolean E(Object obj, long j11) {
        return ((byte) ((f29338d.f28836a.getInt(obj, (-4) & j11) >>> ((int) ((j11 & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ void a(Throwable th2) {
        Logger.getLogger(k15.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    private static int b(Class cls) {
        if (f29340f) {
            return f29338d.f28836a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int c(Class cls) {
        if (f29340f) {
            return f29338d.f28836a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field d() {
        int i11 = kx4.f29903a;
        Field fieldE = e(Buffer.class, "effectiveDirectAddress");
        if (fieldE != null) {
            return fieldE;
        }
        Field fieldE2 = e(Buffer.class, "address");
        if (fieldE2 == null || fieldE2.getType() != Long.TYPE) {
            return null;
        }
        return fieldE2;
    }

    private static Field e(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(Object obj, long j11, byte b11) {
        Unsafe unsafe = f29338d.f28836a;
        long j12 = (-4) & j11;
        int i11 = unsafe.getInt(obj, j12);
        int i12 = ((~((int) j11)) & 3) << 3;
        unsafe.putInt(obj, j12, ((255 & b11) << i12) | (i11 & (~(255 << i12))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(Object obj, long j11, byte b11) {
        Unsafe unsafe = f29338d.f28836a;
        long j12 = (-4) & j11;
        int i11 = (((int) j11) & 3) << 3;
        unsafe.putInt(obj, j12, ((255 & b11) << i11) | (unsafe.getInt(obj, j12) & (~(255 << i11))));
    }

    static boolean h() {
        return f29340f;
    }

    static boolean i() {
        return f29339e;
    }

    static Object j(Class cls) {
        try {
            return f29335a.allocateInstance(cls);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        }
    }

    static int k(Object obj, long j11) {
        return f29338d.f28836a.getInt(obj, j11);
    }

    static void l(Object obj, long j11, int i11) {
        f29338d.f28836a.putInt(obj, j11, i11);
    }

    static long m(Object obj, long j11) {
        return f29338d.f28836a.getLong(obj, j11);
    }

    static void n(Object obj, long j11, long j12) {
        f29338d.f28836a.putLong(obj, j11, j12);
    }

    static boolean o(Object obj, long j11) {
        return f29338d.b(obj, j11);
    }

    static void p(Object obj, long j11, boolean z11) {
        f29338d.c(obj, j11, z11);
    }

    static float q(Object obj, long j11) {
        return f29338d.d(obj, j11);
    }

    static void r(Object obj, long j11, float f11) {
        f29338d.e(obj, j11, f11);
    }

    static double s(Object obj, long j11) {
        return f29338d.f(obj, j11);
    }

    static void t(Object obj, long j11, double d11) {
        f29338d.g(obj, j11, d11);
    }

    static Object u(Object obj, long j11) {
        return f29338d.f28836a.getObject(obj, j11);
    }

    static void v(Object obj, long j11, Object obj2) {
        f29338d.f28836a.putObject(obj, j11, obj2);
    }

    static void w(byte[] bArr, long j11, byte b11) {
        f29338d.a(bArr, f29341g + j11, b11);
    }

    static byte x(long j11) {
        return f29338d.h(j11);
    }

    static long y(ByteBuffer byteBuffer) {
        j15 j15Var = f29338d;
        return j15Var.f28836a.getLong(byteBuffer, f29342h);
    }

    static Unsafe z() {
        try {
            return (Unsafe) AccessController.doPrivileged(new g15());
        } catch (Throwable unused) {
            return null;
        }
    }
}
