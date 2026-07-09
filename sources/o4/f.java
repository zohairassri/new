package o4;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f120017e = new f(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f120018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f120019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f120020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f120021d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a {
        static Insets a(int i11, int i12, int i13, int i14) {
            return Insets.of(i11, i12, i13, i14);
        }
    }

    private f(int i11, int i12, int i13, int i14) {
        this.f120018a = i11;
        this.f120019b = i12;
        this.f120020c = i13;
        this.f120021d = i14;
    }

    public static f a(f fVar, f fVar2) {
        return c(Math.max(fVar.f120018a, fVar2.f120018a), Math.max(fVar.f120019b, fVar2.f120019b), Math.max(fVar.f120020c, fVar2.f120020c), Math.max(fVar.f120021d, fVar2.f120021d));
    }

    public static f b(f fVar, f fVar2) {
        return c(Math.min(fVar.f120018a, fVar2.f120018a), Math.min(fVar.f120019b, fVar2.f120019b), Math.min(fVar.f120020c, fVar2.f120020c), Math.min(fVar.f120021d, fVar2.f120021d));
    }

    public static f c(int i11, int i12, int i13, int i14) {
        return (i11 == 0 && i12 == 0 && i13 == 0 && i14 == 0) ? f120017e : new f(i11, i12, i13, i14);
    }

    public static f d(Rect rect) {
        return c(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static f e(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f120021d == fVar.f120021d && this.f120018a == fVar.f120018a && this.f120020c == fVar.f120020c && this.f120019b == fVar.f120019b;
    }

    public Insets f() {
        return a.a(this.f120018a, this.f120019b, this.f120020c, this.f120021d);
    }

    public int hashCode() {
        return (((((this.f120018a * 31) + this.f120019b) * 31) + this.f120020c) * 31) + this.f120021d;
    }

    public String toString() {
        return "Insets{left=" + this.f120018a + ", top=" + this.f120019b + ", right=" + this.f120020c + ", bottom=" + this.f120021d + '}';
    }
}
