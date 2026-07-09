package androidx.privacysandbox.ads.adservices.topics;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f11711a;

    public b(List topics) {
        Intrinsics.checkNotNullParameter(topics, "topics");
        this.f11711a = topics;
    }

    public final List a() {
        return this.f11711a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f11711a.size() != bVar.f11711a.size()) {
            return false;
        }
        return Intrinsics.areEqual(new HashSet(this.f11711a), new HashSet(bVar.f11711a));
    }

    public int hashCode() {
        return Objects.hash(this.f11711a);
    }

    public String toString() {
        return "Topics=" + this.f11711a;
    }
}
