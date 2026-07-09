package yg;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f140493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f140494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f140495c;

    public e(c key, Map attributes, boolean z11) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f140493a = key;
        this.f140494b = attributes;
        this.f140495c = z11;
    }

    public final Map a() {
        return this.f140494b;
    }

    public final c b() {
        return this.f140493a;
    }

    public final boolean c() {
        return this.f140495c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f140493a, eVar.f140493a) && Intrinsics.areEqual(this.f140494b, eVar.f140494b) && this.f140495c == eVar.f140495c;
    }

    public int hashCode() {
        return (((this.f140493a.hashCode() * 31) + this.f140494b.hashCode()) * 31) + Boolean.hashCode(this.f140495c);
    }

    public String toString() {
        return "RumViewInfo(key=" + this.f140493a + ", attributes=" + this.f140494b + ", isActive=" + this.f140495c + ")";
    }
}
