package xu;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f137994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f137995b;

    public a(String name, String script) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(script, "script");
        this.f137994a = name;
        this.f137995b = script;
    }

    public final String a() {
        return this.f137995b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f137994a, aVar.f137994a) && Intrinsics.areEqual(this.f137995b, aVar.f137995b);
    }

    public int hashCode() {
        return (this.f137994a.hashCode() * 31) + this.f137995b.hashCode();
    }

    public String toString() {
        return "WebViewScript(name=" + this.f137994a + ", script=" + this.f137995b + ")";
    }
}
