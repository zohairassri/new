package th0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f130104a;

    public c(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f130104a = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.areEqual(this.f130104a, ((c) obj).f130104a);
    }

    @Override // th0.a
    public String getValue() {
        return this.f130104a;
    }

    public int hashCode() {
        return this.f130104a.hashCode();
    }

    public String toString() {
        return getValue();
    }
}
