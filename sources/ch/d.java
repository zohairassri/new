package ch;

import kotlin.jvm.internal.Intrinsics;
import nh.a;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a.d f17740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f17741c;

    public d(String viewId, a.d actionType, long j11) {
        Intrinsics.checkNotNullParameter(viewId, "viewId");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        this.f17739a = viewId;
        this.f17740b = actionType;
        this.f17741c = j11;
    }

    public final a.d a() {
        return this.f17740b;
    }

    public final long b() {
        return this.f17741c;
    }

    public final String c() {
        return this.f17739a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f17739a, dVar.f17739a) && this.f17740b == dVar.f17740b && this.f17741c == dVar.f17741c;
    }

    public int hashCode() {
        return (((this.f17739a.hashCode() * 31) + this.f17740b.hashCode()) * 31) + Long.hashCode(this.f17741c);
    }

    public String toString() {
        return "InternalInteractionContext(viewId=" + this.f17739a + ", actionType=" + this.f17740b + ", eventCreatedAtNanos=" + this.f17741c + ")";
    }
}
