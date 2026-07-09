package bh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Long f14485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f14486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f14487c;

    public g(Long l11, f config, a aVar) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f14485a = l11;
        this.f14486b = config;
        this.f14487c = aVar;
    }

    public final f a() {
        return this.f14486b;
    }

    public final Long b() {
        return this.f14485a;
    }

    public final a c() {
        return this.f14487c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f14485a, gVar.f14485a) && this.f14486b == gVar.f14486b && Intrinsics.areEqual(this.f14487c, gVar.f14487c);
    }

    public int hashCode() {
        Long l11 = this.f14485a;
        int iHashCode = (((l11 == null ? 0 : l11.hashCode()) * 31) + this.f14486b.hashCode()) * 31;
        a aVar = this.f14487c;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ViewInitializationMetricsState(initializationTime=" + this.f14485a + ", config=" + this.f14486b + ", noValueReason=" + this.f14487c + ")";
    }
}
