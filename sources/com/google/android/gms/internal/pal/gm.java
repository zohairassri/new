package com.google.android.gms.internal.pal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class gm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final df f41371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nf f41373c;

    /* synthetic */ gm(df dfVar, int i11, nf nfVar, fm fmVar) {
        this.f41371a = dfVar;
        this.f41372b = i11;
        this.f41373c = nfVar;
    }

    public final int a() {
        return this.f41372b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gm)) {
            return false;
        }
        gm gmVar = (gm) obj;
        return this.f41371a == gmVar.f41371a && this.f41372b == gmVar.f41372b && this.f41373c.equals(gmVar.f41373c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f41371a, Integer.valueOf(this.f41372b), Integer.valueOf(this.f41373c.hashCode())});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, parameters='%s')", this.f41371a, Integer.valueOf(this.f41372b), this.f41373c);
    }
}
