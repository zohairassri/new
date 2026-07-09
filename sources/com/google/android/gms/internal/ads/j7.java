package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class j7 extends r7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f28914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f28915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final r7[] f28916g;

    public j7(String str, int i11, int i12, long j11, long j12, r7[] r7VarArr) {
        super("CHAP");
        this.f28911b = str;
        this.f28912c = i11;
        this.f28913d = i12;
        this.f28914e = j11;
        this.f28915f = j12;
        this.f28916g = r7VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j7.class == obj.getClass()) {
            j7 j7Var = (j7) obj;
            if (this.f28912c == j7Var.f28912c && this.f28913d == j7Var.f28913d && this.f28914e == j7Var.f28914e && this.f28915f == j7Var.f28915f && Objects.equals(this.f28911b, j7Var.f28911b) && Arrays.equals(this.f28916g, j7Var.f28916g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f28912c + 527;
        String str = this.f28911b;
        long j11 = this.f28915f;
        return (((((((i11 * 31) + this.f28913d) * 31) + ((int) this.f28914e)) * 31) + ((int) j11)) * 31) + str.hashCode();
    }
}
