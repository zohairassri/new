package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class l0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Comparator f29939g = k0.f29319a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Comparator f29940h = j0.f28812a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f29945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f29946f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i0[] f29942b = new i0[5];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f29941a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29943c = -1;

    public l0(int i11) {
    }

    public final void a() {
        this.f29941a.clear();
        this.f29943c = -1;
        this.f29944d = 0;
        this.f29945e = 0;
    }

    public final void b(int i11, float f11) {
        i0 i0Var;
        if (this.f29943c != 1) {
            Collections.sort(this.f29941a, f29939g);
            this.f29943c = 1;
        }
        int i12 = this.f29946f;
        if (i12 > 0) {
            i0[] i0VarArr = this.f29942b;
            int i13 = i12 - 1;
            this.f29946f = i13;
            i0Var = i0VarArr[i13];
        } else {
            i0Var = new i0(null);
        }
        int i14 = this.f29944d;
        this.f29944d = i14 + 1;
        i0Var.f28112a = i14;
        i0Var.f28113b = i11;
        i0Var.f28114c = f11;
        ArrayList arrayList = this.f29941a;
        arrayList.add(i0Var);
        this.f29945e += i11;
        while (true) {
            int i15 = this.f29945e;
            if (i15 <= 2000) {
                return;
            }
            int i16 = i15 - 2000;
            i0 i0Var2 = (i0) arrayList.get(0);
            int i17 = i0Var2.f28113b;
            if (i17 <= i16) {
                this.f29945e -= i17;
                arrayList.remove(0);
                int i18 = this.f29946f;
                if (i18 < 5) {
                    i0[] i0VarArr2 = this.f29942b;
                    this.f29946f = i18 + 1;
                    i0VarArr2[i18] = i0Var2;
                }
            } else {
                i0Var2.f28113b = i17 - i16;
                this.f29945e -= i16;
            }
        }
    }

    public final float c(float f11) {
        int i11 = 0;
        if (this.f29943c != 0) {
            Collections.sort(this.f29941a, f29940h);
            this.f29943c = 0;
        }
        float f12 = this.f29945e;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f29941a;
            if (i11 >= arrayList.size()) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((i0) arrayList.get(arrayList.size() - 1)).f28114c;
            }
            float f13 = 0.5f * f12;
            i0 i0Var = (i0) arrayList.get(i11);
            i12 += i0Var.f28113b;
            if (i12 >= f13) {
                return i0Var.f28114c;
            }
            i11++;
        }
    }
}
