package rh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f124967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f124968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f124969c;

    public c(e type, String message, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f124967a = type;
        this.f124968b = message;
        this.f124969c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f124967a == cVar.f124967a && Intrinsics.areEqual(this.f124968b, cVar.f124968b) && Intrinsics.areEqual(this.f124969c, cVar.f124969c);
    }

    public int hashCode() {
        int iHashCode = ((this.f124967a.hashCode() * 31) + this.f124968b.hashCode()) * 31;
        String str = this.f124969c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "TelemetryEventId(type=" + this.f124967a + ", message=" + this.f124968b + ", kind=" + this.f124969c + ")";
    }
}
