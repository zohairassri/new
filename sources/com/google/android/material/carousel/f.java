package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f44240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f44241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f44242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f44243d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f44244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f44245b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f44247d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f44248e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f44246c = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f44249f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f44250g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f44251h = 0.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f44252i = -1;

        b(float f11, float f12) {
            this.f44244a = f11;
            this.f44245b = f12;
        }

        private static float j(float f11, float f12, int i11, int i12) {
            return (f11 - (i11 * f12)) + (i12 * f12);
        }

        b a(float f11, float f12, float f13) {
            return d(f11, f12, f13, false, true);
        }

        b b(float f11, float f12, float f13) {
            return c(f11, f12, f13, false);
        }

        b c(float f11, float f12, float f13, boolean z11) {
            return d(f11, f12, f13, z11, false);
        }

        b d(float f11, float f12, float f13, boolean z11, boolean z12) {
            float fAbs;
            float f14 = f13 / 2.0f;
            float f15 = f11 - f14;
            float f16 = f14 + f11;
            float f17 = this.f44245b;
            if (f16 > f17) {
                fAbs = Math.abs(f16 - Math.max(f16 - f13, f17));
            } else {
                fAbs = 0.0f;
                if (f15 < 0.0f) {
                    fAbs = Math.abs(f15 - Math.min(f15 + f13, 0.0f));
                }
            }
            return e(f11, f12, f13, z11, z12, fAbs);
        }

        b e(float f11, float f12, float f13, boolean z11, boolean z12, float f14) {
            return f(f11, f12, f13, z11, z12, f14, 0.0f, 0.0f);
        }

        b f(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15, float f16) {
            if (f13 <= 0.0f) {
                return this;
            }
            if (z12) {
                if (z11) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i11 = this.f44252i;
                if (i11 != -1 && i11 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f44252i = this.f44246c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f11, f12, f13, z12, f14, f15, f16);
            if (z11) {
                if (this.f44247d == null) {
                    this.f44247d = cVar;
                    this.f44249f = this.f44246c.size();
                }
                if (this.f44250g != -1 && this.f44246c.size() - this.f44250g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f13 != this.f44247d.f44256d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f44248e = cVar;
                this.f44250g = this.f44246c.size();
            } else {
                if (this.f44247d == null && cVar.f44256d < this.f44251h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f44248e != null && cVar.f44256d > this.f44251h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f44251h = cVar.f44256d;
            this.f44246c.add(cVar);
            return this;
        }

        b g(float f11, float f12, float f13, int i11) {
            return h(f11, f12, f13, i11, false);
        }

        b h(float f11, float f12, float f13, int i11, boolean z11) {
            if (i11 > 0 && f13 > 0.0f) {
                for (int i12 = 0; i12 < i11; i12++) {
                    c((i12 * f13) + f11, f12, f13, z11);
                }
            }
            return this;
        }

        f i() {
            if (this.f44247d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < this.f44246c.size(); i11++) {
                c cVar = (c) this.f44246c.get(i11);
                arrayList.add(new c(j(this.f44247d.f44254b, this.f44244a, this.f44249f, i11), cVar.f44254b, cVar.f44255c, cVar.f44256d, cVar.f44257e, cVar.f44258f, cVar.f44259g, cVar.f44260h));
            }
            return new f(this.f44244a, arrayList, this.f44249f, this.f44250g);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f44253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f44254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f44255c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final float f44256d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f44257e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final float f44258f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final float f44259g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final float f44260h;

        c(float f11, float f12, float f13, float f14) {
            this(f11, f12, f13, f14, false, 0.0f, 0.0f, 0.0f);
        }

        static c a(c cVar, c cVar2, float f11) {
            return new c(un.a.a(cVar.f44253a, cVar2.f44253a, f11), un.a.a(cVar.f44254b, cVar2.f44254b, f11), un.a.a(cVar.f44255c, cVar2.f44255c, f11), un.a.a(cVar.f44256d, cVar2.f44256d, f11));
        }

        c(float f11, float f12, float f13, float f14, boolean z11, float f15, float f16, float f17) {
            this.f44253a = f11;
            this.f44254b = f12;
            this.f44255c = f13;
            this.f44256d = f14;
            this.f44257e = z11;
            this.f44258f = f15;
            this.f44259g = f16;
            this.f44260h = f17;
        }
    }

    static f m(f fVar, f fVar2, float f11) {
        if (fVar.f() != fVar2.f()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List listG = fVar.g();
        List listG2 = fVar2.g();
        if (listG.size() != listG2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < fVar.g().size(); i11++) {
            arrayList.add(c.a((c) listG.get(i11), (c) listG2.get(i11), f11));
        }
        return new f(fVar.f(), arrayList, un.a.c(fVar.b(), fVar2.b(), f11), un.a.c(fVar.i(), fVar2.i(), f11));
    }

    static f n(f fVar, float f11) {
        b bVar = new b(fVar.f(), f11);
        float f12 = (f11 - fVar.j().f44254b) - (fVar.j().f44256d / 2.0f);
        int size = fVar.g().size() - 1;
        while (size >= 0) {
            c cVar = (c) fVar.g().get(size);
            bVar.d((cVar.f44256d / 2.0f) + f12, cVar.f44255c, cVar.f44256d, size >= fVar.b() && size <= fVar.i(), cVar.f44257e);
            f12 += cVar.f44256d;
            size--;
        }
        return bVar.i();
    }

    c a() {
        return (c) this.f44241b.get(this.f44242c);
    }

    int b() {
        return this.f44242c;
    }

    c c() {
        return (c) this.f44241b.get(0);
    }

    c d() {
        for (int i11 = 0; i11 < this.f44241b.size(); i11++) {
            c cVar = (c) this.f44241b.get(i11);
            if (!cVar.f44257e) {
                return cVar;
            }
        }
        return null;
    }

    List e() {
        return this.f44241b.subList(this.f44242c, this.f44243d + 1);
    }

    float f() {
        return this.f44240a;
    }

    List g() {
        return this.f44241b;
    }

    c h() {
        return (c) this.f44241b.get(this.f44243d);
    }

    int i() {
        return this.f44243d;
    }

    c j() {
        return (c) this.f44241b.get(r1.size() - 1);
    }

    c k() {
        for (int size = this.f44241b.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f44241b.get(size);
            if (!cVar.f44257e) {
                return cVar;
            }
        }
        return null;
    }

    int l() {
        Iterator it = this.f44241b.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (((c) it.next()).f44257e) {
                i11++;
            }
        }
        return this.f44241b.size() - i11;
    }

    private f(float f11, List list, int i11, int i12) {
        this.f44240a = f11;
        this.f44241b = Collections.unmodifiableList(list);
        this.f44242c = i11;
        this.f44243d = i12;
    }
}
