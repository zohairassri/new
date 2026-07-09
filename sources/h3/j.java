package h3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f99818b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f99819c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f99820d = e(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f99821e = e(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f99822a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return j.f99821e;
        }

        public final int b() {
            return j.f99819c;
        }

        public final int c() {
            return j.f99820d;
        }

        private a() {
        }
    }

    private /* synthetic */ j(int i11) {
        this.f99822a = i11;
    }

    public static final /* synthetic */ j d(int i11) {
        return new j(i11);
    }

    public static boolean f(int i11, Object obj) {
        return (obj instanceof j) && i11 == ((j) obj).j();
    }

    public static final boolean g(int i11, int i12) {
        return i11 == i12;
    }

    public static int h(int i11) {
        return Integer.hashCode(i11);
    }

    public static String i(int i11) {
        if (i11 == f99819c) {
            return "EmojiSupportMatch.Default";
        }
        if (i11 == f99820d) {
            return "EmojiSupportMatch.None";
        }
        if (i11 == f99821e) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i11 + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f99822a, obj);
    }

    public int hashCode() {
        return h(this.f99822a);
    }

    public final /* synthetic */ int j() {
        return this.f99822a;
    }

    public String toString() {
        return i(this.f99822a);
    }

    private static int e(int i11) {
        return i11;
    }
}
