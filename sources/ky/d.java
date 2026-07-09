package ky;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f112134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Exception f112135b;

    public d(String errorMessage, Exception exc) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f112134a = errorMessage;
        this.f112135b = exc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f112134a, dVar.f112134a) && Intrinsics.areEqual(this.f112135b, dVar.f112135b);
    }

    public int hashCode() {
        int iHashCode = this.f112134a.hashCode() * 31;
        Exception exc = this.f112135b;
        return iHashCode + (exc == null ? 0 : exc.hashCode());
    }

    public String toString() {
        return "PurrError(errorMessage=" + this.f112134a + ", exception=" + this.f112135b + ")";
    }
}
