package lb0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f113982a;

    public b(List samples) {
        Intrinsics.checkNotNullParameter(samples, "samples");
        this.f113982a = samples;
    }

    public final b a(List samples) {
        Intrinsics.checkNotNullParameter(samples, "samples");
        return new b(samples);
    }

    public final List b() {
        return this.f113982a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.areEqual(this.f113982a, ((b) obj).f113982a);
    }

    public int hashCode() {
        return this.f113982a.hashCode();
    }

    public String toString() {
        return "AnrSampleList(samples=" + this.f113982a + ')';
    }
}
