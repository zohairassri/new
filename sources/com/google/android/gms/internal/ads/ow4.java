package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ow4 extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator f32128i = new gw4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparator f32129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f32130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    nw4 f32131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f32132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f32133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final nw4 f32134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private iw4 f32135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private kw4 f32136h;

    public ow4(Comparator comparator, boolean z11) {
        this.f32132d = 0;
        this.f32133e = 0;
        this.f32129a = comparator;
        this.f32130b = z11;
        this.f32134f = new nw4(z11);
    }

    private final void h(nw4 nw4Var, nw4 nw4Var2) {
        nw4 nw4Var3 = nw4Var.f31670a;
        nw4Var.f31670a = null;
        if (nw4Var2 != null) {
            nw4Var2.f31670a = nw4Var3;
        }
        if (nw4Var3 == null) {
            this.f32131c = nw4Var2;
        } else if (nw4Var3.f31671b == nw4Var) {
            nw4Var3.f31671b = nw4Var2;
        } else {
            nw4Var3.f31672c = nw4Var2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void i(com.google.android.gms.internal.ads.nw4 r9, boolean r10) {
        /*
            r8 = this;
        L0:
            if (r9 == 0) goto L84
            com.google.android.gms.internal.ads.nw4 r0 = r9.f31671b
            com.google.android.gms.internal.ads.nw4 r1 = r9.f31672c
            r2 = 0
            if (r0 == 0) goto Lc
            int r3 = r0.f31678i
            goto Ld
        Lc:
            r3 = r2
        Ld:
            if (r1 == 0) goto L12
            int r4 = r1.f31678i
            goto L13
        L12:
            r4 = r2
        L13:
            int r5 = r3 - r4
            r6 = -2
            r7 = 1
            if (r5 != r6) goto L42
            com.google.android.gms.internal.ads.nw4 r0 = r1.f31671b
            com.google.android.gms.internal.ads.nw4 r3 = r1.f31672c
            if (r3 == 0) goto L22
            int r3 = r3.f31678i
            goto L23
        L22:
            r3 = r2
        L23:
            if (r0 == 0) goto L28
            int r0 = r0.f31678i
            goto L29
        L28:
            r0 = r2
        L29:
            int r0 = r0 - r3
            r3 = -1
            if (r0 == r3) goto L3a
            if (r0 != 0) goto L32
            if (r10 != 0) goto L33
            goto L3b
        L32:
            r7 = r10
        L33:
            r8.k(r1)
            r8.j(r9)
            goto L3f
        L3a:
            r2 = r10
        L3b:
            r8.j(r9)
            r7 = r2
        L3f:
            if (r7 != 0) goto L84
            goto L80
        L42:
            r1 = 2
            if (r5 != r1) goto L6d
            com.google.android.gms.internal.ads.nw4 r1 = r0.f31671b
            com.google.android.gms.internal.ads.nw4 r3 = r0.f31672c
            if (r3 == 0) goto L4e
            int r3 = r3.f31678i
            goto L4f
        L4e:
            r3 = r2
        L4f:
            if (r1 == 0) goto L54
            int r1 = r1.f31678i
            goto L55
        L54:
            r1 = r2
        L55:
            int r1 = r1 - r3
            if (r1 == r7) goto L65
            if (r1 != 0) goto L5d
            if (r10 != 0) goto L5e
            goto L66
        L5d:
            r7 = r10
        L5e:
            r8.j(r0)
            r8.k(r9)
            goto L6a
        L65:
            r2 = r10
        L66:
            r8.k(r9)
            r7 = r2
        L6a:
            if (r7 == 0) goto L80
            goto L84
        L6d:
            if (r5 != 0) goto L76
            int r3 = r3 + 1
            r9.f31678i = r3
            if (r10 == 0) goto L80
            goto L84
        L76:
            int r0 = java.lang.Math.max(r3, r4)
            int r0 = r0 + r7
            r9.f31678i = r0
            if (r10 != 0) goto L80
            goto L84
        L80:
            com.google.android.gms.internal.ads.nw4 r9 = r9.f31670a
            goto L0
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ow4.i(com.google.android.gms.internal.ads.nw4, boolean):void");
    }

    private final void j(nw4 nw4Var) {
        nw4 nw4Var2 = nw4Var.f31671b;
        nw4 nw4Var3 = nw4Var.f31672c;
        nw4 nw4Var4 = nw4Var3.f31671b;
        nw4 nw4Var5 = nw4Var3.f31672c;
        nw4Var.f31672c = nw4Var4;
        if (nw4Var4 != null) {
            nw4Var4.f31670a = nw4Var;
        }
        h(nw4Var, nw4Var3);
        nw4Var3.f31671b = nw4Var;
        nw4Var.f31670a = nw4Var3;
        int iMax = Math.max(nw4Var2 != null ? nw4Var2.f31678i : 0, nw4Var4 != null ? nw4Var4.f31678i : 0) + 1;
        nw4Var.f31678i = iMax;
        nw4Var3.f31678i = Math.max(iMax, nw4Var5 != null ? nw4Var5.f31678i : 0) + 1;
    }

    private final void k(nw4 nw4Var) {
        nw4 nw4Var2 = nw4Var.f31671b;
        nw4 nw4Var3 = nw4Var.f31672c;
        nw4 nw4Var4 = nw4Var2.f31671b;
        nw4 nw4Var5 = nw4Var2.f31672c;
        nw4Var.f31671b = nw4Var5;
        if (nw4Var5 != null) {
            nw4Var5.f31670a = nw4Var;
        }
        h(nw4Var, nw4Var2);
        nw4Var2.f31672c = nw4Var;
        nw4Var.f31670a = nw4Var2;
        int iMax = Math.max(nw4Var3 != null ? nw4Var3.f31678i : 0, nw4Var5 != null ? nw4Var5.f31678i : 0) + 1;
        nw4Var.f31678i = iMax;
        nw4Var2.f31678i = Math.max(iMax, nw4Var4 != null ? nw4Var4.f31678i : 0) + 1;
    }

    final nw4 a(Object obj, boolean z11) {
        int iCompareTo;
        nw4 nw4Var;
        Comparator comparator = this.f32129a;
        nw4 nw4Var2 = this.f32131c;
        if (nw4Var2 != null) {
            Comparable comparable = comparator == f32128i ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(nw4Var2.f31675f) : comparator.compare(obj, nw4Var2.f31675f);
                if (iCompareTo == 0) {
                    return nw4Var2;
                }
                nw4 nw4Var3 = iCompareTo < 0 ? nw4Var2.f31671b : nw4Var2.f31672c;
                if (nw4Var3 == null) {
                    break;
                }
                nw4Var2 = nw4Var3;
            }
        } else {
            iCompareTo = 0;
        }
        int i11 = iCompareTo;
        if (!z11) {
            return null;
        }
        nw4 nw4Var4 = this.f32134f;
        if (nw4Var2 != null) {
            nw4 nw4Var5 = nw4Var2;
            nw4Var = new nw4(this.f32130b, nw4Var5, obj, nw4Var4, nw4Var4.f31674e);
            if (i11 < 0) {
                nw4Var5.f31671b = nw4Var;
            } else {
                nw4Var5.f31672c = nw4Var;
            }
            i(nw4Var5, true);
        } else {
            if (comparator == f32128i && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            nw4Var = new nw4(this.f32130b, null, obj, nw4Var4, nw4Var4.f31674e);
            this.f32131c = nw4Var;
        }
        this.f32132d++;
        this.f32133e++;
        return nw4Var;
    }

    final nw4 c(Object obj) {
        if (obj != null) {
            try {
                return a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f32131c = null;
        this.f32132d = 0;
        this.f32133e++;
        nw4 nw4Var = this.f32134f;
        nw4Var.f31674e = nw4Var;
        nw4Var.f31673d = nw4Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return c(obj) != null;
    }

    final nw4 d(Map.Entry entry) {
        nw4 nw4VarC = c(entry.getKey());
        if (nw4VarC == null || !Objects.equals(nw4VarC.f31677h, entry.getValue())) {
            return null;
        }
        return nw4VarC;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        iw4 iw4Var = this.f32135g;
        if (iw4Var != null) {
            return iw4Var;
        }
        iw4 iw4Var2 = new iw4(this);
        this.f32135g = iw4Var2;
        return iw4Var2;
    }

    final void f(nw4 nw4Var, boolean z11) {
        nw4 nw4Var2;
        nw4 nw4Var3;
        int i11;
        if (z11) {
            nw4 nw4Var4 = nw4Var.f31674e;
            nw4Var4.f31673d = nw4Var.f31673d;
            nw4Var.f31673d.f31674e = nw4Var4;
        }
        nw4 nw4Var5 = nw4Var.f31671b;
        nw4 nw4Var6 = nw4Var.f31672c;
        nw4 nw4Var7 = nw4Var.f31670a;
        int i12 = 0;
        if (nw4Var5 == null || nw4Var6 == null) {
            if (nw4Var5 != null) {
                h(nw4Var, nw4Var5);
                nw4Var.f31671b = null;
            } else if (nw4Var6 != null) {
                h(nw4Var, nw4Var6);
                nw4Var.f31672c = null;
            } else {
                h(nw4Var, null);
            }
            i(nw4Var7, false);
            this.f32132d--;
            this.f32133e++;
            return;
        }
        if (nw4Var5.f31678i > nw4Var6.f31678i) {
            do {
                nw4Var3 = nw4Var5;
                nw4Var5 = nw4Var5.f31672c;
            } while (nw4Var5 != null);
        } else {
            do {
                nw4Var2 = nw4Var6;
                nw4Var6 = nw4Var6.f31671b;
            } while (nw4Var6 != null);
            nw4Var3 = nw4Var2;
        }
        f(nw4Var3, false);
        nw4 nw4Var8 = nw4Var.f31671b;
        if (nw4Var8 != null) {
            i11 = nw4Var8.f31678i;
            nw4Var3.f31671b = nw4Var8;
            nw4Var8.f31670a = nw4Var3;
            nw4Var.f31671b = null;
        } else {
            i11 = 0;
        }
        nw4 nw4Var9 = nw4Var.f31672c;
        if (nw4Var9 != null) {
            i12 = nw4Var9.f31678i;
            nw4Var3.f31672c = nw4Var9;
            nw4Var9.f31670a = nw4Var3;
            nw4Var.f31672c = null;
        }
        nw4Var3.f31678i = Math.max(i11, i12) + 1;
        h(nw4Var, nw4Var3);
    }

    final nw4 g(Object obj) {
        nw4 nw4VarC = c(obj);
        if (nw4VarC != null) {
            f(nw4VarC, true);
        }
        return nw4VarC;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        nw4 nw4VarC = c(obj);
        if (nw4VarC != null) {
            return nw4VarC.f31677h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        kw4 kw4Var = this.f32136h;
        if (kw4Var != null) {
            return kw4Var;
        }
        kw4 kw4Var2 = new kw4(this);
        this.f32136h = kw4Var2;
        return kw4Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f32130b) {
            throw new NullPointerException("value == null");
        }
        nw4 nw4VarA = a(obj, true);
        Object obj3 = nw4VarA.f31677h;
        nw4VarA.f31677h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        nw4 nw4VarG = g(obj);
        if (nw4VarG != null) {
            return nw4VarG.f31677h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f32132d;
    }

    public ow4(boolean z11) {
        this(f32128i, false);
    }
}
