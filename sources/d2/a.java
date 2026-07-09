package d2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f88790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f88791b;

    public /* synthetic */ a(int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11);
    }

    @Override // d2.c
    public void a() {
        this.f88791b = true;
    }

    @Override // d2.c
    public int b() {
        return this.f88790a;
    }

    public final boolean c() {
        return this.f88791b;
    }

    private a(int i11) {
        this.f88790a = i11;
    }
}
