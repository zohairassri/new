package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class il extends tl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hl f41471b;

    private il(int i11, hl hlVar) {
        this.f41470a = i11;
        this.f41471b = hlVar;
    }

    public static il b(int i11, hl hlVar) throws GeneralSecurityException {
        if (i11 >= 10 && i11 <= 16) {
            return new il(i11, hlVar);
        }
        throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i11);
    }

    public final int a() {
        hl hlVar = this.f41471b;
        if (hlVar == hl.f41427e) {
            return this.f41470a;
        }
        if (hlVar == hl.f41424b || hlVar == hl.f41425c || hlVar == hl.f41426d) {
            return this.f41470a + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean c() {
        return this.f41471b != hl.f41427e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof il)) {
            return false;
        }
        il ilVar = (il) obj;
        return ilVar.a() == a() && ilVar.f41471b == this.f41471b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f41470a), this.f41471b});
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + this.f41471b.toString() + ", " + this.f41470a + "-byte tags)";
    }
}
