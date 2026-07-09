package com.google.common.primitives;

import java.io.Serializable;
import java.util.Arrays;
import zo.o;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final e f46075d = new e(new int[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f46076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient int f46077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f46078c;

    private e(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public static e a(int[] iArr) {
        return iArr.length == 0 ? f46075d : new e(Arrays.copyOf(iArr, iArr.length));
    }

    private boolean d() {
        return this.f46077b > 0 || this.f46078c < this.f46076a.length;
    }

    public static e f() {
        return f46075d;
    }

    public int b(int i11) {
        o.i(i11, e());
        return this.f46076a[this.f46077b + i11];
    }

    public boolean c() {
        return this.f46078c == this.f46077b;
    }

    public int e() {
        return this.f46078c - this.f46077b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (e() != eVar.e()) {
            return false;
        }
        for (int i11 = 0; i11 < e(); i11++) {
            if (b(i11) != eVar.b(i11)) {
                return false;
            }
        }
        return true;
    }

    public int[] g() {
        return Arrays.copyOfRange(this.f46076a, this.f46077b, this.f46078c);
    }

    public e h() {
        return d() ? new e(g()) : this;
    }

    public int hashCode() {
        int iJ = 1;
        for (int i11 = this.f46077b; i11 < this.f46078c; i11++) {
            iJ = (iJ * 31) + f.j(this.f46076a[i11]);
        }
        return iJ;
    }

    Object readResolve() {
        return c() ? f46075d : this;
    }

    public String toString() {
        if (c()) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(e() * 5);
        sb2.append('[');
        sb2.append(this.f46076a[this.f46077b]);
        int i11 = this.f46077b;
        while (true) {
            i11++;
            if (i11 >= this.f46078c) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.f46076a[i11]);
        }
    }

    Object writeReplace() {
        return h();
    }

    private e(int[] iArr, int i11, int i12) {
        this.f46076a = iArr;
        this.f46077b = i11;
        this.f46078c = i12;
    }
}
