package ob;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f120275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f120276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f120277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f120278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final bb.j f120279e;

    public o(boolean z11, boolean z12, boolean z13, int i11, bb.j jVar) {
        this.f120275a = z11;
        this.f120276b = z12;
        this.f120277c = z13;
        this.f120278d = i11;
        this.f120279e = jVar;
    }

    public final boolean a() {
        return this.f120275a;
    }

    public final bb.j b() {
        return this.f120279e;
    }

    public final int c() {
        return this.f120278d;
    }

    public final boolean d() {
        return this.f120276b;
    }

    public final boolean e() {
        return this.f120277c;
    }

    public /* synthetic */ o(boolean z11, boolean z12, boolean z13, int i11, bb.j jVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? true : z11, (i12 & 2) != 0 ? true : z12, (i12 & 4) != 0 ? true : z13, (i12 & 8) != 0 ? 4 : i11, (i12 & 16) != 0 ? bb.j.f14170b : jVar);
    }
}
