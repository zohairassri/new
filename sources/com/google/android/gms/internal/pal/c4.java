package com.google.android.gms.internal.pal;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Unsafe f41151a;

    c4(Unsafe unsafe) {
        this.f41151a = unsafe;
    }

    public abstract double a(Object obj, long j11);

    public abstract float b(Object obj, long j11);

    public abstract void c(Object obj, long j11, boolean z11);

    public abstract void d(Object obj, long j11, byte b11);

    public abstract void e(Object obj, long j11, double d11);

    public abstract void f(Object obj, long j11, float f11);

    public abstract boolean g(Object obj, long j11);

    public final int h(Class cls) {
        return this.f41151a.arrayBaseOffset(cls);
    }

    public final int i(Class cls) {
        return this.f41151a.arrayIndexScale(cls);
    }

    public final int j(Object obj, long j11) {
        return this.f41151a.getInt(obj, j11);
    }

    public final long k(Object obj, long j11) {
        return this.f41151a.getLong(obj, j11);
    }

    public final long l(Field field) {
        return this.f41151a.objectFieldOffset(field);
    }

    public final Object m(Object obj, long j11) {
        return this.f41151a.getObject(obj, j11);
    }

    public final void n(Object obj, long j11, int i11) {
        this.f41151a.putInt(obj, j11, i11);
    }

    public final void o(Object obj, long j11, long j12) {
        this.f41151a.putLong(obj, j11, j12);
    }

    public final void p(Object obj, long j11, Object obj2) {
        this.f41151a.putObject(obj, j11, obj2);
    }
}
