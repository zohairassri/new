package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class lb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f40507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f40508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f40509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f40510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f40511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f40512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f40513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f40514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f40515i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f40516j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f40517k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f40518l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f40519m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f40520n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f40521o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f40522p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f40523q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f40524r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f40525s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f40526t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f40527u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f40528v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final boolean f40529w;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class a extends c {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.lb.c
        public final double a(Object obj, long j11) {
            return Double.longBitsToDouble(m(obj, j11));
        }

        @Override // com.google.android.gms.internal.measurement.lb.c
        public final void b(Object obj, long j11, byte b11) {
            if (lb.f40529w) {
                lb.u(obj, j11, b11);
            } else {
                lb.y(obj, j11, b11);
            }
        }

        @Override // com.google.android.gms.internal.measurement.lb.c
        public final void c(Object obj, long j11, double d11) {
            f(obj, j11, Double.doubleToLongBits(d11));
        }

        @Override // com.google.android.gms.internal.measurement.lb.c
        public final void d(Object obj, long j11, float f11) {
            e(obj, j11, Float.floatToIntBits(f11));
        }

        @Override // com.google.android.gms.internal.measurement.lb.c
        public final void g(Object obj, long j11, boolean z11) {
            if (lb.f40529w) {
                lb.k(obj, j11, z11);
            } else {
                lb.r(obj, j11, z11);
            }
        }

        @Override // com.google.android.gms.internal.measurement.lb.c
        public final float i(Object obj, long j11) {
            return Float.intBitsToFloat(l(obj, j11));
        }

        @Override // com.google.android.gms.internal.measurement.lb.c
        public final boolean k(Object obj, long j11) {
            return lb.f40529w ? lb.D(obj, j11) : lb.E(obj, j11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class b extends c {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.lb.c
        public final double a(Object obj, long j11) {
            return Double.longBitsToDouble(m(obj, j11));
        }

        @Override // com.google.android.gms.internal.measurement.lb.c
        public final void b(Object obj, long j11, byte b11) {
            if (lb.f40529w) {
                lb.u(obj, j11, b11);
            } else {
                lb.y(obj, j11, b11);
            }
        }

        @Override // com.google.android.gms.internal.measurement.lb.c
        public final void c(Object obj, long j11, double d11) {
            f(obj, j11, Double.doubleToLongBits(d11));
        }

        @Override // com.google.android.gms.internal.measurement.lb.c
        public final void d(Object obj, long j11, float f11) {
            e(obj, j11, Float.floatToIntBits(f11));
        }

        @Override // com.google.android.gms.internal.measurement.lb.c
        public final void g(Object obj, long j11, boolean z11) {
            if (lb.f40529w) {
                lb.k(obj, j11, z11);
            } else {
                lb.r(obj, j11, z11);
            }
        }

        @Override // com.google.android.gms.internal.measurement.lb.c
        public final float i(Object obj, long j11) {
            return Float.intBitsToFloat(l(obj, j11));
        }

        @Override // com.google.android.gms.internal.measurement.lb.c
        public final boolean k(Object obj, long j11) {
            return lb.f40529w ? lb.D(obj, j11) : lb.E(obj, j11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Unsafe f40530a;

        c(Unsafe unsafe) {
            this.f40530a = unsafe;
        }

        public abstract double a(Object obj, long j11);

        public abstract void b(Object obj, long j11, byte b11);

        public abstract void c(Object obj, long j11, double d11);

        public abstract void d(Object obj, long j11, float f11);

        public final void e(Object obj, long j11, int i11) {
            this.f40530a.putInt(obj, j11, i11);
        }

        public final void f(Object obj, long j11, long j12) {
            this.f40530a.putLong(obj, j11, j12);
        }

        public abstract void g(Object obj, long j11, boolean z11);

        public final boolean h() {
            Unsafe unsafe = this.f40530a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th2) {
                lb.l(th2);
                return false;
            }
        }

        public abstract float i(Object obj, long j11);

        public final boolean j() {
            Unsafe unsafe = this.f40530a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return lb.C() != null;
            } catch (Throwable th2) {
                lb.l(th2);
                return false;
            }
        }

        public abstract boolean k(Object obj, long j11);

        public final int l(Object obj, long j11) {
            return this.f40530a.getInt(obj, j11);
        }

        public final long m(Object obj, long j11) {
            return this.f40530a.getLong(obj, j11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    static {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.lb.<clinit>():void");
    }

    private static boolean A(Class cls) {
        try {
            Class cls2 = f40508b;
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

    static Object B(Object obj, long j11) {
        return f40511e.f40530a.getObject(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field C() {
        Field fieldD = d(Buffer.class, "effectiveDirectAddress");
        if (fieldD != null) {
            return fieldD;
        }
        Field fieldD2 = d(Buffer.class, "address");
        if (fieldD2 == null || fieldD2.getType() != Long.TYPE) {
            return null;
        }
        return fieldD2;
    }

    static /* synthetic */ boolean D(Object obj, long j11) {
        return ((byte) (t(obj, (-4) & j11) >>> ((int) (((~j11) & 3) << 3)))) != 0;
    }

    static /* synthetic */ boolean E(Object obj, long j11) {
        return ((byte) (t(obj, (-4) & j11) >>> ((int) ((j11 & 3) << 3)))) != 0;
    }

    static boolean F(Object obj, long j11) {
        return f40511e.k(obj, j11);
    }

    static double a(Object obj, long j11) {
        return f40511e.a(obj, j11);
    }

    static Object b(Class cls) {
        try {
            return f40507a.allocateInstance(cls);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        }
    }

    private static Field d(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static void f(Object obj, long j11, double d11) {
        f40511e.c(obj, j11, d11);
    }

    static void g(Object obj, long j11, float f11) {
        f40511e.d(obj, j11, f11);
    }

    static void h(Object obj, long j11, int i11) {
        f40511e.e(obj, j11, i11);
    }

    static void i(Object obj, long j11, long j12) {
        f40511e.f(obj, j11, j12);
    }

    static void j(Object obj, long j11, Object obj2) {
        f40511e.f40530a.putObject(obj, j11, obj2);
    }

    static /* synthetic */ void k(Object obj, long j11, boolean z11) {
        u(obj, j11, z11 ? (byte) 1 : (byte) 0);
    }

    static /* synthetic */ void l(Throwable th2) {
        Logger.getLogger(lb.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + String.valueOf(th2));
    }

    static void m(byte[] bArr, long j11, byte b11) {
        f40511e.b(bArr, f40514h + j11, b11);
    }

    static float n(Object obj, long j11) {
        return f40511e.i(obj, j11);
    }

    private static int o(Class cls) {
        if (f40513g) {
            return f40511e.f40530a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static Unsafe p() {
        try {
            return (Unsafe) AccessController.doPrivileged(new kb());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* synthetic */ void r(Object obj, long j11, boolean z11) {
        y(obj, j11, z11 ? (byte) 1 : (byte) 0);
    }

    private static int s(Class cls) {
        if (f40513g) {
            return f40511e.f40530a.arrayIndexScale(cls);
        }
        return -1;
    }

    static int t(Object obj, long j11) {
        return f40511e.l(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        int iT = t(obj, j12);
        int i11 = ((~((int) j11)) & 3) << 3;
        h(obj, j12, ((255 & b11) << i11) | (iT & (~(255 << i11))));
    }

    static void v(Object obj, long j11, boolean z11) {
        f40511e.g(obj, j11, z11);
    }

    static boolean w() {
        return f40513g;
    }

    static long x(Object obj, long j11) {
        return f40511e.m(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        int i11 = (((int) j11) & 3) << 3;
        h(obj, j12, ((255 & b11) << i11) | (t(obj, j12) & (~(255 << i11))));
    }

    static boolean z() {
        return f40512f;
    }
}
