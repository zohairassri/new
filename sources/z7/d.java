package z7;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f141810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f141811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f141812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f141813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i[] f141814f;

    public d(String str, boolean z11, boolean z12, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f141810b = str;
        this.f141811c = z11;
        this.f141812d = z12;
        this.f141813e = strArr;
        this.f141814f = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f141811c == dVar.f141811c && this.f141812d == dVar.f141812d && Objects.equals(this.f141810b, dVar.f141810b) && Arrays.equals(this.f141813e, dVar.f141813e) && Arrays.equals(this.f141814f, dVar.f141814f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i11 = (((527 + (this.f141811c ? 1 : 0)) * 31) + (this.f141812d ? 1 : 0)) * 31;
        String str = this.f141810b;
        return i11 + (str != null ? str.hashCode() : 0);
    }
}
