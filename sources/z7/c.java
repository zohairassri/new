package z7;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f141804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f141805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f141806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f141807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f141808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i[] f141809g;

    public c(String str, int i11, int i12, long j11, long j12, i[] iVarArr) {
        super("CHAP");
        this.f141804b = str;
        this.f141805c = i11;
        this.f141806d = i12;
        this.f141807e = j11;
        this.f141808f = j12;
        this.f141809g = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f141805c == cVar.f141805c && this.f141806d == cVar.f141806d && this.f141807e == cVar.f141807e && this.f141808f == cVar.f141808f && Objects.equals(this.f141804b, cVar.f141804b) && Arrays.equals(this.f141809g, cVar.f141809g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i11 = (((((((527 + this.f141805c) * 31) + this.f141806d) * 31) + ((int) this.f141807e)) * 31) + ((int) this.f141808f)) * 31;
        String str = this.f141804b;
        return i11 + (str != null ? str.hashCode() : 0);
    }
}
