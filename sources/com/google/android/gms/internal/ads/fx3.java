package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class fx3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ex3 f26738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ex3 f26739c;

    /* synthetic */ fx3(String str, byte[] bArr) {
        ex3 ex3Var = new ex3();
        this.f26738b = ex3Var;
        this.f26739c = ex3Var;
        str.getClass();
        this.f26737a = str;
    }

    public final fx3 a(Object obj) {
        ex3 ex3Var = new ex3();
        this.f26739c.f25960b = ex3Var;
        this.f26739c = ex3Var;
        ex3Var.f25959a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f26737a);
        sb2.append('{');
        ex3 ex3Var = this.f26738b.f25960b;
        String str = "";
        while (ex3Var != null) {
            Object obj = ex3Var.f25959a;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r1.length() - 1);
            }
            ex3Var = ex3Var.f25960b;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}
