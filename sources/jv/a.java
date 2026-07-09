package jv;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f106163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f106164b;

    public a(String url, Function1 analyticsTrackingId) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(analyticsTrackingId, "analyticsTrackingId");
        this.f106163a = url;
        this.f106164b = analyticsTrackingId;
    }

    public final Function1 a() {
        return this.f106164b;
    }

    public final String b() {
        return this.f106163a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f106163a, aVar.f106163a) && Intrinsics.areEqual(this.f106164b, aVar.f106164b);
    }

    public int hashCode() {
        return (this.f106163a.hashCode() * 31) + this.f106164b.hashCode();
    }

    public String toString() {
        return "GraphQLConfig(url=" + this.f106163a + ", analyticsTrackingId=" + this.f106164b + ")";
    }
}
