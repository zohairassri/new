package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ub4 extends f94 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tb4 f35982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f35983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sb4 f35984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f94 f35985d;

    /* synthetic */ ub4(tb4 tb4Var, String str, sb4 sb4Var, f94 f94Var, byte[] bArr) {
        this.f35982a = tb4Var;
        this.f35983b = str;
        this.f35984c = sb4Var;
        this.f35985d = f94Var;
    }

    @Override // com.google.android.gms.internal.ads.n84
    public final boolean a() {
        return this.f35982a != tb4.f35397c;
    }

    public final String b() {
        return this.f35983b;
    }

    public final tb4 c() {
        return this.f35982a;
    }

    public final f94 d() {
        return this.f35985d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ub4)) {
            return false;
        }
        ub4 ub4Var = (ub4) obj;
        return ub4Var.f35984c.equals(this.f35984c) && ub4Var.f35985d.equals(this.f35985d) && ub4Var.f35983b.equals(this.f35983b) && ub4Var.f35982a.equals(this.f35982a);
    }

    public final int hashCode() {
        return Objects.hash(ub4.class, this.f35983b, this.f35984c, this.f35985d, this.f35982a);
    }

    public final String toString() {
        tb4 tb4Var = this.f35982a;
        f94 f94Var = this.f35985d;
        String strValueOf = String.valueOf(this.f35984c);
        String strValueOf2 = String.valueOf(f94Var);
        String strValueOf3 = String.valueOf(tb4Var);
        String str = this.f35983b;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        StringBuilder sb2 = new StringBuilder(length + 64 + length2 + 27 + strValueOf2.length() + 11 + strValueOf3.length() + 1);
        sb2.append("LegacyKmsEnvelopeAead Parameters (kekUri: ");
        sb2.append(str);
        sb2.append(", dekParsingStrategy: ");
        sb2.append(strValueOf);
        sb2.append(", dekParametersForNewKeys: ");
        sb2.append(strValueOf2);
        sb2.append(", variant: ");
        sb2.append(strValueOf3);
        sb2.append(")");
        return sb2.toString();
    }
}
