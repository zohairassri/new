package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f4630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f4631b;

    public m1(Object obj, Object obj2) {
        this.f4630a = obj;
        this.f4631b = obj2;
    }

    private final int c(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final Object a() {
        return this.f4630a;
    }

    public final Object b() {
        return this.f4631b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return Intrinsics.areEqual(this.f4630a, m1Var.f4630a) && Intrinsics.areEqual(this.f4631b, m1Var.f4631b);
    }

    public int hashCode() {
        return (c(this.f4630a) * 31) + c(this.f4631b);
    }

    public String toString() {
        return "JoinedKey(left=" + this.f4630a + ", right=" + this.f4631b + ')';
    }
}
