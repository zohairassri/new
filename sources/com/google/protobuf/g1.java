package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f47365a = D();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f47366b = com.google.protobuf.d.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f47367c = o(Long.TYPE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f47368d = o(Integer.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e f47369e = B();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f47370f = T();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f47371g = S();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final long f47372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f47373i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f47374j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f47375k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f47376l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f47377m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f47378n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f47379o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f47380p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f47381q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f47382r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f47383s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f47384t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f47385u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f47386v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final boolean f47387w;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements PrivilegedExceptionAction {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.g1.e
        public boolean c(Object obj, long j11) {
            return g1.f47387w ? g1.s(obj, j11) : g1.t(obj, j11);
        }

        @Override // com.google.protobuf.g1.e
        public byte d(Object obj, long j11) {
            return g1.f47387w ? g1.v(obj, j11) : g1.w(obj, j11);
        }

        @Override // com.google.protobuf.g1.e
        public double e(Object obj, long j11) {
            return Double.longBitsToDouble(h(obj, j11));
        }

        @Override // com.google.protobuf.g1.e
        public float f(Object obj, long j11) {
            return Float.intBitsToFloat(g(obj, j11));
        }

        @Override // com.google.protobuf.g1.e
        public void k(Object obj, long j11, boolean z11) {
            if (g1.f47387w) {
                g1.I(obj, j11, z11);
            } else {
                g1.J(obj, j11, z11);
            }
        }

        @Override // com.google.protobuf.g1.e
        public void l(Object obj, long j11, byte b11) {
            if (g1.f47387w) {
                g1.L(obj, j11, b11);
            } else {
                g1.M(obj, j11, b11);
            }
        }

        @Override // com.google.protobuf.g1.e
        public void m(Object obj, long j11, double d11) {
            p(obj, j11, Double.doubleToLongBits(d11));
        }

        @Override // com.google.protobuf.g1.e
        public void n(Object obj, long j11, float f11) {
            o(obj, j11, Float.floatToIntBits(f11));
        }

        @Override // com.google.protobuf.g1.e
        public boolean s() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.g1.e
        public boolean c(Object obj, long j11) {
            return g1.f47387w ? g1.s(obj, j11) : g1.t(obj, j11);
        }

        @Override // com.google.protobuf.g1.e
        public byte d(Object obj, long j11) {
            return g1.f47387w ? g1.v(obj, j11) : g1.w(obj, j11);
        }

        @Override // com.google.protobuf.g1.e
        public double e(Object obj, long j11) {
            return Double.longBitsToDouble(h(obj, j11));
        }

        @Override // com.google.protobuf.g1.e
        public float f(Object obj, long j11) {
            return Float.intBitsToFloat(g(obj, j11));
        }

        @Override // com.google.protobuf.g1.e
        public void k(Object obj, long j11, boolean z11) {
            if (g1.f47387w) {
                g1.I(obj, j11, z11);
            } else {
                g1.J(obj, j11, z11);
            }
        }

        @Override // com.google.protobuf.g1.e
        public void l(Object obj, long j11, byte b11) {
            if (g1.f47387w) {
                g1.L(obj, j11, b11);
            } else {
                g1.M(obj, j11, b11);
            }
        }

        @Override // com.google.protobuf.g1.e
        public void m(Object obj, long j11, double d11) {
            p(obj, j11, Double.doubleToLongBits(d11));
        }

        @Override // com.google.protobuf.g1.e
        public void n(Object obj, long j11, float f11) {
            o(obj, j11, Float.floatToIntBits(f11));
        }

        @Override // com.google.protobuf.g1.e
        public boolean s() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.g1.e
        public boolean c(Object obj, long j11) {
            return this.f47388a.getBoolean(obj, j11);
        }

        @Override // com.google.protobuf.g1.e
        public byte d(Object obj, long j11) {
            return this.f47388a.getByte(obj, j11);
        }

        @Override // com.google.protobuf.g1.e
        public double e(Object obj, long j11) {
            return this.f47388a.getDouble(obj, j11);
        }

        @Override // com.google.protobuf.g1.e
        public float f(Object obj, long j11) {
            return this.f47388a.getFloat(obj, j11);
        }

        @Override // com.google.protobuf.g1.e
        public void k(Object obj, long j11, boolean z11) {
            this.f47388a.putBoolean(obj, j11, z11);
        }

        @Override // com.google.protobuf.g1.e
        public void l(Object obj, long j11, byte b11) {
            this.f47388a.putByte(obj, j11, b11);
        }

        @Override // com.google.protobuf.g1.e
        public void m(Object obj, long j11, double d11) {
            this.f47388a.putDouble(obj, j11, d11);
        }

        @Override // com.google.protobuf.g1.e
        public void n(Object obj, long j11, float f11) {
            this.f47388a.putFloat(obj, j11, f11);
        }

        @Override // com.google.protobuf.g1.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f47388a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th2) {
                g1.G(th2);
                return false;
            }
        }

        @Override // com.google.protobuf.g1.e
        public boolean s() {
            if (!super.s()) {
                return false;
            }
            try {
                Class<?> cls = this.f47388a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th2) {
                g1.G(th2);
                return false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Unsafe f47388a;

        e(Unsafe unsafe) {
            this.f47388a = unsafe;
        }

        public final int a(Class cls) {
            return this.f47388a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f47388a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j11);

        public abstract byte d(Object obj, long j11);

        public abstract double e(Object obj, long j11);

        public abstract float f(Object obj, long j11);

        public final int g(Object obj, long j11) {
            return this.f47388a.getInt(obj, j11);
        }

        public final long h(Object obj, long j11) {
            return this.f47388a.getLong(obj, j11);
        }

        public final Object i(Object obj, long j11) {
            return this.f47388a.getObject(obj, j11);
        }

        public final long j(Field field) {
            return this.f47388a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j11, boolean z11);

        public abstract void l(Object obj, long j11, byte b11);

        public abstract void m(Object obj, long j11, double d11);

        public abstract void n(Object obj, long j11, float f11);

        public final void o(Object obj, long j11, int i11) {
            this.f47388a.putInt(obj, j11, i11);
        }

        public final void p(Object obj, long j11, long j12) {
            this.f47388a.putLong(obj, j11, j12);
        }

        public final void q(Object obj, long j11, Object obj2) {
            this.f47388a.putObject(obj, j11, obj2);
        }

        public boolean r() {
            Unsafe unsafe = this.f47388a;
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
                g1.G(th2);
                return false;
            }
        }

        public boolean s() {
            Unsafe unsafe = this.f47388a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return g1.n() != null;
            } catch (Throwable th2) {
                g1.G(th2);
                return false;
            }
        }
    }

    static {
        long jL = l(byte[].class);
        f47372h = jL;
        f47373i = l(boolean[].class);
        f47374j = m(boolean[].class);
        f47375k = l(int[].class);
        f47376l = m(int[].class);
        f47377m = l(long[].class);
        f47378n = m(long[].class);
        f47379o = l(float[].class);
        f47380p = m(float[].class);
        f47381q = l(double[].class);
        f47382r = m(double[].class);
        f47383s = l(Object[].class);
        f47384t = m(Object[].class);
        f47385u = q(n());
        f47386v = (int) (jL & 7);
        f47387w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static long A(Object obj, long j11) {
        return f47369e.h(obj, j11);
    }

    private static e B() {
        Unsafe unsafe = f47365a;
        if (unsafe == null) {
            return null;
        }
        if (!com.google.protobuf.d.c()) {
            return new d(unsafe);
        }
        if (f47367c) {
            return new c(unsafe);
        }
        if (f47368d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object C(Object obj, long j11) {
        return f47369e.i(obj, j11);
    }

    static Unsafe D() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean E() {
        return f47371g;
    }

    static boolean F() {
        return f47370f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Throwable th2) {
        Logger.getLogger(g1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    static void H(Object obj, long j11, boolean z11) {
        f47369e.k(obj, j11, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j11, boolean z11) {
        L(obj, j11, z11 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j11, boolean z11) {
        M(obj, j11, z11 ? (byte) 1 : (byte) 0);
    }

    static void K(byte[] bArr, long j11, byte b11) {
        f47369e.l(bArr, f47372h + j11, b11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void L(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        int iZ = z(obj, j12);
        int i11 = ((~((int) j11)) & 3) << 3;
        P(obj, j12, ((255 & b11) << i11) | (iZ & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void M(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        int i11 = (((int) j11) & 3) << 3;
        P(obj, j12, ((255 & b11) << i11) | (z(obj, j12) & (~(255 << i11))));
    }

    static void N(Object obj, long j11, double d11) {
        f47369e.m(obj, j11, d11);
    }

    static void O(Object obj, long j11, float f11) {
        f47369e.n(obj, j11, f11);
    }

    static void P(Object obj, long j11, int i11) {
        f47369e.o(obj, j11, i11);
    }

    static void Q(Object obj, long j11, long j12) {
        f47369e.p(obj, j11, j12);
    }

    static void R(Object obj, long j11, Object obj2) {
        f47369e.q(obj, j11, obj2);
    }

    private static boolean S() {
        e eVar = f47369e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    private static boolean T() {
        e eVar = f47369e;
        if (eVar == null) {
            return false;
        }
        return eVar.s();
    }

    static Object k(Class cls) {
        try {
            return f47365a.allocateInstance(cls);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        }
    }

    private static int l(Class cls) {
        if (f47371g) {
            return f47369e.a(cls);
        }
        return -1;
    }

    private static int m(Class cls) {
        if (f47371g) {
            return f47369e.b(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field n() {
        Field fieldP;
        if (com.google.protobuf.d.c() && (fieldP = p(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldP;
        }
        Field fieldP2 = p(Buffer.class, "address");
        if (fieldP2 == null || fieldP2.getType() != Long.TYPE) {
            return null;
        }
        return fieldP2;
    }

    static boolean o(Class cls) {
        if (!com.google.protobuf.d.c()) {
            return false;
        }
        try {
            Class cls2 = f47366b;
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

    private static Field p(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long q(Field field) {
        e eVar;
        if (field == null || (eVar = f47369e) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    static boolean r(Object obj, long j11) {
        return f47369e.c(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean s(Object obj, long j11) {
        return v(obj, j11) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(Object obj, long j11) {
        return w(obj, j11) != 0;
    }

    static byte u(byte[] bArr, long j11) {
        return f47369e.d(bArr, f47372h + j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte v(Object obj, long j11) {
        return (byte) ((z(obj, (-4) & j11) >>> ((int) (((~j11) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte w(Object obj, long j11) {
        return (byte) ((z(obj, (-4) & j11) >>> ((int) ((j11 & 3) << 3))) & 255);
    }

    static double x(Object obj, long j11) {
        return f47369e.e(obj, j11);
    }

    static float y(Object obj, long j11) {
        return f47369e.f(obj, j11);
    }

    static int z(Object obj, long j11) {
        return f47369e.g(obj, j11);
    }
}
