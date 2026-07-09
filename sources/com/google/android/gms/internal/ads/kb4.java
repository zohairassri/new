package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class kb4 extends f94 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jb4 f29512b;

    private kb4(String str, jb4 jb4Var) {
        this.f29511a = str;
        this.f29512b = jb4Var;
    }

    public static kb4 b(String str, jb4 jb4Var) {
        return new kb4(str, jb4Var);
    }

    @Override // com.google.android.gms.internal.ads.n84
    public final boolean a() {
        return this.f29512b != jb4.f28992c;
    }

    public final String c() {
        return this.f29511a;
    }

    public final jb4 d() {
        return this.f29512b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kb4)) {
            return false;
        }
        kb4 kb4Var = (kb4) obj;
        return kb4Var.f29511a.equals(this.f29511a) && kb4Var.f29512b.equals(this.f29512b);
    }

    public final int hashCode() {
        return Objects.hash(kb4.class, this.f29511a, this.f29512b);
    }

    public final String toString() {
        String string = this.f29512b.toString();
        String str = this.f29511a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 45 + string.length() + 1);
        sb2.append("LegacyKmsAead Parameters (keyUri: ");
        sb2.append(str);
        sb2.append(", variant: ");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }
}
