package com.google.android.flexbox;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;
import x4.o;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.flexbox.a f22157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean[] f22158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int[] f22159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long[] f22160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long[] f22161e;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        List f22162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f22163b;

        b() {
        }

        void a() {
            this.f22162a = null;
            this.f22163b = 0;
        }
    }

    /* JADX INFO: renamed from: com.google.android.flexbox.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class C0313c implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f22164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f22165b;

        private C0313c() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C0313c c0313c) {
            int i11 = this.f22165b;
            int i12 = c0313c.f22165b;
            return i11 != i12 ? i11 - i12 : this.f22164a - c0313c.f22164a;
        }

        public String toString() {
            return "Order{order=" + this.f22165b + ", index=" + this.f22164a + '}';
        }
    }

    c(com.google.android.flexbox.a aVar) {
        this.f22157a = aVar;
    }

    private int A(FlexItem flexItem, boolean z11) {
        return z11 ? flexItem.v1() : flexItem.a2();
    }

    private int B(FlexItem flexItem, boolean z11) {
        return z11 ? flexItem.a2() : flexItem.v1();
    }

    private int C(FlexItem flexItem, boolean z11) {
        return z11 ? flexItem.v0() : flexItem.z1();
    }

    private int D(FlexItem flexItem, boolean z11) {
        return z11 ? flexItem.z1() : flexItem.v0();
    }

    private int E(FlexItem flexItem, boolean z11) {
        return z11 ? flexItem.getHeight() : flexItem.getWidth();
    }

    private int F(FlexItem flexItem, boolean z11) {
        return z11 ? flexItem.getWidth() : flexItem.getHeight();
    }

    private int G(boolean z11) {
        return z11 ? this.f22157a.getPaddingBottom() : this.f22157a.getPaddingEnd();
    }

    private int H(boolean z11) {
        return z11 ? this.f22157a.getPaddingEnd() : this.f22157a.getPaddingBottom();
    }

    private int I(boolean z11) {
        return z11 ? this.f22157a.getPaddingTop() : this.f22157a.getPaddingStart();
    }

    private int J(boolean z11) {
        return z11 ? this.f22157a.getPaddingStart() : this.f22157a.getPaddingTop();
    }

    private int K(View view, boolean z11) {
        return z11 ? view.getMeasuredHeight() : view.getMeasuredWidth();
    }

    private int L(View view, boolean z11) {
        return z11 ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    private boolean M(int i11, int i12, com.google.android.flexbox.b bVar) {
        return i11 == i12 - 1 && bVar.c() != 0;
    }

    private boolean O(View view, int i11, int i12, int i13, int i14, FlexItem flexItem, int i15, int i16, int i17) {
        if (this.f22157a.getFlexWrap() == 0) {
            return false;
        }
        if (flexItem.K0()) {
            return true;
        }
        if (i11 == 0) {
            return false;
        }
        int maxLine = this.f22157a.getMaxLine();
        if (maxLine != -1 && maxLine <= i17 + 1) {
            return false;
        }
        int iO = this.f22157a.o(view, i15, i16);
        if (iO > 0) {
            i14 += iO;
        }
        return i12 < i13 + i14;
    }

    private void S(int i11, int i12, com.google.android.flexbox.b bVar, int i13, int i14, boolean z11) {
        float f11;
        float f12;
        int iMax;
        int i15 = bVar.f22145e;
        float f13 = bVar.f22151k;
        float f14 = 0.0f;
        if (f13 <= 0.0f || i13 > i15) {
            return;
        }
        float f15 = (i15 - i13) / f13;
        bVar.f22145e = i14 + bVar.f22146f;
        if (!z11) {
            bVar.f22147g = IntCompanionObject.MIN_VALUE;
        }
        int i16 = 0;
        boolean z12 = false;
        int i17 = 0;
        float f16 = 0.0f;
        while (i16 < bVar.f22148h) {
            int i18 = bVar.f22155o + i16;
            View viewM = this.f22157a.m(i18);
            if (viewM == null || viewM.getVisibility() == 8) {
                f11 = f14;
                f12 = f15;
                z12 = z12;
            } else {
                FlexItem flexItem = (FlexItem) viewM.getLayoutParams();
                int flexDirection = this.f22157a.getFlexDirection();
                f11 = f14;
                if (flexDirection == 0 || flexDirection == 1) {
                    int measuredWidth = viewM.getMeasuredWidth();
                    long[] jArr = this.f22161e;
                    if (jArr != null) {
                        measuredWidth = x(jArr[i18]);
                    }
                    int measuredHeight = viewM.getMeasuredHeight();
                    long[] jArr2 = this.f22161e;
                    f12 = f15;
                    boolean z13 = z12;
                    if (jArr2 != null) {
                        measuredHeight = w(jArr2[i18]);
                    }
                    if (this.f22158b[i18] || flexItem.a0() <= f11) {
                        z12 = z13;
                    } else {
                        float fA0 = measuredWidth - (f12 * flexItem.a0());
                        if (i16 == bVar.f22148h - 1) {
                            fA0 += f16;
                            f16 = f11;
                        }
                        int iRound = Math.round(fA0);
                        if (iRound < flexItem.e0()) {
                            iRound = flexItem.e0();
                            this.f22158b[i18] = true;
                            bVar.f22151k -= flexItem.a0();
                            z12 = true;
                        } else {
                            f16 += fA0 - iRound;
                            double d11 = f16;
                            if (d11 > 1.0d) {
                                iRound++;
                                f16 -= 1.0f;
                            } else if (d11 < -1.0d) {
                                iRound--;
                                f16 += 1.0f;
                            }
                            z12 = z13;
                        }
                        int iY = y(i12, flexItem, bVar.f22153m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewM.measure(iMakeMeasureSpec, iY);
                        int measuredWidth2 = viewM.getMeasuredWidth();
                        int measuredHeight2 = viewM.getMeasuredHeight();
                        Y(i18, iMakeMeasureSpec, iY, viewM);
                        this.f22157a.n(i18, viewM);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i17, measuredHeight + flexItem.v0() + flexItem.v1() + this.f22157a.k(viewM));
                    bVar.f22145e += measuredWidth + flexItem.z1() + flexItem.a2();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewM.getMeasuredHeight();
                    long[] jArr3 = this.f22161e;
                    if (jArr3 != null) {
                        measuredHeight3 = w(jArr3[i18]);
                    }
                    int measuredWidth3 = viewM.getMeasuredWidth();
                    long[] jArr4 = this.f22161e;
                    if (jArr4 != null) {
                        measuredWidth3 = x(jArr4[i18]);
                    }
                    if (!this.f22158b[i18] && flexItem.a0() > f11) {
                        float fA02 = measuredHeight3 - (flexItem.a0() * f15);
                        if (i16 == bVar.f22148h - 1) {
                            fA02 += f16;
                            f16 = f11;
                        }
                        int iRound2 = Math.round(fA02);
                        if (iRound2 < flexItem.d2()) {
                            iRound2 = flexItem.d2();
                            this.f22158b[i18] = true;
                            bVar.f22151k -= flexItem.a0();
                            z12 = true;
                        } else {
                            f16 += fA02 - iRound2;
                            double d12 = f16;
                            if (d12 > 1.0d) {
                                iRound2++;
                                f16 -= 1.0f;
                            } else if (d12 < -1.0d) {
                                iRound2--;
                                f16 += 1.0f;
                            }
                        }
                        int iZ = z(i11, flexItem, bVar.f22153m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewM.measure(iZ, iMakeMeasureSpec2);
                        int measuredWidth4 = viewM.getMeasuredWidth();
                        int measuredHeight4 = viewM.getMeasuredHeight();
                        Y(i18, iZ, iMakeMeasureSpec2, viewM);
                        this.f22157a.n(i18, viewM);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i17, measuredWidth3 + flexItem.z1() + flexItem.a2() + this.f22157a.k(viewM));
                    bVar.f22145e += measuredHeight3 + flexItem.v0() + flexItem.v1();
                    f12 = f15;
                }
                bVar.f22147g = Math.max(bVar.f22147g, iMax);
                i17 = iMax;
            }
            i16++;
            f15 = f12;
            f14 = f11;
        }
        if (!z12 || i15 == bVar.f22145e) {
            return;
        }
        S(i11, i12, bVar, i13, i14, true);
    }

    private int[] T(int i11, List list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i11];
        Iterator it = list.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            C0313c c0313c = (C0313c) it.next();
            int i13 = c0313c.f22164a;
            iArr[i12] = i13;
            sparseIntArray.append(i13, c0313c.f22165b);
            i12++;
        }
        return iArr;
    }

    private void U(View view, int i11, int i12) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i11 - flexItem.z1()) - flexItem.a2()) - this.f22157a.k(view), flexItem.e0()), flexItem.T0());
        long[] jArr = this.f22161e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? w(jArr[i12]) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        Y(i12, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        this.f22157a.n(i12, view);
    }

    private void V(View view, int i11, int i12) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i11 - flexItem.v0()) - flexItem.v1()) - this.f22157a.k(view), flexItem.d2()), flexItem.m2());
        long[] jArr = this.f22161e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? x(jArr[i12]) : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        Y(i12, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        this.f22157a.n(i12, view);
    }

    private void Y(int i11, int i12, int i13, View view) {
        long[] jArr = this.f22160d;
        if (jArr != null) {
            jArr[i11] = R(i12, i13);
        }
        long[] jArr2 = this.f22161e;
        if (jArr2 != null) {
            jArr2[i11] = R(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    private void a(List list, com.google.android.flexbox.b bVar, int i11, int i12) {
        bVar.f22153m = i12;
        this.f22157a.l(bVar);
        bVar.f22156p = i11;
        list.add(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.FlexItem r0 = (com.google.android.flexbox.FlexItem) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.e0()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.e0()
        L19:
            r3 = r4
            goto L27
        L1b:
            int r3 = r0.T0()
            if (r1 <= r3) goto L26
            int r1 = r0.T0()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.d2()
            if (r2 >= r5) goto L32
            int r2 = r0.d2()
            goto L3e
        L32:
            int r5 = r0.m2()
            if (r2 <= r5) goto L3d
            int r2 = r0.m2()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L55
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.Y(r8, r1, r0, r7)
            com.google.android.flexbox.a r6 = r6.f22157a
            r6.n(r8, r7)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.c.i(android.view.View, int):void");
    }

    private List k(List list, int i11, int i12) {
        int i13 = (i11 - i12) / 2;
        ArrayList arrayList = new ArrayList();
        com.google.android.flexbox.b bVar = new com.google.android.flexbox.b();
        bVar.f22147g = i13;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (i14 == 0) {
                arrayList.add(bVar);
            }
            arrayList.add((com.google.android.flexbox.b) list.get(i14));
            if (i14 == list.size() - 1) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    private List l(int i11) {
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            FlexItem flexItem = (FlexItem) this.f22157a.h(i12).getLayoutParams();
            C0313c c0313c = new C0313c();
            c0313c.f22165b = flexItem.getOrder();
            c0313c.f22164a = i12;
            arrayList.add(c0313c);
        }
        return arrayList;
    }

    private void r(int i11) {
        boolean[] zArr = this.f22158b;
        if (zArr == null) {
            if (i11 < 10) {
                i11 = 10;
            }
            this.f22158b = new boolean[i11];
        } else {
            if (zArr.length >= i11) {
                Arrays.fill(zArr, false);
                return;
            }
            int length = zArr.length * 2;
            if (length >= i11) {
                i11 = length;
            }
            this.f22158b = new boolean[i11];
        }
    }

    private void v(int i11, int i12, com.google.android.flexbox.b bVar, int i13, int i14, boolean z11) {
        int i15;
        float f11;
        float f12;
        boolean z12;
        int i16;
        int iMax;
        double d11;
        double d12;
        float f13 = bVar.f22150j;
        float f14 = 0.0f;
        if (f13 <= 0.0f || i13 < (i15 = bVar.f22145e)) {
            return;
        }
        float f15 = (i13 - i15) / f13;
        bVar.f22145e = i14 + bVar.f22146f;
        if (!z11) {
            bVar.f22147g = IntCompanionObject.MIN_VALUE;
        }
        int i17 = 0;
        boolean z13 = false;
        int i18 = 0;
        float f16 = 0.0f;
        while (i17 < bVar.f22148h) {
            int i19 = bVar.f22155o + i17;
            View viewM = this.f22157a.m(i19);
            if (viewM == null || viewM.getVisibility() == 8) {
                f11 = f14;
                f12 = f15;
                z12 = z13;
                i16 = i17;
            } else {
                FlexItem flexItem = (FlexItem) viewM.getLayoutParams();
                int flexDirection = this.f22157a.getFlexDirection();
                f11 = f14;
                if (flexDirection == 0 || flexDirection == 1) {
                    int measuredWidth = viewM.getMeasuredWidth();
                    long[] jArr = this.f22161e;
                    f12 = f15;
                    z12 = z13;
                    if (jArr != null) {
                        measuredWidth = x(jArr[i19]);
                    }
                    int measuredHeight = viewM.getMeasuredHeight();
                    long[] jArr2 = this.f22161e;
                    if (jArr2 != null) {
                        measuredHeight = w(jArr2[i19]);
                    }
                    if (this.f22158b[i19] || flexItem.C0() <= f11) {
                        i16 = i17;
                    } else {
                        float fC0 = measuredWidth + (flexItem.C0() * f12);
                        if (i17 == bVar.f22148h - 1) {
                            fC0 += f16;
                            f16 = f11;
                        }
                        int iRound = Math.round(fC0);
                        if (iRound > flexItem.T0()) {
                            iRound = flexItem.T0();
                            this.f22158b[i19] = true;
                            bVar.f22150j -= flexItem.C0();
                            z12 = true;
                            i16 = i17;
                        } else {
                            f16 += fC0 - iRound;
                            i16 = i17;
                            double d13 = f16;
                            if (d13 > 1.0d) {
                                iRound++;
                                d11 = d13 - 1.0d;
                            } else if (d13 < -1.0d) {
                                iRound--;
                                d11 = d13 + 1.0d;
                            }
                            f16 = (float) d11;
                        }
                        int iY = y(i12, flexItem, bVar.f22153m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewM.measure(iMakeMeasureSpec, iY);
                        int measuredWidth2 = viewM.getMeasuredWidth();
                        int measuredHeight2 = viewM.getMeasuredHeight();
                        Y(i19, iMakeMeasureSpec, iY, viewM);
                        this.f22157a.n(i19, viewM);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i18, measuredHeight + flexItem.v0() + flexItem.v1() + this.f22157a.k(viewM));
                    bVar.f22145e += measuredWidth + flexItem.z1() + flexItem.a2();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewM.getMeasuredHeight();
                    long[] jArr3 = this.f22161e;
                    if (jArr3 != null) {
                        measuredHeight3 = w(jArr3[i19]);
                    }
                    int measuredWidth3 = viewM.getMeasuredWidth();
                    long[] jArr4 = this.f22161e;
                    if (jArr4 != null) {
                        measuredWidth3 = x(jArr4[i19]);
                    }
                    if (!this.f22158b[i19] && flexItem.C0() > f11) {
                        float fC02 = measuredHeight3 + (flexItem.C0() * f15);
                        if (i17 == bVar.f22148h - 1) {
                            fC02 += f16;
                            f16 = f11;
                        }
                        int iRound2 = Math.round(fC02);
                        if (iRound2 > flexItem.m2()) {
                            iRound2 = flexItem.m2();
                            this.f22158b[i19] = true;
                            bVar.f22150j -= flexItem.C0();
                            z13 = true;
                        } else {
                            f16 += fC02 - iRound2;
                            double d14 = f16;
                            if (d14 > 1.0d) {
                                iRound2++;
                                d12 = d14 - 1.0d;
                            } else if (d14 < -1.0d) {
                                iRound2--;
                                d12 = d14 + 1.0d;
                            }
                            f16 = (float) d12;
                        }
                        int iZ = z(i11, flexItem, bVar.f22153m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewM.measure(iZ, iMakeMeasureSpec2);
                        int measuredWidth4 = viewM.getMeasuredWidth();
                        int measuredHeight4 = viewM.getMeasuredHeight();
                        Y(i19, iZ, iMakeMeasureSpec2, viewM);
                        this.f22157a.n(i19, viewM);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i18, measuredWidth3 + flexItem.z1() + flexItem.a2() + this.f22157a.k(viewM));
                    bVar.f22145e += measuredHeight3 + flexItem.v0() + flexItem.v1();
                    f12 = f15;
                    z12 = z13;
                    i16 = i17;
                }
                bVar.f22147g = Math.max(bVar.f22147g, iMax);
                i18 = iMax;
            }
            i17 = i16 + 1;
            f15 = f12;
            z13 = z12;
            f14 = f11;
        }
        if (!z13 || i15 == bVar.f22145e) {
            return;
        }
        v(i11, i12, bVar, i13, i14, true);
    }

    private int y(int i11, FlexItem flexItem, int i12) {
        com.google.android.flexbox.a aVar = this.f22157a;
        int iJ = aVar.j(i11, aVar.getPaddingTop() + this.f22157a.getPaddingBottom() + flexItem.v0() + flexItem.v1() + i12, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(iJ);
        return size > flexItem.m2() ? View.MeasureSpec.makeMeasureSpec(flexItem.m2(), View.MeasureSpec.getMode(iJ)) : size < flexItem.d2() ? View.MeasureSpec.makeMeasureSpec(flexItem.d2(), View.MeasureSpec.getMode(iJ)) : iJ;
    }

    private int z(int i11, FlexItem flexItem, int i12) {
        com.google.android.flexbox.a aVar = this.f22157a;
        int iG = aVar.g(i11, aVar.getPaddingLeft() + this.f22157a.getPaddingRight() + flexItem.z1() + flexItem.a2() + i12, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(iG);
        return size > flexItem.T0() ? View.MeasureSpec.makeMeasureSpec(flexItem.T0(), View.MeasureSpec.getMode(iG)) : size < flexItem.e0() ? View.MeasureSpec.makeMeasureSpec(flexItem.e0(), View.MeasureSpec.getMode(iG)) : iG;
    }

    boolean N(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f22157a.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i11 = 0; i11 < flexItemCount; i11++) {
            View viewH = this.f22157a.h(i11);
            if (viewH != null && ((FlexItem) viewH.getLayoutParams()).getOrder() != sparseIntArray.get(i11)) {
                return true;
            }
        }
        return false;
    }

    void P(View view, com.google.android.flexbox.b bVar, int i11, int i12, int i13, int i14) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f22157a.getAlignItems();
        if (flexItem.Y() != -1) {
            alignItems = flexItem.Y();
        }
        int i15 = bVar.f22147g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.f22157a.getFlexWrap() == 2) {
                    view.layout(i11, (i12 - i15) + view.getMeasuredHeight() + flexItem.v0(), i13, (i14 - i15) + view.getMeasuredHeight() + flexItem.v0());
                    return;
                } else {
                    int i16 = i12 + i15;
                    view.layout(i11, (i16 - view.getMeasuredHeight()) - flexItem.v1(), i13, i16 - flexItem.v1());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i15 - view.getMeasuredHeight()) + flexItem.v0()) - flexItem.v1()) / 2;
                if (this.f22157a.getFlexWrap() != 2) {
                    int i17 = i12 + measuredHeight;
                    view.layout(i11, i17, i13, view.getMeasuredHeight() + i17);
                    return;
                } else {
                    int i18 = i12 - measuredHeight;
                    view.layout(i11, i18, i13, view.getMeasuredHeight() + i18);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.f22157a.getFlexWrap() != 2) {
                    int iMax = Math.max(bVar.f22152l - view.getBaseline(), flexItem.v0());
                    view.layout(i11, i12 + iMax, i13, i14 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max((bVar.f22152l - view.getMeasuredHeight()) + view.getBaseline(), flexItem.v1());
                    view.layout(i11, i12 - iMax2, i13, i14 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.f22157a.getFlexWrap() != 2) {
            view.layout(i11, i12 + flexItem.v0(), i13, i14 + flexItem.v0());
        } else {
            view.layout(i11, i12 - flexItem.v1(), i13, i14 - flexItem.v1());
        }
    }

    void Q(View view, com.google.android.flexbox.b bVar, boolean z11, int i11, int i12, int i13, int i14) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f22157a.getAlignItems();
        if (flexItem.Y() != -1) {
            alignItems = flexItem.Y();
        }
        int i15 = bVar.f22147g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (z11) {
                    view.layout((i11 - i15) + view.getMeasuredWidth() + flexItem.z1(), i12, (i13 - i15) + view.getMeasuredWidth() + flexItem.z1(), i14);
                    return;
                } else {
                    view.layout(((i11 + i15) - view.getMeasuredWidth()) - flexItem.a2(), i12, ((i13 + i15) - view.getMeasuredWidth()) - flexItem.a2(), i14);
                    return;
                }
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i15 - view.getMeasuredWidth()) + o.b(marginLayoutParams)) - o.a(marginLayoutParams)) / 2;
                if (z11) {
                    view.layout(i11 - measuredWidth, i12, i13 - measuredWidth, i14);
                    return;
                } else {
                    view.layout(i11 + measuredWidth, i12, i13 + measuredWidth, i14);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z11) {
            view.layout(i11 - flexItem.a2(), i12, i13 - flexItem.a2(), i14);
        } else {
            view.layout(i11 + flexItem.z1(), i12, i13 + flexItem.z1(), i14);
        }
    }

    long R(int i11, int i12) {
        return (((long) i11) & 4294967295L) | (((long) i12) << 32);
    }

    void W() {
        X(0);
    }

    void X(int i11) {
        View viewM;
        if (i11 >= this.f22157a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f22157a.getFlexDirection();
        if (this.f22157a.getAlignItems() != 4) {
            for (com.google.android.flexbox.b bVar : this.f22157a.getFlexLinesInternal()) {
                for (Integer num : bVar.f22154n) {
                    View viewM2 = this.f22157a.m(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        V(viewM2, bVar.f22147g, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                        }
                        U(viewM2, bVar.f22147g, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.f22159c;
        List flexLinesInternal = this.f22157a.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i12 = iArr != null ? iArr[i11] : 0; i12 < size; i12++) {
            com.google.android.flexbox.b bVar2 = (com.google.android.flexbox.b) flexLinesInternal.get(i12);
            int i13 = bVar2.f22148h;
            for (int i14 = 0; i14 < i13; i14++) {
                int i15 = bVar2.f22155o + i14;
                if (i14 < this.f22157a.getFlexItemCount() && (viewM = this.f22157a.m(i15)) != null && viewM.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) viewM.getLayoutParams();
                    if (flexItem.Y() == -1 || flexItem.Y() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            V(viewM, bVar2.f22147g, i15);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                            }
                            U(viewM, bVar2.f22147g, i15);
                        }
                    }
                }
            }
        }
    }

    void b(b bVar, int i11, int i12, int i13, int i14, int i15, List list) {
        int i16;
        b bVar2;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int iG;
        int i23;
        int i24;
        int i25;
        com.google.android.flexbox.b bVar3;
        int i26;
        int i27;
        boolean z11;
        int i28;
        boolean z12;
        int i29;
        int i31 = i11;
        boolean zP = this.f22157a.p();
        int mode = View.MeasureSpec.getMode(i31);
        int size = View.MeasureSpec.getSize(i31);
        List arrayList = list == null ? new ArrayList() : list;
        bVar.f22162a = arrayList;
        boolean z13 = i15 == -1;
        int iJ = J(zP);
        int iH = H(zP);
        int I = I(zP);
        int iG2 = G(zP);
        com.google.android.flexbox.b bVar4 = new com.google.android.flexbox.b();
        int i32 = i14;
        bVar4.f22155o = i32;
        int i33 = iJ + iH;
        bVar4.f22145e = i33;
        int flexItemCount = this.f22157a.getFlexItemCount();
        boolean z14 = z13;
        com.google.android.flexbox.b bVar5 = bVar4;
        int i34 = Integer.MIN_VALUE;
        int i35 = 0;
        int iCombineMeasuredStates = 0;
        int i36 = 0;
        while (true) {
            if (i32 >= flexItemCount) {
                i16 = iCombineMeasuredStates;
                bVar2 = bVar;
                break;
            }
            View viewM = this.f22157a.m(i32);
            if (viewM == null) {
                if (M(i32, flexItemCount, bVar5)) {
                    a(arrayList, bVar5, i32, i35);
                }
                i17 = i33;
            } else {
                i17 = i33;
                if (viewM.getVisibility() == 8) {
                    bVar5.f22149i++;
                    bVar5.f22148h++;
                    if (M(i32, flexItemCount, bVar5)) {
                        a(arrayList, bVar5, i32, i35);
                    }
                } else {
                    FlexItem flexItem = (FlexItem) viewM.getLayoutParams();
                    int i37 = flexItemCount;
                    if (flexItem.Y() == 4) {
                        bVar5.f22154n.add(Integer.valueOf(i32));
                    }
                    int iF = F(flexItem, zP);
                    if (flexItem.G0() != -1.0f && mode == 1073741824) {
                        iF = Math.round(size * flexItem.G0());
                    }
                    if (zP) {
                        i19 = mode;
                        iG = this.f22157a.g(i31, i17 + D(flexItem, true) + B(flexItem, true), iF);
                        i18 = size;
                        i21 = i35;
                        int iJ2 = this.f22157a.j(i12, I + iG2 + C(flexItem, true) + A(flexItem, true) + i35, E(flexItem, true));
                        viewM.measure(iG, iJ2);
                        Y(i32, iG, iJ2, viewM);
                        i22 = 0;
                    } else {
                        i18 = size;
                        i19 = mode;
                        i21 = i35;
                        i22 = 0;
                        int iG3 = this.f22157a.g(i12, I + iG2 + C(flexItem, false) + A(flexItem, false) + i21, E(flexItem, false));
                        int iJ3 = this.f22157a.j(i31, i17 + D(flexItem, false) + B(flexItem, false), iF);
                        viewM.measure(iG3, iJ3);
                        Y(i32, iG3, iJ3, viewM);
                        iG = iJ3;
                    }
                    this.f22157a.n(i32, viewM);
                    i(viewM, i32);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewM.getMeasuredState());
                    int i38 = i22;
                    i23 = i32;
                    int i39 = iG;
                    com.google.android.flexbox.b bVar6 = bVar5;
                    int i41 = i36;
                    i24 = i17;
                    i25 = i21;
                    boolean z15 = zP;
                    size = i18;
                    if (O(viewM, i19, size, bVar5.f22145e, L(viewM, zP) + D(flexItem, zP) + B(flexItem, zP), flexItem, i23, i41, arrayList.size())) {
                        if (bVar6.c() > 0) {
                            a(arrayList, bVar6, i23 > 0 ? i23 - 1 : i38, i25);
                            i29 = i25 + bVar6.f22147g;
                        } else {
                            i29 = i25;
                        }
                        if (z15) {
                            if (flexItem.getHeight() == -1) {
                                com.google.android.flexbox.a aVar = this.f22157a;
                                viewM.measure(i39, aVar.j(i12, aVar.getPaddingTop() + this.f22157a.getPaddingBottom() + flexItem.v0() + flexItem.v1() + i29, flexItem.getHeight()));
                                i(viewM, i23);
                            }
                        } else if (flexItem.getWidth() == -1) {
                            com.google.android.flexbox.a aVar2 = this.f22157a;
                            viewM.measure(aVar2.g(i12, aVar2.getPaddingLeft() + this.f22157a.getPaddingRight() + flexItem.z1() + flexItem.a2() + i29, flexItem.getWidth()), i39);
                            i(viewM, i23);
                        }
                        com.google.android.flexbox.b bVar7 = new com.google.android.flexbox.b();
                        bVar7.f22148h = 1;
                        bVar7.f22145e = i24;
                        bVar7.f22155o = i23;
                        i25 = i29;
                        i26 = i38;
                        bVar3 = bVar7;
                        i27 = Integer.MIN_VALUE;
                    } else {
                        bVar3 = bVar6;
                        bVar3.f22148h++;
                        i26 = i41 + 1;
                        i27 = i34;
                    }
                    int[] iArr = this.f22159c;
                    if (iArr != null) {
                        iArr[i23] = arrayList.size();
                    }
                    z11 = z15;
                    bVar3.f22145e += L(viewM, z11) + D(flexItem, z11) + B(flexItem, z11);
                    bVar3.f22150j += flexItem.C0();
                    bVar3.f22151k += flexItem.a0();
                    this.f22157a.f(viewM, i23, i26, bVar3);
                    int iMax = Math.max(i27, K(viewM, z11) + C(flexItem, z11) + A(flexItem, z11) + this.f22157a.k(viewM));
                    bVar3.f22147g = Math.max(bVar3.f22147g, iMax);
                    if (z11) {
                        if (this.f22157a.getFlexWrap() != 2) {
                            bVar3.f22152l = Math.max(bVar3.f22152l, viewM.getBaseline() + flexItem.v0());
                        } else {
                            bVar3.f22152l = Math.max(bVar3.f22152l, (viewM.getMeasuredHeight() - viewM.getBaseline()) + flexItem.v1());
                        }
                    }
                    i28 = i37;
                    if (M(i23, i28, bVar3)) {
                        a(arrayList, bVar3, i23, i25);
                        i25 += bVar3.f22147g;
                    }
                    if (i15 != -1 && arrayList.size() > 0) {
                        if (((com.google.android.flexbox.b) arrayList.get(arrayList.size() - 1)).f22156p >= i15 && i23 >= i15 && !z14) {
                            i25 = -bVar3.a();
                            z12 = true;
                        }
                        if (i25 <= i13 && z12) {
                            bVar2 = bVar;
                            i16 = iCombineMeasuredStates;
                            break;
                        }
                        i34 = iMax;
                        z14 = z12;
                        i36 = i26;
                        int i42 = i23 + 1;
                        zP = z11;
                        bVar5 = bVar3;
                        i33 = i24;
                        i35 = i25;
                        i31 = i11;
                        flexItemCount = i28;
                        i32 = i42;
                        mode = i19;
                    }
                    z12 = z14;
                    if (i25 <= i13) {
                    }
                    i34 = iMax;
                    z14 = z12;
                    i36 = i26;
                    int i422 = i23 + 1;
                    zP = z11;
                    bVar5 = bVar3;
                    i33 = i24;
                    i35 = i25;
                    i31 = i11;
                    flexItemCount = i28;
                    i32 = i422;
                    mode = i19;
                }
            }
            i23 = i32;
            i19 = mode;
            i28 = flexItemCount;
            i25 = i35;
            z11 = zP;
            i24 = i17;
            bVar3 = bVar5;
            int i4222 = i23 + 1;
            zP = z11;
            bVar5 = bVar3;
            i33 = i24;
            i35 = i25;
            i31 = i11;
            flexItemCount = i28;
            i32 = i4222;
            mode = i19;
        }
        bVar2.f22163b = i16;
    }

    void c(b bVar, int i11, int i12) {
        b(bVar, i11, i12, Integer.MAX_VALUE, 0, -1, null);
    }

    void d(b bVar, int i11, int i12, int i13, int i14, List list) {
        b(bVar, i11, i12, i13, i14, -1, list);
    }

    void e(b bVar, int i11, int i12, int i13, int i14, List list) {
        b(bVar, i11, i12, i13, 0, i14, list);
    }

    void f(b bVar, int i11, int i12) {
        b(bVar, i12, i11, Integer.MAX_VALUE, 0, -1, null);
    }

    void g(b bVar, int i11, int i12, int i13, int i14, List list) {
        b(bVar, i12, i11, i13, i14, -1, list);
    }

    void h(b bVar, int i11, int i12, int i13, int i14, List list) {
        b(bVar, i12, i11, i13, 0, i14, list);
    }

    void j(List list, int i11) {
        int i12 = this.f22159c[i11];
        if (i12 == -1) {
            i12 = 0;
        }
        for (int size = list.size() - 1; size >= i12; size--) {
            list.remove(size);
        }
        int[] iArr = this.f22159c;
        int length = iArr.length - 1;
        if (i11 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i11, length, -1);
        }
        long[] jArr = this.f22160d;
        int length2 = jArr.length - 1;
        if (i11 > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i11, length2, 0L);
        }
    }

    int[] m(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f22157a.getFlexItemCount();
        return T(flexItemCount, l(flexItemCount), sparseIntArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    int[] n(View view, int i11, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.f22157a.getFlexItemCount();
        List listL = l(flexItemCount);
        C0313c c0313c = new C0313c();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            c0313c.f22165b = 1;
        } else {
            c0313c.f22165b = ((FlexItem) layoutParams).getOrder();
        }
        if (i11 == -1 || i11 == flexItemCount || i11 >= this.f22157a.getFlexItemCount()) {
            c0313c.f22164a = flexItemCount;
        } else {
            c0313c.f22164a = i11;
            while (i11 < flexItemCount) {
                ((C0313c) listL.get(i11)).f22164a++;
                i11++;
            }
        }
        listL.add(c0313c);
        return T(flexItemCount + 1, listL, sparseIntArray);
    }

    void o(int i11, int i12, int i13) {
        int mode;
        int size;
        int flexDirection = this.f22157a.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i12);
            int size2 = View.MeasureSpec.getSize(i12);
            mode = mode2;
            size = size2;
        } else {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            mode = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
        }
        List<com.google.android.flexbox.b> flexLinesInternal = this.f22157a.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.f22157a.getSumOfCrossSize() + i13;
            int i14 = 0;
            if (flexLinesInternal.size() == 1) {
                ((com.google.android.flexbox.b) flexLinesInternal.get(0)).f22147g = size - i13;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.f22157a.getAlignContent();
                if (alignContent == 1) {
                    com.google.android.flexbox.b bVar = new com.google.android.flexbox.b();
                    bVar.f22147g = size - sumOfCrossSize;
                    flexLinesInternal.add(0, bVar);
                    return;
                }
                if (alignContent == 2) {
                    this.f22157a.setFlexLines(k(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size4 = flexLinesInternal.size();
                    float f11 = 0.0f;
                    while (i14 < size4) {
                        arrayList.add((com.google.android.flexbox.b) flexLinesInternal.get(i14));
                        if (i14 != flexLinesInternal.size() - 1) {
                            com.google.android.flexbox.b bVar2 = new com.google.android.flexbox.b();
                            if (i14 == flexLinesInternal.size() - 2) {
                                bVar2.f22147g = Math.round(f11 + size3);
                                f11 = 0.0f;
                            } else {
                                bVar2.f22147g = Math.round(size3);
                            }
                            int i15 = bVar2.f22147g;
                            f11 += size3 - i15;
                            if (f11 > 1.0f) {
                                bVar2.f22147g = i15 + 1;
                                f11 -= 1.0f;
                            } else if (f11 < -1.0f) {
                                bVar2.f22147g = i15 - 1;
                                f11 += 1.0f;
                            }
                            arrayList.add(bVar2);
                        }
                        i14++;
                    }
                    this.f22157a.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.f22157a.setFlexLines(k(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    com.google.android.flexbox.b bVar3 = new com.google.android.flexbox.b();
                    bVar3.f22147g = size5;
                    for (com.google.android.flexbox.b bVar4 : flexLinesInternal) {
                        arrayList2.add(bVar3);
                        arrayList2.add(bVar4);
                        arrayList2.add(bVar3);
                    }
                    this.f22157a.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f12 = 0.0f;
                    while (i14 < size7) {
                        com.google.android.flexbox.b bVar5 = (com.google.android.flexbox.b) flexLinesInternal.get(i14);
                        float f13 = bVar5.f22147g + size6;
                        if (i14 == flexLinesInternal.size() - 1) {
                            f13 += f12;
                            f12 = 0.0f;
                        }
                        int iRound = Math.round(f13);
                        f12 += f13 - iRound;
                        if (f12 > 1.0f) {
                            iRound++;
                            f12 -= 1.0f;
                        } else if (f12 < -1.0f) {
                            iRound--;
                            f12 += 1.0f;
                        }
                        bVar5.f22147g = iRound;
                        i14++;
                    }
                }
            }
        }
    }

    void p(int i11, int i12) {
        q(i11, i12, 0);
    }

    void q(int i11, int i12, int i13) {
        int size;
        int paddingLeft;
        int paddingRight;
        c cVar;
        int i14;
        int i15;
        r(this.f22157a.getFlexItemCount());
        if (i13 >= this.f22157a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f22157a.getFlexDirection();
        int flexDirection2 = this.f22157a.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
            if (mode != 1073741824) {
                size = this.f22157a.getLargestMainSize();
            }
            paddingLeft = this.f22157a.getPaddingLeft();
            paddingRight = this.f22157a.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            int mode2 = View.MeasureSpec.getMode(i12);
            size = View.MeasureSpec.getSize(i12);
            if (mode2 != 1073741824) {
                size = this.f22157a.getLargestMainSize();
            }
            paddingLeft = this.f22157a.getPaddingTop();
            paddingRight = this.f22157a.getPaddingBottom();
        }
        int i16 = paddingLeft + paddingRight;
        int i17 = size;
        int[] iArr = this.f22159c;
        int i18 = iArr != null ? iArr[i13] : 0;
        List flexLinesInternal = this.f22157a.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i18 < size2) {
            com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) flexLinesInternal.get(i18);
            if (bVar.f22145e < i17) {
                cVar = this;
                i14 = i11;
                i15 = i12;
                cVar.v(i14, i15, bVar, i17, i16, false);
            } else {
                cVar = this;
                i14 = i11;
                i15 = i12;
                cVar.S(i14, i15, bVar, i17, i16, false);
            }
            i18++;
            this = cVar;
            i11 = i14;
            i12 = i15;
        }
    }

    void s(int i11) {
        int[] iArr = this.f22159c;
        if (iArr == null) {
            if (i11 < 10) {
                i11 = 10;
            }
            this.f22159c = new int[i11];
        } else if (iArr.length < i11) {
            int length = iArr.length * 2;
            if (length >= i11) {
                i11 = length;
            }
            this.f22159c = Arrays.copyOf(iArr, i11);
        }
    }

    void t(int i11) {
        long[] jArr = this.f22160d;
        if (jArr == null) {
            if (i11 < 10) {
                i11 = 10;
            }
            this.f22160d = new long[i11];
        } else if (jArr.length < i11) {
            int length = jArr.length * 2;
            if (length >= i11) {
                i11 = length;
            }
            this.f22160d = Arrays.copyOf(jArr, i11);
        }
    }

    void u(int i11) {
        long[] jArr = this.f22161e;
        if (jArr == null) {
            if (i11 < 10) {
                i11 = 10;
            }
            this.f22161e = new long[i11];
        } else if (jArr.length < i11) {
            int length = jArr.length * 2;
            if (length >= i11) {
                i11 = length;
            }
            this.f22161e = Arrays.copyOf(jArr, i11);
        }
    }

    int w(long j11) {
        return (int) (j11 >> 32);
    }

    int x(long j11) {
        return (int) j11;
    }
}
