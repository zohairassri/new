package yf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f140417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sf.a f140418b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f140419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private sf.a f140420b = new sf.c();

        public final c a() {
            return new c(this.f140419a, this.f140420b);
        }
    }

    public c(String str, sf.a eventMapper) {
        Intrinsics.checkNotNullParameter(eventMapper, "eventMapper");
        this.f140417a = str;
        this.f140418b = eventMapper;
    }

    public final String a() {
        return this.f140417a;
    }

    public final sf.a b() {
        return this.f140418b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f140417a, cVar.f140417a) && Intrinsics.areEqual(this.f140418b, cVar.f140418b);
    }

    public int hashCode() {
        String str = this.f140417a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f140418b.hashCode();
    }

    public String toString() {
        return "LogsConfiguration(customEndpointUrl=" + this.f140417a + ", eventMapper=" + this.f140418b + ")";
    }
}
