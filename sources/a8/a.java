package a8;

import com.google.common.primitives.h;
import h6.u;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f436e;

    public a(long j11, long j12, long j13, long j14, long j15) {
        this.f432a = j11;
        this.f433b = j12;
        this.f434c = j13;
        this.f435d = j14;
        this.f436e = j15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f432a == aVar.f432a && this.f433b == aVar.f433b && this.f434c == aVar.f434c && this.f435d == aVar.f435d && this.f436e == aVar.f436e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + h.c(this.f432a)) * 31) + h.c(this.f433b)) * 31) + h.c(this.f434c)) * 31) + h.c(this.f435d)) * 31) + h.c(this.f436e);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f432a + ", photoSize=" + this.f433b + ", photoPresentationTimestampUs=" + this.f434c + ", videoStartPosition=" + this.f435d + ", videoSize=" + this.f436e;
    }
}
