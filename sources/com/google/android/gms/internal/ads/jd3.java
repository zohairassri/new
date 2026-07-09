package com.google.android.gms.internal.ads;

import com.amazonaws.services.s3.internal.Constants;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class jd3 extends pd3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f29021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f29022d;

    /* synthetic */ jd3(String str, boolean z11, int i11, hd3 hd3Var, int i12, byte[] bArr) {
        this.f29020b = str;
        this.f29021c = i11;
        this.f29022d = i12;
    }

    @Override // com.google.android.gms.internal.ads.pd3
    public final String a() {
        return this.f29020b;
    }

    @Override // com.google.android.gms.internal.ads.pd3
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.pd3
    public final hd3 c() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.pd3
    public final int d() {
        return this.f29021c;
    }

    @Override // com.google.android.gms.internal.ads.pd3
    public final int e() {
        return this.f29022d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pd3) {
            pd3 pd3Var = (pd3) obj;
            if (this.f29020b.equals(pd3Var.a())) {
                pd3Var.b();
                int i11 = this.f29021c;
                int iD = pd3Var.d();
                if (i11 == 0) {
                    throw null;
                }
                if (i11 == iD) {
                    pd3Var.c();
                    int i12 = this.f29022d;
                    int iE = pd3Var.e();
                    if (i12 == 0) {
                        throw null;
                    }
                    if (iE == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f29020b.hashCode() ^ 1000003;
        int i11 = this.f29021c;
        if (i11 == 0) {
            throw null;
        }
        int i12 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i11;
        if (this.f29022d != 0) {
            return (i12 * (-721379959)) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i11 = this.f29021c;
        String str = Constants.NULL_VERSION_ID;
        String str2 = i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? Constants.NULL_VERSION_ID : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        if (this.f29022d == 1) {
            str = "READ_AND_WRITE";
        }
        String str3 = this.f29020b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 73 + str2.length() + 52 + str.length() + 1);
        sb2.append("FileComplianceOptions{fileOwner=");
        sb2.append(str3);
        sb2.append(", hasDifferentDmaOwner=false, fileChecks=");
        sb2.append(str2);
        sb2.append(", multipleProductIdGroupsResolver=null, filePurpose=");
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
