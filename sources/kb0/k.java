package kb0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f110408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f110409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f110410c;

    public k(String instrumentationScopeName, String str, String str2) {
        Intrinsics.checkNotNullParameter(instrumentationScopeName, "instrumentationScopeName");
        this.f110408a = instrumentationScopeName;
        this.f110409b = str;
        this.f110410c = str2;
    }

    public final String a() {
        return this.f110408a;
    }

    public final String b() {
        return this.f110409b;
    }

    public final String c() {
        return this.f110410c;
    }

    public final void d(String str) {
        this.f110409b = str;
    }

    public final void e(String str) {
        this.f110410c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.areEqual(this.f110408a, kVar.f110408a) && Intrinsics.areEqual(this.f110409b, kVar.f110409b) && Intrinsics.areEqual(this.f110410c, kVar.f110410c);
    }

    public int hashCode() {
        int iHashCode = this.f110408a.hashCode() * 31;
        String str = this.f110409b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f110410c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "TracerKey(instrumentationScopeName=" + this.f110408a + ", instrumentationScopeVersion=" + this.f110409b + ", schemaUrl=" + this.f110410c + ')';
    }

    public /* synthetic */ k(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }
}
