package u6;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f131059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f131060d;

    public b(String str, String str2, int i11, int i12) {
        this.f131057a = str;
        this.f131058b = str2;
        this.f131059c = i11;
        this.f131060d = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f131059c == bVar.f131059c && this.f131060d == bVar.f131060d && Objects.equals(this.f131057a, bVar.f131057a) && Objects.equals(this.f131058b, bVar.f131058b);
    }

    public int hashCode() {
        return Objects.hash(this.f131057a, this.f131058b, Integer.valueOf(this.f131059c), Integer.valueOf(this.f131060d));
    }
}
