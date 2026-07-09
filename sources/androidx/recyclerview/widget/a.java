package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class a implements o.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private w4.f f12059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList f12060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList f12061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final InterfaceC0174a f12062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Runnable f12063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f12064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final o f12065g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f12066h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    interface InterfaceC0174a {
        void a(int i11, int i12);

        void b(b bVar);

        void c(b bVar);

        void d(int i11, int i12);

        void e(int i11, int i12, Object obj);

        RecyclerView.d0 f(int i11);

        void g(int i11, int i12);

        void h(int i11, int i12);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f12067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f12068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f12069c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f12070d;

        b(int i11, int i12, int i13, Object obj) {
            this.f12067a = i11;
            this.f12068b = i12;
            this.f12070d = i13;
            this.f12069c = obj;
        }

        String a() {
            int i11 = this.f12067a;
            return i11 != 1 ? i11 != 2 ? i11 != 4 ? i11 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i11 = this.f12067a;
            if (i11 != bVar.f12067a) {
                return false;
            }
            if (i11 == 8 && Math.abs(this.f12070d - this.f12068b) == 1 && this.f12070d == bVar.f12068b && this.f12068b == bVar.f12070d) {
                return true;
            }
            if (this.f12070d != bVar.f12070d || this.f12068b != bVar.f12068b) {
                return false;
            }
            Object obj2 = this.f12069c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f12069c)) {
                    return false;
                }
            } else if (bVar.f12069c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f12067a * 31) + this.f12068b) * 31) + this.f12070d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f12068b + "c:" + this.f12070d + ",p:" + this.f12069c + "]";
        }
    }

    a(InterfaceC0174a interfaceC0174a) {
        this(interfaceC0174a, false);
    }

    private void c(b bVar) {
        v(bVar);
    }

    private void d(b bVar) {
        v(bVar);
    }

    private void f(b bVar) {
        boolean z11;
        byte b11;
        int i11 = bVar.f12068b;
        int i12 = bVar.f12070d + i11;
        byte b12 = -1;
        int i13 = i11;
        int i14 = 0;
        while (i13 < i12) {
            if (this.f12062d.f(i13) != null || h(i13)) {
                if (b12 == 0) {
                    k(a(2, i11, i14, null));
                    z11 = true;
                } else {
                    z11 = false;
                }
                b11 = 1;
            } else {
                if (b12 == 1) {
                    v(a(2, i11, i14, null));
                    z11 = true;
                } else {
                    z11 = false;
                }
                b11 = 0;
            }
            if (z11) {
                i13 -= i14;
                i12 -= i14;
                i14 = 1;
            } else {
                i14++;
            }
            i13++;
            b12 = b11;
        }
        if (i14 != bVar.f12070d) {
            b(bVar);
            bVar = a(2, i11, i14, null);
        }
        if (b12 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private void g(b bVar) {
        int i11 = bVar.f12068b;
        int i12 = bVar.f12070d + i11;
        int i13 = 0;
        byte b11 = -1;
        int i14 = i11;
        while (i11 < i12) {
            if (this.f12062d.f(i11) != null || h(i11)) {
                if (b11 == 0) {
                    k(a(4, i14, i13, bVar.f12069c));
                    i14 = i11;
                    i13 = 0;
                }
                b11 = 1;
            } else {
                if (b11 == 1) {
                    v(a(4, i14, i13, bVar.f12069c));
                    i14 = i11;
                    i13 = 0;
                }
                b11 = 0;
            }
            i13++;
            i11++;
        }
        if (i13 != bVar.f12070d) {
            Object obj = bVar.f12069c;
            b(bVar);
            bVar = a(4, i14, i13, obj);
        }
        if (b11 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private boolean h(int i11) {
        int size = this.f12061c.size();
        for (int i12 = 0; i12 < size; i12++) {
            b bVar = (b) this.f12061c.get(i12);
            int i13 = bVar.f12067a;
            if (i13 == 8) {
                if (n(bVar.f12070d, i12 + 1) == i11) {
                    return true;
                }
            } else if (i13 == 1) {
                int i14 = bVar.f12068b;
                int i15 = bVar.f12070d + i14;
                while (i14 < i15) {
                    if (n(i14, i12 + 1) == i11) {
                        return true;
                    }
                    i14++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i11;
        int i12 = bVar.f12067a;
        if (i12 == 1 || i12 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iZ = z(bVar.f12068b, i12);
        int i13 = bVar.f12068b;
        int i14 = bVar.f12067a;
        if (i14 == 2) {
            i11 = 0;
        } else {
            if (i14 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i11 = 1;
        }
        int i15 = 1;
        for (int i16 = 1; i16 < bVar.f12070d; i16++) {
            int iZ2 = z(bVar.f12068b + (i11 * i16), bVar.f12067a);
            int i17 = bVar.f12067a;
            if (i17 == 2 ? iZ2 != iZ : !(i17 == 4 && iZ2 == iZ + 1)) {
                b bVarA = a(i17, iZ, i15, bVar.f12069c);
                l(bVarA, i13);
                b(bVarA);
                if (bVar.f12067a == 4) {
                    i13 += i15;
                }
                i15 = 1;
                iZ = iZ2;
            } else {
                i15++;
            }
        }
        Object obj = bVar.f12069c;
        b(bVar);
        if (i15 > 0) {
            b bVarA2 = a(bVar.f12067a, iZ, i15, obj);
            l(bVarA2, i13);
            b(bVarA2);
        }
    }

    private void v(b bVar) {
        this.f12061c.add(bVar);
        int i11 = bVar.f12067a;
        if (i11 == 1) {
            this.f12062d.g(bVar.f12068b, bVar.f12070d);
            return;
        }
        if (i11 == 2) {
            this.f12062d.d(bVar.f12068b, bVar.f12070d);
            return;
        }
        if (i11 == 4) {
            this.f12062d.e(bVar.f12068b, bVar.f12070d, bVar.f12069c);
        } else {
            if (i11 == 8) {
                this.f12062d.a(bVar.f12068b, bVar.f12070d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int z(int i11, int i12) {
        int i13;
        int i14;
        for (int size = this.f12061c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f12061c.get(size);
            int i15 = bVar.f12067a;
            if (i15 == 8) {
                int i16 = bVar.f12068b;
                int i17 = bVar.f12070d;
                if (i16 < i17) {
                    i14 = i16;
                    i13 = i17;
                } else {
                    i13 = i16;
                    i14 = i17;
                }
                if (i11 < i14 || i11 > i13) {
                    if (i11 < i16) {
                        if (i12 == 1) {
                            bVar.f12068b = i16 + 1;
                            bVar.f12070d = i17 + 1;
                        } else if (i12 == 2) {
                            bVar.f12068b = i16 - 1;
                            bVar.f12070d = i17 - 1;
                        }
                    }
                } else if (i14 == i16) {
                    if (i12 == 1) {
                        bVar.f12070d = i17 + 1;
                    } else if (i12 == 2) {
                        bVar.f12070d = i17 - 1;
                    }
                    i11++;
                } else {
                    if (i12 == 1) {
                        bVar.f12068b = i16 + 1;
                    } else if (i12 == 2) {
                        bVar.f12068b = i16 - 1;
                    }
                    i11--;
                }
            } else {
                int i18 = bVar.f12068b;
                if (i18 <= i11) {
                    if (i15 == 1) {
                        i11 -= bVar.f12070d;
                    } else if (i15 == 2) {
                        i11 += bVar.f12070d;
                    }
                } else if (i12 == 1) {
                    bVar.f12068b = i18 + 1;
                } else if (i12 == 2) {
                    bVar.f12068b = i18 - 1;
                }
            }
        }
        for (int size2 = this.f12061c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f12061c.get(size2);
            if (bVar2.f12067a == 8) {
                int i19 = bVar2.f12070d;
                if (i19 == bVar2.f12068b || i19 < 0) {
                    this.f12061c.remove(size2);
                    b(bVar2);
                }
            } else if (bVar2.f12070d <= 0) {
                this.f12061c.remove(size2);
                b(bVar2);
            }
        }
        return i11;
    }

    @Override // androidx.recyclerview.widget.o.a
    public b a(int i11, int i12, int i13, Object obj) {
        b bVar = (b) this.f12059a.b();
        if (bVar == null) {
            return new b(i11, i12, i13, obj);
        }
        bVar.f12067a = i11;
        bVar.f12068b = i12;
        bVar.f12070d = i13;
        bVar.f12069c = obj;
        return bVar;
    }

    @Override // androidx.recyclerview.widget.o.a
    public void b(b bVar) {
        if (this.f12064f) {
            return;
        }
        bVar.f12069c = null;
        this.f12059a.a(bVar);
    }

    public int e(int i11) {
        int size = this.f12060b.size();
        for (int i12 = 0; i12 < size; i12++) {
            b bVar = (b) this.f12060b.get(i12);
            int i13 = bVar.f12067a;
            if (i13 != 1) {
                if (i13 == 2) {
                    int i14 = bVar.f12068b;
                    if (i14 <= i11) {
                        int i15 = bVar.f12070d;
                        if (i14 + i15 > i11) {
                            return -1;
                        }
                        i11 -= i15;
                    } else {
                        continue;
                    }
                } else if (i13 == 8) {
                    int i16 = bVar.f12068b;
                    if (i16 == i11) {
                        i11 = bVar.f12070d;
                    } else {
                        if (i16 < i11) {
                            i11--;
                        }
                        if (bVar.f12070d <= i11) {
                            i11++;
                        }
                    }
                }
            } else if (bVar.f12068b <= i11) {
                i11 += bVar.f12070d;
            }
        }
        return i11;
    }

    void i() {
        int size = this.f12061c.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f12062d.c((b) this.f12061c.get(i11));
        }
        x(this.f12061c);
        this.f12066h = 0;
    }

    void j() {
        i();
        int size = this.f12060b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f12060b.get(i11);
            int i12 = bVar.f12067a;
            if (i12 == 1) {
                this.f12062d.c(bVar);
                this.f12062d.g(bVar.f12068b, bVar.f12070d);
            } else if (i12 == 2) {
                this.f12062d.c(bVar);
                this.f12062d.h(bVar.f12068b, bVar.f12070d);
            } else if (i12 == 4) {
                this.f12062d.c(bVar);
                this.f12062d.e(bVar.f12068b, bVar.f12070d, bVar.f12069c);
            } else if (i12 == 8) {
                this.f12062d.c(bVar);
                this.f12062d.a(bVar.f12068b, bVar.f12070d);
            }
            Runnable runnable = this.f12063e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.f12060b);
        this.f12066h = 0;
    }

    void l(b bVar, int i11) {
        this.f12062d.b(bVar);
        int i12 = bVar.f12067a;
        if (i12 == 2) {
            this.f12062d.h(i11, bVar.f12070d);
        } else {
            if (i12 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f12062d.e(i11, bVar.f12070d, bVar.f12069c);
        }
    }

    int m(int i11) {
        return n(i11, 0);
    }

    int n(int i11, int i12) {
        int size = this.f12061c.size();
        while (i12 < size) {
            b bVar = (b) this.f12061c.get(i12);
            int i13 = bVar.f12067a;
            if (i13 == 8) {
                int i14 = bVar.f12068b;
                if (i14 == i11) {
                    i11 = bVar.f12070d;
                } else {
                    if (i14 < i11) {
                        i11--;
                    }
                    if (bVar.f12070d <= i11) {
                        i11++;
                    }
                }
            } else {
                int i15 = bVar.f12068b;
                if (i15 > i11) {
                    continue;
                } else if (i13 == 2) {
                    int i16 = bVar.f12070d;
                    if (i11 < i15 + i16) {
                        return -1;
                    }
                    i11 -= i16;
                } else if (i13 == 1) {
                    i11 += bVar.f12070d;
                }
            }
            i12++;
        }
        return i11;
    }

    boolean o(int i11) {
        return (this.f12066h & i11) != 0;
    }

    boolean p() {
        return this.f12060b.size() > 0;
    }

    boolean q() {
        return (this.f12061c.isEmpty() || this.f12060b.isEmpty()) ? false : true;
    }

    boolean r(int i11, int i12, Object obj) {
        if (i12 < 1) {
            return false;
        }
        this.f12060b.add(a(4, i11, i12, obj));
        this.f12066h |= 4;
        return this.f12060b.size() == 1;
    }

    boolean s(int i11, int i12) {
        if (i12 < 1) {
            return false;
        }
        this.f12060b.add(a(1, i11, i12, null));
        this.f12066h |= 1;
        return this.f12060b.size() == 1;
    }

    boolean t(int i11, int i12, int i13) {
        if (i11 == i12) {
            return false;
        }
        if (i13 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f12060b.add(a(8, i11, i12, null));
        this.f12066h |= 8;
        return this.f12060b.size() == 1;
    }

    boolean u(int i11, int i12) {
        if (i12 < 1) {
            return false;
        }
        this.f12060b.add(a(2, i11, i12, null));
        this.f12066h |= 2;
        return this.f12060b.size() == 1;
    }

    void w() {
        this.f12065g.b(this.f12060b);
        int size = this.f12060b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f12060b.get(i11);
            int i12 = bVar.f12067a;
            if (i12 == 1) {
                c(bVar);
            } else if (i12 == 2) {
                f(bVar);
            } else if (i12 == 4) {
                g(bVar);
            } else if (i12 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f12063e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f12060b.clear();
    }

    void x(List list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            b((b) list.get(i11));
        }
        list.clear();
    }

    void y() {
        x(this.f12060b);
        x(this.f12061c);
        this.f12066h = 0;
    }

    a(InterfaceC0174a interfaceC0174a, boolean z11) {
        this.f12059a = new w4.g(30);
        this.f12060b = new ArrayList();
        this.f12061c = new ArrayList();
        this.f12066h = 0;
        this.f12062d = interfaceC0174a;
        this.f12064f = z11;
        this.f12065g = new o(this);
    }
}
