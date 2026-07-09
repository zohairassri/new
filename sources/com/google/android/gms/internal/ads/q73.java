package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class q73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ql.b f33470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f33471c;

    /* synthetic */ q73(p73 p73Var, byte[] bArr) {
        this.f33469a = p73Var.b();
        this.f33470b = p73Var.c();
        this.f33471c = p73Var.d();
    }

    public final String a() {
        return this.f33469a;
    }

    public final String b() {
        ql.b bVar = this.f33470b;
        return bVar == null ? "unknown" : bVar.name().toLowerCase(Locale.ENGLISH);
    }

    public final String c() {
        return this.f33471c;
    }

    public final boolean equals(Object obj) {
        ql.b bVar;
        ql.b bVar2;
        if (obj instanceof q73) {
            q73 q73Var = (q73) obj;
            if (this.f33469a.equals(q73Var.f33469a) && (bVar = this.f33470b) != null && (bVar2 = q73Var.f33470b) != null && bVar.equals(bVar2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f33469a, this.f33470b);
    }
}
