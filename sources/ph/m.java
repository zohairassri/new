package ph;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f121626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f121627b;

    public m(String name, Map customAttributes) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(customAttributes, "customAttributes");
        this.f121626a = name;
        this.f121627b = customAttributes;
    }

    public final Map a() {
        return this.f121627b;
    }

    public final String b() {
        return this.f121626a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.areEqual(this.f121626a, mVar.f121626a) && Intrinsics.areEqual(this.f121627b, mVar.f121627b);
    }

    public int hashCode() {
        return (this.f121626a.hashCode() * 31) + this.f121627b.hashCode();
    }

    public String toString() {
        return "Node(name=" + this.f121626a + ", customAttributes=" + this.f121627b + ")";
    }
}
