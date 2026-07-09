package x1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f136527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f136528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f136529c;

    public r(int i11, String str, String str2) {
        this.f136527a = i11;
        this.f136528b = str;
        this.f136529c = str2;
    }

    public final String a() {
        return this.f136529c;
    }

    public final String b() {
        return this.f136528b;
    }

    public final int c() {
        return this.f136527a;
    }

    public /* synthetic */ r(int i11, String str, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2);
    }
}
