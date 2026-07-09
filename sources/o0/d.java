package o0;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f119894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f119895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function1 f119896d;

    public d(Object obj, String str, int i11, Function1 function1) {
        super(obj);
        this.f119894b = str;
        this.f119895c = i11;
        this.f119896d = function1;
    }

    public final String b() {
        return this.f119894b;
    }

    public final int c() {
        return this.f119895c;
    }

    public final Function1 d() {
        return this.f119896d;
    }

    public String toString() {
        return "TextContextMenuItem(key=" + a() + ", label=\"" + this.f119894b + "\", leadingIcon=" + this.f119895c + ')';
    }
}
