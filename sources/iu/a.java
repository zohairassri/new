package iu;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f104595a;

    public a(b deviceToken) {
        Intrinsics.checkNotNullParameter(deviceToken, "deviceToken");
        this.f104595a = deviceToken;
    }

    public final b a() {
        return this.f104595a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.f104595a, ((a) obj).f104595a);
    }

    public int hashCode() {
        return this.f104595a.hashCode();
    }

    public String toString() {
        return "AsyncData(deviceToken=" + this.f104595a + ")";
    }
}
