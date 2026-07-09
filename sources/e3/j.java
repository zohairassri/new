package e3;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f91155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f91156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f91157c;

    public j(Function0 function0, Function0 function02, boolean z11) {
        this.f91155a = function0;
        this.f91156b = function02;
        this.f91157c = z11;
    }

    public final Function0 a() {
        return this.f91156b;
    }

    public final boolean b() {
        return this.f91157c;
    }

    public final Function0 c() {
        return this.f91155a;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f91155a.invoke()).floatValue() + ", maxValue=" + ((Number) this.f91156b.invoke()).floatValue() + ", reverseScrolling=" + this.f91157c + ')';
    }
}
