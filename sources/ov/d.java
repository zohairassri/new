package ov;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f120700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f120701b;

    public d(String name, Function0 invoke) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(invoke, "invoke");
        this.f120700a = name;
        this.f120701b = invoke;
    }

    public final Function0 a() {
        return this.f120701b;
    }

    public final String b() {
        return this.f120700a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f120700a, dVar.f120700a) && Intrinsics.areEqual(this.f120701b, dVar.f120701b);
    }

    public int hashCode() {
        return (this.f120700a.hashCode() * 31) + this.f120701b.hashCode();
    }

    public String toString() {
        return "TracingMetadataItem(name=" + this.f120700a + ", invoke=" + this.f120701b + ")";
    }
}
