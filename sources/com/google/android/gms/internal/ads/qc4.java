package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class qc4 extends f94 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pc4 f33572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33573b;

    private qc4(pc4 pc4Var, int i11) {
        this.f33572a = pc4Var;
        this.f33573b = i11;
    }

    public static qc4 b(pc4 pc4Var, int i11) throws GeneralSecurityException {
        if (i11 < 8 || i11 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new qc4(pc4Var, i11);
    }

    @Override // com.google.android.gms.internal.ads.n84
    public final boolean a() {
        return this.f33572a != pc4.f32863c;
    }

    public final pc4 c() {
        return this.f33572a;
    }

    public final int d() {
        return this.f33573b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qc4)) {
            return false;
        }
        qc4 qc4Var = (qc4) obj;
        return qc4Var.f33572a == this.f33572a && qc4Var.f33573b == this.f33573b;
    }

    public final int hashCode() {
        return Objects.hash(qc4.class, this.f33572a, Integer.valueOf(this.f33573b));
    }

    public final String toString() {
        String string = this.f33572a.toString();
        int length = string.length();
        int i11 = this.f33573b;
        StringBuilder sb2 = new StringBuilder(length + 48 + String.valueOf(i11).length() + 1);
        sb2.append("X-AES-GCM Parameters (variant: ");
        sb2.append(string);
        sb2.append("salt_size_bytes: ");
        sb2.append(i11);
        sb2.append(")");
        return sb2.toString();
    }
}
