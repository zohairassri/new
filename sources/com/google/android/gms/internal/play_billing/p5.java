package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class p5 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p5 f42518b = new n5(q6.f42534b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f42519a = 0;

    static {
        int i11 = c5.f42337a;
    }

    p5() {
    }

    static int l(int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if ((i11 | i12 | i14 | (i13 - i12)) >= 0) {
            return i14;
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i11 + " < 0");
        }
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i11 + ", " + i12);
        }
        throw new IndexOutOfBoundsException("End index: " + i12 + " >= " + i13);
    }

    public static p5 p(byte[] bArr, int i11, int i12) {
        l(i11, i11 + i12, bArr.length);
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        return new n5(bArr2);
    }

    public abstract byte a(int i11);

    abstract byte b(int i11);

    public abstract int d();

    protected abstract int e(int i11, int i12, int i13);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iE = this.f42519a;
        if (iE == 0) {
            int iD = d();
            iE = e(iD, 0, iD);
            if (iE == 0) {
                iE = 1;
            }
            this.f42519a = iE;
        }
        return iE;
    }

    public abstract p5 i(int i11, int i12);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new i5(this);
    }

    abstract void j(h5 h5Var);

    protected final int m() {
        return this.f42519a;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()), d() <= 50 ? v7.a(this) : v7.a(i(0, 47)).concat("..."));
    }
}
