package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4535a;

    public j2(String str) {
        this.f4535a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2) && Intrinsics.areEqual(this.f4535a, ((j2) obj).f4535a);
    }

    public int hashCode() {
        return this.f4535a.hashCode();
    }

    public String toString() {
        return "OpaqueKey(key=" + this.f4535a + ')';
    }
}
