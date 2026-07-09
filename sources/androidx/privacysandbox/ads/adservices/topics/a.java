package androidx.privacysandbox.ads.adservices.topics;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f11708b;

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.topics.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C0172a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f11709a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f11710b = true;

        public final a a() {
            if (this.f11709a.length() > 0) {
                return new a(this.f11709a, this.f11710b);
            }
            throw new IllegalStateException("adsSdkName must be set");
        }

        public final C0172a b(String adsSdkName) {
            Intrinsics.checkNotNullParameter(adsSdkName, "adsSdkName");
            this.f11709a = adsSdkName;
            return this;
        }

        public final C0172a c(boolean z11) {
            this.f11710b = z11;
            return this;
        }
    }

    public a(String adsSdkName, boolean z11) {
        Intrinsics.checkNotNullParameter(adsSdkName, "adsSdkName");
        this.f11707a = adsSdkName;
        this.f11708b = z11;
    }

    public final String a() {
        return this.f11707a;
    }

    public final boolean b() {
        return this.f11708b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f11707a, aVar.f11707a) && this.f11708b == aVar.f11708b;
    }

    public int hashCode() {
        return (this.f11707a.hashCode() * 31) + Boolean.hashCode(this.f11708b);
    }

    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f11707a + ", shouldRecordObservation=" + this.f11708b;
    }
}
