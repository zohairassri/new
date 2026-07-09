package tr;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f130415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0 f130416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f130417c;

    public z(i eventType, e0 sessionData, b applicationInfo) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(sessionData, "sessionData");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        this.f130415a = eventType;
        this.f130416b = sessionData;
        this.f130417c = applicationInfo;
    }

    public final b a() {
        return this.f130417c;
    }

    public final i b() {
        return this.f130415a;
    }

    public final e0 c() {
        return this.f130416b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f130415a == zVar.f130415a && Intrinsics.areEqual(this.f130416b, zVar.f130416b) && Intrinsics.areEqual(this.f130417c, zVar.f130417c);
    }

    public int hashCode() {
        return (((this.f130415a.hashCode() * 31) + this.f130416b.hashCode()) * 31) + this.f130417c.hashCode();
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.f130415a + ", sessionData=" + this.f130416b + ", applicationInfo=" + this.f130417c + ')';
    }
}
