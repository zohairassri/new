package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class fa3 extends ec3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f26153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f26154d;

    public fa3(int i11, long j11) {
        super(i11, null);
        this.f26152b = j11;
        this.f26153c = new ArrayList();
        this.f26154d = new ArrayList();
    }

    public final void b(eb3 eb3Var) {
        this.f26153c.add(eb3Var);
    }

    public final void c(fa3 fa3Var) {
        this.f26154d.add(fa3Var);
    }

    public final eb3 d(int i11) {
        List list = this.f26153c;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            eb3 eb3Var = (eb3) list.get(i12);
            if (eb3Var.f25697a == i11) {
                return eb3Var;
            }
        }
        return null;
    }

    public final fa3 e(int i11) {
        List list = this.f26154d;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            fa3 fa3Var = (fa3) list.get(i12);
            if (fa3Var.f25697a == i11) {
                return fa3Var;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ec3
    public final String toString() {
        List list = this.f26153c;
        String strA = ec3.a(this.f25697a);
        String string = Arrays.toString(list.toArray());
        String string2 = Arrays.toString(this.f26154d.toArray());
        int length = strA.length();
        StringBuilder sb2 = new StringBuilder(length + 9 + String.valueOf(string).length() + 13 + String.valueOf(string2).length());
        sb2.append(strA);
        sb2.append(" leaves: ");
        sb2.append(string);
        sb2.append(" containers: ");
        sb2.append(string2);
        return sb2.toString();
    }
}
