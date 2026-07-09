package nl;

import android.os.Bundle;
import com.google.android.exoplayer2.g;
import java.util.Arrays;
import ml.l0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class c implements com.google.android.exoplayer2.g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f119346f = new c(1, 2, 3, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f119347g = l0.o0(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f119348h = l0.o0(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f119349i = l0.o0(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f119350l = l0.o0(3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final g.a f119351m = new g.a() { // from class: nl.b
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return c.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f119352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f119353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f119354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f119355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f119356e;

    public c(int i11, int i12, int i13, byte[] bArr) {
        this.f119352a = i11;
        this.f119353b = i12;
        this.f119354c = i13;
        this.f119355d = bArr;
    }

    public static /* synthetic */ c a(Bundle bundle) {
        return new c(bundle.getInt(f119347g, -1), bundle.getInt(f119348h, -1), bundle.getInt(f119349i, -1), bundle.getByteArray(f119350l));
    }

    public static int b(int i11) {
        if (i11 == 1) {
            return 1;
        }
        if (i11 != 9) {
            return (i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int c(int i11) {
        if (i11 == 1) {
            return 3;
        }
        if (i11 == 16) {
            return 6;
        }
        if (i11 != 18) {
            return (i11 == 6 || i11 == 7) ? 3 : -1;
        }
        return 7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f119352a == cVar.f119352a && this.f119353b == cVar.f119353b && this.f119354c == cVar.f119354c && Arrays.equals(this.f119355d, cVar.f119355d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f119356e == 0) {
            this.f119356e = ((((((527 + this.f119352a) * 31) + this.f119353b) * 31) + this.f119354c) * 31) + Arrays.hashCode(this.f119355d);
        }
        return this.f119356e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(this.f119352a);
        sb2.append(", ");
        sb2.append(this.f119353b);
        sb2.append(", ");
        sb2.append(this.f119354c);
        sb2.append(", ");
        sb2.append(this.f119355d != null);
        sb2.append(")");
        return sb2.toString();
    }
}
