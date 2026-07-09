package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
abstract class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f7627a = Logger.getLogger(l1.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Unsafe f7628b = B();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Class f7629c = androidx.datastore.preferences.protobuf.d.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f7630d = m(Long.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f7631e = m(Integer.TYPE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final e f7632f = z();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f7633g = Q();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final boolean f7634h = P();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final long f7635i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f7636j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f7637k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f7638l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f7639m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f7640n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f7641o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f7642p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f7643q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f7644r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f7645s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f7646t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f7647u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final long f7648v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f7649w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final boolean f7650x;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a implements PrivilegedExceptionAction {
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

        @Override // androidx.datastore.preferences.protobuf.l1.e
        public boolean c(Object obj, long j11) {
            return l1.f7650x ? l1.q(obj, j11) : l1.r(obj, j11);
        }

        @Override // androidx.datastore.preferences.protobuf.l1.e
        public byte d(Object obj, long j11) {
            return l1.f7650x ? l1.t(obj, j11) : l1.u(obj, j11);
        }

        @Override // androidx.datastore.preferences.protobuf.l1.e
        public double e(Object obj, long j11) {
            return Double.longBitsToDouble(h(obj, j11));
        }

        @Override // androidx.datastore.preferences.protobuf.l1.e
        public float f(Object obj, long j11) {
            return Float.intBitsToFloat(g(obj, j11));
        }

        @Override // androidx.datastore.preferences.protobuf.l1.e
        public void k(Object obj, long j11, boolean z11) {
            if (l1.f7650x) {
                l1.F(obj, j11, z11);
            } else {
                l1.G(obj, j11, z11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.l1.e
        public void l(Object obj, long j11, byte b11) {
            if (l1.f7650x) {
                l1.I(obj, j11, b11);
            } else {
                l1.J(obj, j11, b11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.l1.e
        public void m(Object obj, long j11, double d11) {
            p(obj, j11, Double.doubleToLongBits(d11));
        }

        @Override // androidx.datastore.preferences.protobuf.l1.e
        public void n(Object obj, long j11, float f11) {
            o(obj, j11, Float.floatToIntBits(f11));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.l1.e
        public boolean c(Object obj, long j11) {
            return l1.f7650x ? l1.q(obj, j11) : l1.r(obj, j11);
        }

        @Override // androidx.datastore.preferences.protobuf.l1.e
        public byte d(Object obj, long j11) {
            return l1.f7650x ? l1.t(obj, j11) : l1.u(obj, j11);
        }

        @Override // androidx.datastore.preferences.protobuf.l1.e
        public double e(Object obj, long j11) {
            return Double.longBitsToDouble(h(obj, j11));
        }

        @Override // androidx.datastore.preferences.protobuf.l1.e
        public float f(Object obj, long j11) {
            return Float.intBitsToFloat(g(obj, j11));
        }

        @Override // androidx.datastore.preferences.protobuf.l1.e
        public void k(Object obj, long j11, boolean z11) {
            if (l1.f7650x) {
                l1.F(obj, j11, z11);
            } else {
                l1.G(obj, j11, z11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.l1.e
        public void l(Object obj, long j11, byte b11) {
            if (l1.f7650x) {
                l1.I(obj, j11, b11);
            } else {
                l1.J(obj, j11, b11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.l1.e
        public void m(Object obj, long j11, double d11) {
            p(obj, j11, Double.doubleToLongBits(d11));
        }

        @Override // androidx.datastore.preferences.protobuf.l1.e
        public void n(Object obj, long j11, float f11) {
            o(obj, j11, Float.floatToIntBits(f11));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.l1.e
        public boolean c(Object obj, long j11) {
            return this.f7651a.getBoolean(obj, j11);
        }

        @Override // androidx.datastore.preferences.protobuf.l1.e
        public byte d(Object obj, long j11) {
            return this.f7651a.getByte(obj, j11);
        }

        @Override // androidx.datastore.preferences.protobuf.l1.e
        public double e(Object obj, long j11) {
            return this.f7651a.getDouble(obj, j11);
        }

        @Override // androidx.datastore.preferences.protobuf.l1.e
        public float f(Object obj, long j11) {
            return this.f7651a.getFloat(obj, j11);
        }

        @Override // androidx.datastore.preferences.protobuf.l1.e
        public void k(Object obj, long j11, boolean z11) {
            this.f7651a.putBoolean(obj, j11, z11);
        }

        @Override // androidx.datastore.preferences.protobuf.l1.e
        public void l(Object obj, long j11, byte b11) {
            this.f7651a.putByte(obj, j11, b11);
        }

        @Override // androidx.datastore.preferences.protobuf.l1.e
        public void m(Object obj, long j11, double d11) {
            this.f7651a.putDouble(obj, j11, d11);
        }

        @Override // androidx.datastore.preferences.protobuf.l1.e
        public void n(Object obj, long j11, float f11) {
            this.f7651a.putFloat(obj, j11, f11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Unsafe f7651a;

        e(Unsafe unsafe) {
            this.f7651a = unsafe;
        }

        public final int a(Class cls) {
            return this.f7651a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f7651a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j11);

        public abstract byte d(Object obj, long j11);

        public abstract double e(Object obj, long j11);

        public abstract float f(Object obj, long j11);

        public final int g(Object obj, long j11) {
            return this.f7651a.getInt(obj, j11);
        }

        public final long h(Object obj, long j11) {
            return this.f7651a.getLong(obj, j11);
        }

        public final Object i(Object obj, long j11) {
            return this.f7651a.getObject(obj, j11);
        }

        public final long j(Field field) {
            return this.f7651a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j11, boolean z11);

        public abstract void l(Object obj, long j11, byte b11);

        public abstract void m(Object obj, long j11, double d11);

        public abstract void n(Object obj, long j11, float f11);

        public final void o(Object obj, long j11, int i11) {
            this.f7651a.putInt(obj, j11, i11);
        }

        public final void p(Object obj, long j11, long j12) {
            this.f7651a.putLong(obj, j11, j12);
        }

        public final void q(Object obj, long j11, Object obj2) {
            this.f7651a.putObject(obj, j11, obj2);
        }
    }

    static {
        long j11 = j(byte[].class);
        f7635i = j11;
        f7636j = j(boolean[].class);
        f7637k = k(boolean[].class);
        f7638l = j(int[].class);
        f7639m = k(int[].class);
        f7640n = j(long[].class);
        f7641o = k(long[].class);
        f7642p = j(float[].class);
        f7643q = k(float[].class);
        f7644r = j(double[].class);
        f7645s = k(double[].class);
        f7646t = j(Object[].class);
        f7647u = k(Object[].class);
        f7648v = o(l());
        f7649w = (int) (j11 & 7);
        f7650x = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static Object A(Object obj, long j11) {
        return f7632f.i(obj, j11);
    }

    static Unsafe B() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean C() {
        return f7634h;
    }

    static boolean D() {
        return f7633g;
    }

    static void E(Object obj, long j11, boolean z11) {
        f7632f.k(obj, j11, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(Object obj, long j11, boolean z11) {
        I(obj, j11, z11 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Object obj, long j11, boolean z11) {
        J(obj, j11, z11 ? (byte) 1 : (byte) 0);
    }

    static void H(byte[] bArr, long j11, byte b11) {
        f7632f.l(bArr, f7635i + j11, b11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        int iX = x(obj, j12);
        int i11 = ((~((int) j11)) & 3) << 3;
        M(obj, j12, ((255 & b11) << i11) | (iX & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        int i11 = (((int) j11) & 3) << 3;
        M(obj, j12, ((255 & b11) << i11) | (x(obj, j12) & (~(255 << i11))));
    }

    static void K(Object obj, long j11, double d11) {
        f7632f.m(obj, j11, d11);
    }

    static void L(Object obj, long j11, float f11) {
        f7632f.n(obj, j11, f11);
    }

    static void M(Object obj, long j11, int i11) {
        f7632f.o(obj, j11, i11);
    }

    static void N(Object obj, long j11, long j12) {
        f7632f.p(obj, j11, j12);
    }

    static void O(Object obj, long j11, Object obj2) {
        f7632f.q(obj, j11, obj2);
    }

    private static boolean P() {
        Unsafe unsafe = f7628b;
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
            if (androidx.datastore.preferences.protobuf.d.c()) {
                return true;
            }
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
            f7627a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
            return false;
        }
    }

    private static boolean Q() {
        Unsafe unsafe = f7628b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (l() == null) {
                return false;
            }
            if (androidx.datastore.preferences.protobuf.d.c()) {
                return true;
            }
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
            f7627a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
            return false;
        }
    }

    static Object i(Class cls) {
        try {
            return f7628b.allocateInstance(cls);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        }
    }

    private static int j(Class cls) {
        if (f7634h) {
            return f7632f.a(cls);
        }
        return -1;
    }

    private static int k(Class cls) {
        if (f7634h) {
            return f7632f.b(cls);
        }
        return -1;
    }

    private static Field l() {
        Field fieldN;
        if (androidx.datastore.preferences.protobuf.d.c() && (fieldN = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldN;
        }
        Field fieldN2 = n(Buffer.class, "address");
        if (fieldN2 == null || fieldN2.getType() != Long.TYPE) {
            return null;
        }
        return fieldN2;
    }

    private static boolean m(Class cls) {
        if (!androidx.datastore.preferences.protobuf.d.c()) {
            return false;
        }
        try {
            Class cls2 = f7629c;
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

    private static Field n(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f7632f) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    static boolean p(Object obj, long j11) {
        return f7632f.c(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean q(Object obj, long j11) {
        return t(obj, j11) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean r(Object obj, long j11) {
        return u(obj, j11) != 0;
    }

    static byte s(byte[] bArr, long j11) {
        return f7632f.d(bArr, f7635i + j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte t(Object obj, long j11) {
        return (byte) ((x(obj, (-4) & j11) >>> ((int) (((~j11) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte u(Object obj, long j11) {
        return (byte) ((x(obj, (-4) & j11) >>> ((int) ((j11 & 3) << 3))) & 255);
    }

    static double v(Object obj, long j11) {
        return f7632f.e(obj, j11);
    }

    static float w(Object obj, long j11) {
        return f7632f.f(obj, j11);
    }

    static int x(Object obj, long j11) {
        return f7632f.g(obj, j11);
    }

    static long y(Object obj, long j11) {
        return f7632f.h(obj, j11);
    }

    private static e z() {
        Unsafe unsafe = f7628b;
        if (unsafe == null) {
            return null;
        }
        if (!androidx.datastore.preferences.protobuf.d.c()) {
            return new d(unsafe);
        }
        if (f7630d) {
            return new c(unsafe);
        }
        if (f7631e) {
            return new b(unsafe);
        }
        return null;
    }
}
