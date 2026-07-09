package h3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class i3 extends g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f99817a;

    public i3(String str) {
        super(null);
        this.f99817a = str;
    }

    public final String a() {
        return this.f99817a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i3) && Intrinsics.areEqual(this.f99817a, ((i3) obj).f99817a);
    }

    public int hashCode() {
        return this.f99817a.hashCode();
    }

    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f99817a + ')';
    }
}
