package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final a f12251a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    interface a {
        a.b a(int i11, int i12, int i13, Object obj);

        void b(a.b bVar);
    }

    o(a aVar) {
        this.f12251a = aVar;
    }

    private int a(List list) {
        boolean z11 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((a.b) list.get(size)).f12067a != 8) {
                z11 = true;
            } else if (z11) {
                return size;
            }
        }
        return -1;
    }

    private void c(List list, int i11, a.b bVar, int i12, a.b bVar2) {
        int i13 = bVar.f12070d;
        int i14 = bVar2.f12068b;
        int i15 = i13 < i14 ? -1 : 0;
        int i16 = bVar.f12068b;
        if (i16 < i14) {
            i15++;
        }
        if (i14 <= i16) {
            bVar.f12068b = i16 + bVar2.f12070d;
        }
        int i17 = bVar2.f12068b;
        if (i17 <= i13) {
            bVar.f12070d = i13 + bVar2.f12070d;
        }
        bVar2.f12068b = i17 + i15;
        list.set(i11, bVar2);
        list.set(i12, bVar);
    }

    private void d(List list, int i11, int i12) {
        a.b bVar = (a.b) list.get(i11);
        a.b bVar2 = (a.b) list.get(i12);
        int i13 = bVar2.f12067a;
        if (i13 == 1) {
            c(list, i11, bVar, i12, bVar2);
        } else if (i13 == 2) {
            e(list, i11, bVar, i12, bVar2);
        } else {
            if (i13 != 4) {
                return;
            }
            f(list, i11, bVar, i12, bVar2);
        }
    }

    void b(List list) {
        while (true) {
            int iA = a(list);
            if (iA == -1) {
                return;
            } else {
                d(list, iA, iA + 1);
            }
        }
    }

    void e(List list, int i11, a.b bVar, int i12, a.b bVar2) {
        boolean z11;
        int i13 = bVar.f12068b;
        int i14 = bVar.f12070d;
        boolean z12 = false;
        if (i13 < i14) {
            if (bVar2.f12068b == i13 && bVar2.f12070d == i14 - i13) {
                z11 = false;
                z12 = true;
            } else {
                z11 = false;
            }
        } else if (bVar2.f12068b == i14 + 1 && bVar2.f12070d == i13 - i14) {
            z11 = true;
            z12 = true;
        } else {
            z11 = true;
        }
        int i15 = bVar2.f12068b;
        if (i14 < i15) {
            bVar2.f12068b = i15 - 1;
        } else {
            int i16 = bVar2.f12070d;
            if (i14 < i15 + i16) {
                bVar2.f12070d = i16 - 1;
                bVar.f12067a = 2;
                bVar.f12070d = 1;
                if (bVar2.f12070d == 0) {
                    list.remove(i12);
                    this.f12251a.b(bVar2);
                    return;
                }
                return;
            }
        }
        int i17 = bVar.f12068b;
        int i18 = bVar2.f12068b;
        a.b bVarA = null;
        if (i17 <= i18) {
            bVar2.f12068b = i18 + 1;
        } else {
            int i19 = bVar2.f12070d;
            if (i17 < i18 + i19) {
                bVarA = this.f12251a.a(2, i17 + 1, (i18 + i19) - i17, null);
                bVar2.f12070d = bVar.f12068b - bVar2.f12068b;
            }
        }
        if (z12) {
            list.set(i11, bVar2);
            list.remove(i12);
            this.f12251a.b(bVar);
            return;
        }
        if (z11) {
            if (bVarA != null) {
                int i21 = bVar.f12068b;
                if (i21 > bVarA.f12068b) {
                    bVar.f12068b = i21 - bVarA.f12070d;
                }
                int i22 = bVar.f12070d;
                if (i22 > bVarA.f12068b) {
                    bVar.f12070d = i22 - bVarA.f12070d;
                }
            }
            int i23 = bVar.f12068b;
            if (i23 > bVar2.f12068b) {
                bVar.f12068b = i23 - bVar2.f12070d;
            }
            int i24 = bVar.f12070d;
            if (i24 > bVar2.f12068b) {
                bVar.f12070d = i24 - bVar2.f12070d;
            }
        } else {
            if (bVarA != null) {
                int i25 = bVar.f12068b;
                if (i25 >= bVarA.f12068b) {
                    bVar.f12068b = i25 - bVarA.f12070d;
                }
                int i26 = bVar.f12070d;
                if (i26 >= bVarA.f12068b) {
                    bVar.f12070d = i26 - bVarA.f12070d;
                }
            }
            int i27 = bVar.f12068b;
            if (i27 >= bVar2.f12068b) {
                bVar.f12068b = i27 - bVar2.f12070d;
            }
            int i28 = bVar.f12070d;
            if (i28 >= bVar2.f12068b) {
                bVar.f12070d = i28 - bVar2.f12070d;
            }
        }
        list.set(i11, bVar2);
        if (bVar.f12068b != bVar.f12070d) {
            list.set(i12, bVar);
        } else {
            list.remove(i12);
        }
        if (bVarA != null) {
            list.add(i11, bVarA);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void f(java.util.List r9, int r10, androidx.recyclerview.widget.a.b r11, int r12, androidx.recyclerview.widget.a.b r13) {
        /*
            r8 = this;
            int r0 = r11.f12070d
            int r1 = r13.f12068b
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto Ld
            int r1 = r1 - r3
            r13.f12068b = r1
            goto L20
        Ld:
            int r5 = r13.f12070d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r3
            r13.f12070d = r5
            androidx.recyclerview.widget.o$a r0 = r8.f12251a
            int r1 = r11.f12068b
            java.lang.Object r5 = r13.f12069c
            androidx.recyclerview.widget.a$b r0 = r0.a(r2, r1, r3, r5)
            goto L21
        L20:
            r0 = r4
        L21:
            int r1 = r11.f12068b
            int r5 = r13.f12068b
            if (r1 > r5) goto L2b
            int r5 = r5 + r3
            r13.f12068b = r5
            goto L41
        L2b:
            int r6 = r13.f12070d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.o$a r4 = r8.f12251a
            int r1 = r1 + r3
            java.lang.Object r3 = r13.f12069c
            androidx.recyclerview.widget.a$b r4 = r4.a(r2, r1, r5, r3)
            int r1 = r13.f12070d
            int r1 = r1 - r5
            r13.f12070d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f12070d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.o$a r8 = r8.f12251a
            r8.b(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r4 == 0) goto L5e
            r9.add(r10, r4)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.o.f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
