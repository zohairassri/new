package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class en0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f25814a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicInteger f25815b = new AtomicInteger(0);

    public static int G() {
        return f25814a.get();
    }

    public static int H() {
        return f25815b.get();
    }

    protected static AtomicInteger I() {
        return f25814a;
    }

    protected static AtomicInteger J() {
        return f25815b;
    }

    public abstract long A();

    public abstract long B();

    public abstract int C();

    public abstract void D(boolean z11);

    public abstract long E();

    public abstract long F();

    public abstract Integer K();

    public abstract void L(Integer num);

    public abstract void M(Uri[] uriArr, String str);

    public abstract void N(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z11);

    public abstract void O(dn0 dn0Var);

    public abstract void P();

    public abstract void Q(Surface surface, boolean z11);

    public abstract void R(float f11, boolean z11);

    public abstract void S();

    public abstract void T(long j11);

    public abstract void U(int i11);

    public abstract void V(int i11);

    public abstract void r(int i11);

    public abstract boolean s();

    public abstract int t();

    public abstract long u();

    public abstract void v(boolean z11);

    public abstract void w(int i11);

    public abstract void x(int i11);

    public abstract long y();

    public abstract long z();
}
