package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator f12160a = new a();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return dVar.f12163a - dVar2.f12163a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class b {
        public abstract boolean a(int i11, int i12);

        public abstract boolean b(int i11, int i12);

        public abstract Object c(int i11, int i12);

        public abstract int d();

        public abstract int e();
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f12161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f12162b;

        c(int i11) {
            int[] iArr = new int[i11];
            this.f12161a = iArr;
            this.f12162b = iArr.length / 2;
        }

        int[] a() {
            return this.f12161a;
        }

        int b(int i11) {
            return this.f12161a[i11 + this.f12162b];
        }

        void c(int i11, int i12) {
            this.f12161a[i11 + this.f12162b] = i12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f12165c;

        d(int i11, int i12, int i13) {
            this.f12163a = i11;
            this.f12164b = i12;
            this.f12165c = i13;
        }

        int a() {
            return this.f12163a + this.f12165c;
        }

        int b() {
            return this.f12164b + this.f12165c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f12166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f12167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f12168c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final b f12169d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f12170e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f12171f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f12172g;

        e(b bVar, List list, int[] iArr, int[] iArr2, boolean z11) {
            this.f12166a = list;
            this.f12167b = iArr;
            this.f12168c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f12169d = bVar;
            this.f12170e = bVar.e();
            this.f12171f = bVar.d();
            this.f12172g = z11;
            a();
            d();
        }

        private void a() {
            d dVar = this.f12166a.isEmpty() ? null : (d) this.f12166a.get(0);
            if (dVar == null || dVar.f12163a != 0 || dVar.f12164b != 0) {
                this.f12166a.add(0, new d(0, 0, 0));
            }
            this.f12166a.add(new d(this.f12170e, this.f12171f, 0));
        }

        private void c(int i11) {
            int size = this.f12166a.size();
            int iB = 0;
            for (int i12 = 0; i12 < size; i12++) {
                d dVar = (d) this.f12166a.get(i12);
                while (iB < dVar.f12164b) {
                    if (this.f12168c[iB] == 0 && this.f12169d.b(i11, iB)) {
                        int i13 = this.f12169d.a(i11, iB) ? 8 : 4;
                        this.f12167b[i11] = (iB << 4) | i13;
                        this.f12168c[iB] = (i11 << 4) | i13;
                        return;
                    }
                    iB++;
                }
                iB = dVar.b();
            }
        }

        private void d() {
            for (d dVar : this.f12166a) {
                for (int i11 = 0; i11 < dVar.f12165c; i11++) {
                    int i12 = dVar.f12163a + i11;
                    int i13 = dVar.f12164b + i11;
                    int i14 = this.f12169d.a(i12, i13) ? 1 : 2;
                    this.f12167b[i12] = (i13 << 4) | i14;
                    this.f12168c[i13] = (i12 << 4) | i14;
                }
            }
            if (this.f12172g) {
                e();
            }
        }

        private void e() {
            int iA = 0;
            for (d dVar : this.f12166a) {
                while (iA < dVar.f12163a) {
                    if (this.f12167b[iA] == 0) {
                        c(iA);
                    }
                    iA++;
                }
                iA = dVar.a();
            }
        }

        private static g f(Collection collection, int i11, boolean z11) {
            g gVar;
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    gVar = null;
                    break;
                }
                gVar = (g) it.next();
                if (gVar.f12173a == i11 && gVar.f12175c == z11) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                g gVar2 = (g) it.next();
                if (z11) {
                    gVar2.f12174b--;
                } else {
                    gVar2.f12174b++;
                }
            }
            return gVar;
        }

        public void b(n nVar) {
            int i11;
            androidx.recyclerview.widget.e eVar = nVar instanceof androidx.recyclerview.widget.e ? (androidx.recyclerview.widget.e) nVar : new androidx.recyclerview.widget.e(nVar);
            int i12 = this.f12170e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i13 = this.f12170e;
            int i14 = this.f12171f;
            for (int size = this.f12166a.size() - 1; size >= 0; size--) {
                d dVar = (d) this.f12166a.get(size);
                int iA = dVar.a();
                int iB = dVar.b();
                while (true) {
                    if (i13 <= iA) {
                        break;
                    }
                    i13--;
                    int i15 = this.f12167b[i13];
                    if ((i15 & 12) != 0) {
                        int i16 = i15 >> 4;
                        g gVarF = f(arrayDeque, i16, false);
                        if (gVarF != null) {
                            int i17 = (i12 - gVarF.f12174b) - 1;
                            eVar.d(i13, i17);
                            if ((i15 & 4) != 0) {
                                eVar.c(i17, 1, this.f12169d.c(i13, i16));
                            }
                        } else {
                            arrayDeque.add(new g(i13, (i12 - i13) - 1, true));
                        }
                    } else {
                        eVar.b(i13, 1);
                        i12--;
                    }
                }
                while (i14 > iB) {
                    i14--;
                    int i18 = this.f12168c[i14];
                    if ((i18 & 12) != 0) {
                        int i19 = i18 >> 4;
                        g gVarF2 = f(arrayDeque, i19, true);
                        if (gVarF2 == null) {
                            arrayDeque.add(new g(i14, i12 - i13, false));
                        } else {
                            eVar.d((i12 - gVarF2.f12174b) - 1, i13);
                            if ((i18 & 4) != 0) {
                                eVar.c(i13, 1, this.f12169d.c(i19, i14));
                            }
                        }
                    } else {
                        eVar.a(i13, 1);
                        i12++;
                    }
                }
                int i21 = dVar.f12163a;
                int i22 = dVar.f12164b;
                for (i11 = 0; i11 < dVar.f12165c; i11++) {
                    if ((this.f12167b[i21] & 15) == 2) {
                        eVar.c(i21, 1, this.f12169d.c(i21, i22));
                    }
                    i21++;
                    i22++;
                }
                i13 = dVar.f12163a;
                i14 = dVar.f12164b;
            }
            eVar.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class f {
        public abstract boolean a(Object obj, Object obj2);

        public abstract boolean b(Object obj, Object obj2);

        public Object c(Object obj, Object obj2) {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f12173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f12174b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f12175c;

        g(int i11, int i12, boolean z11) {
            this.f12173a = i11;
            this.f12174b = i12;
            this.f12175c = z11;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.h$h, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class C0177h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f12176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f12177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f12178c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f12179d;

        public C0177h() {
        }

        int a() {
            return this.f12179d - this.f12178c;
        }

        int b() {
            return this.f12177b - this.f12176a;
        }

        public C0177h(int i11, int i12, int i13, int i14) {
            this.f12176a = i11;
            this.f12177b = i12;
            this.f12178c = i13;
            this.f12179d = i14;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f12182c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f12183d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f12184e;

        i() {
        }

        int a() {
            return Math.min(this.f12182c - this.f12180a, this.f12183d - this.f12181b);
        }

        boolean b() {
            return this.f12183d - this.f12181b != this.f12182c - this.f12180a;
        }

        boolean c() {
            return this.f12183d - this.f12181b > this.f12182c - this.f12180a;
        }

        d d() {
            if (b()) {
                return this.f12184e ? new d(this.f12180a, this.f12181b, a()) : c() ? new d(this.f12180a, this.f12181b + 1, a()) : new d(this.f12180a + 1, this.f12181b, a());
            }
            int i11 = this.f12180a;
            return new d(i11, this.f12181b, this.f12182c - i11);
        }
    }

    private static i a(C0177h c0177h, b bVar, c cVar, c cVar2, int i11) {
        int iB;
        int i12;
        int i13;
        boolean z11 = (c0177h.b() - c0177h.a()) % 2 == 0;
        int iB2 = c0177h.b() - c0177h.a();
        int i14 = -i11;
        for (int i15 = i14; i15 <= i11; i15 += 2) {
            if (i15 == i14 || (i15 != i11 && cVar2.b(i15 + 1) < cVar2.b(i15 - 1))) {
                iB = cVar2.b(i15 + 1);
                i12 = iB;
            } else {
                iB = cVar2.b(i15 - 1);
                i12 = iB - 1;
            }
            int i16 = c0177h.f12179d - ((c0177h.f12177b - i12) - i15);
            int i17 = (i11 == 0 || i12 != iB) ? i16 : i16 + 1;
            while (i12 > c0177h.f12176a && i16 > c0177h.f12178c && bVar.b(i12 - 1, i16 - 1)) {
                i12--;
                i16--;
            }
            cVar2.c(i15, i12);
            if (z11 && (i13 = iB2 - i15) >= i14 && i13 <= i11 && cVar.b(i13) >= i12) {
                i iVar = new i();
                iVar.f12180a = i12;
                iVar.f12181b = i16;
                iVar.f12182c = iB;
                iVar.f12183d = i17;
                iVar.f12184e = true;
                return iVar;
            }
        }
        return null;
    }

    public static e b(b bVar) {
        return c(bVar, true);
    }

    public static e c(b bVar, boolean z11) {
        int iE = bVar.e();
        int iD = bVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0177h(0, iE, 0, iD));
        int i11 = ((((iE + iD) + 1) / 2) * 2) + 1;
        c cVar = new c(i11);
        c cVar2 = new c(i11);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C0177h c0177h = (C0177h) arrayList2.remove(arrayList2.size() - 1);
            i iVarE = e(c0177h, bVar, cVar, cVar2);
            if (iVarE != null) {
                if (iVarE.a() > 0) {
                    arrayList.add(iVarE.d());
                }
                C0177h c0177h2 = arrayList3.isEmpty() ? new C0177h() : (C0177h) arrayList3.remove(arrayList3.size() - 1);
                c0177h2.f12176a = c0177h.f12176a;
                c0177h2.f12178c = c0177h.f12178c;
                c0177h2.f12177b = iVarE.f12180a;
                c0177h2.f12179d = iVarE.f12181b;
                arrayList2.add(c0177h2);
                c0177h.f12177b = c0177h.f12177b;
                c0177h.f12179d = c0177h.f12179d;
                c0177h.f12176a = iVarE.f12182c;
                c0177h.f12178c = iVarE.f12183d;
                arrayList2.add(c0177h);
            } else {
                arrayList3.add(c0177h);
            }
        }
        Collections.sort(arrayList, f12160a);
        return new e(bVar, arrayList, cVar.a(), cVar2.a(), z11);
    }

    private static i d(C0177h c0177h, b bVar, c cVar, c cVar2, int i11) {
        int iB;
        int i12;
        int i13;
        boolean z11 = Math.abs(c0177h.b() - c0177h.a()) % 2 == 1;
        int iB2 = c0177h.b() - c0177h.a();
        int i14 = -i11;
        for (int i15 = i14; i15 <= i11; i15 += 2) {
            if (i15 == i14 || (i15 != i11 && cVar.b(i15 + 1) > cVar.b(i15 - 1))) {
                iB = cVar.b(i15 + 1);
                i12 = iB;
            } else {
                iB = cVar.b(i15 - 1);
                i12 = iB + 1;
            }
            int i16 = (c0177h.f12178c + (i12 - c0177h.f12176a)) - i15;
            int i17 = (i11 == 0 || i12 != iB) ? i16 : i16 - 1;
            while (i12 < c0177h.f12177b && i16 < c0177h.f12179d && bVar.b(i12, i16)) {
                i12++;
                i16++;
            }
            cVar.c(i15, i12);
            if (z11 && (i13 = iB2 - i15) >= i14 + 1 && i13 <= i11 - 1 && cVar2.b(i13) <= i12) {
                i iVar = new i();
                iVar.f12180a = iB;
                iVar.f12181b = i17;
                iVar.f12182c = i12;
                iVar.f12183d = i16;
                iVar.f12184e = false;
                return iVar;
            }
        }
        return null;
    }

    private static i e(C0177h c0177h, b bVar, c cVar, c cVar2) {
        if (c0177h.b() >= 1 && c0177h.a() >= 1) {
            int iB = ((c0177h.b() + c0177h.a()) + 1) / 2;
            cVar.c(1, c0177h.f12176a);
            cVar2.c(1, c0177h.f12177b);
            for (int i11 = 0; i11 < iB; i11++) {
                i iVarD = d(c0177h, bVar, cVar, cVar2, i11);
                if (iVarD != null) {
                    return iVarD;
                }
                i iVarA = a(c0177h, bVar, cVar, cVar2, i11);
                if (iVarA != null) {
                    return iVarA;
                }
            }
        }
        return null;
    }
}
