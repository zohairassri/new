package oe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f120329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f120330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f120331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f120332d;

    public b(String name, String state, String stack, boolean z11) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(stack, "stack");
        this.f120329a = name;
        this.f120330b = state;
        this.f120331c = stack;
        this.f120332d = z11;
    }

    public final boolean a() {
        return this.f120332d;
    }

    public final String b() {
        return this.f120329a;
    }

    public final String c() {
        return this.f120331c;
    }

    public final String d() {
        return this.f120330b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f120329a, bVar.f120329a) && Intrinsics.areEqual(this.f120330b, bVar.f120330b) && Intrinsics.areEqual(this.f120331c, bVar.f120331c) && this.f120332d == bVar.f120332d;
    }

    public int hashCode() {
        return (((((this.f120329a.hashCode() * 31) + this.f120330b.hashCode()) * 31) + this.f120331c.hashCode()) * 31) + Boolean.hashCode(this.f120332d);
    }

    public String toString() {
        return "ThreadDump(name=" + this.f120329a + ", state=" + this.f120330b + ", stack=" + this.f120331c + ", crashed=" + this.f120332d + ")";
    }
}
