package h3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f99794c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final f0 f99795d = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f99796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f99797b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f0 a() {
            return f0.f99795d;
        }

        private a() {
        }
    }

    public /* synthetic */ f0(int i11, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, z11);
    }

    public final int b() {
        return this.f99797b;
    }

    public final boolean c() {
        return this.f99796a;
    }

    public final f0 d(f0 f0Var) {
        return f0Var == null ? this : f0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f99796a == f0Var.f99796a && j.g(this.f99797b, f0Var.f99797b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f99796a) * 31) + j.h(this.f99797b);
    }

    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f99796a + ", emojiSupportMatch=" + ((Object) j.i(this.f99797b)) + ')';
    }

    public f0(boolean z11) {
        this.f99796a = z11;
        this.f99797b = j.f99818b.b();
    }

    private f0(int i11, boolean z11) {
        this.f99796a = z11;
        this.f99797b = i11;
    }

    public f0() {
        this(j.f99818b.b(), false, null);
    }
}
