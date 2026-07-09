package dj;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class b implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f90008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f90009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f90010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f90011f;

    public b(int i11, int i12, int i13, int i14) {
        this.f90008c = i11;
        this.f90009d = i12;
        this.f90010e = i13;
        this.f90011f = i14;
    }

    @Override // dj.e
    public int a() {
        return this.f90008c;
    }

    @Override // dj.e
    public int b() {
        return this.f90010e;
    }

    @Override // dj.e
    public int c() {
        return this.f90009d;
    }

    @Override // dj.e
    public int d() {
        return this.f90011f;
    }

    public /* synthetic */ b(int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0 : i11, (i15 & 2) != 0 ? 0 : i12, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) != 0 ? 0 : i14);
    }
}
