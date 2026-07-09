package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class m5 extends l6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f40539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zo.u f40540b;

    m5(Context context, zo.u uVar) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.f40539a = context;
        this.f40540b = uVar;
    }

    @Override // com.google.android.gms.internal.measurement.l6
    final Context a() {
        return this.f40539a;
    }

    @Override // com.google.android.gms.internal.measurement.l6
    final zo.u b() {
        return this.f40540b;
    }

    public final boolean equals(Object obj) {
        zo.u uVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof l6) {
            l6 l6Var = (l6) obj;
            if (this.f40539a.equals(l6Var.a()) && ((uVar = this.f40540b) != null ? uVar.equals(l6Var.b()) : l6Var.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f40539a.hashCode() ^ 1000003) * 1000003;
        zo.u uVar = this.f40540b;
        return (uVar == null ? 0 : uVar.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        return "FlagsContext{context=" + String.valueOf(this.f40539a) + ", hermeticFileOverrides=" + String.valueOf(this.f40540b) + "}";
    }
}
