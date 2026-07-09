package z7;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f141832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f141833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f141834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f141835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f141836f;

    public l(int i11, int i12, int i13, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f141832b = i11;
        this.f141833c = i12;
        this.f141834d = i13;
        this.f141835e = iArr;
        this.f141836f = iArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f141832b == lVar.f141832b && this.f141833c == lVar.f141833c && this.f141834d == lVar.f141834d && Arrays.equals(this.f141835e, lVar.f141835e) && Arrays.equals(this.f141836f, lVar.f141836f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f141832b) * 31) + this.f141833c) * 31) + this.f141834d) * 31) + Arrays.hashCode(this.f141835e)) * 31) + Arrays.hashCode(this.f141836f);
    }
}
