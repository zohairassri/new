package androidx.compose.ui.window;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f6269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f6270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u f6271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f6272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f6273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f6274f;

    public l(boolean z11, boolean z12, u uVar, boolean z13, boolean z14, String str) {
        this.f6269a = z11;
        this.f6270b = z12;
        this.f6271c = uVar;
        this.f6272d = z13;
        this.f6273e = z14;
        this.f6274f = str;
    }

    public final boolean a() {
        return this.f6273e;
    }

    public final boolean b() {
        return this.f6269a;
    }

    public final boolean c() {
        return this.f6270b;
    }

    public final u d() {
        return this.f6271c;
    }

    public final boolean e() {
        return this.f6272d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f6269a == lVar.f6269a && this.f6270b == lVar.f6270b && this.f6271c == lVar.f6271c && this.f6272d == lVar.f6272d && this.f6273e == lVar.f6273e;
    }

    public final String f() {
        return this.f6274f;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f6269a) * 31) + Boolean.hashCode(this.f6270b)) * 31) + this.f6271c.hashCode()) * 31) + Boolean.hashCode(this.f6272d)) * 31) + Boolean.hashCode(this.f6273e);
    }

    public /* synthetic */ l(boolean z11, boolean z12, u uVar, boolean z13, boolean z14, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11, (i11 & 2) != 0 ? true : z12, (i11 & 4) != 0 ? u.f6289a : uVar, (i11 & 8) != 0 ? true : z13, (i11 & 16) != 0 ? true : z14, (i11 & 32) != 0 ? "" : str);
    }

    public /* synthetic */ l(boolean z11, boolean z12, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11, (i11 & 2) != 0 ? true : z12, (i11 & 4) != 0 ? true : z13);
    }

    public l(boolean z11, boolean z12, boolean z13) {
        this(z11, z12, u.f6289a, z13, true, null, 32, null);
    }
}
