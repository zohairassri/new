package ky;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f112118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f112119b;

    /* JADX INFO: renamed from: ky.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1357a extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1357a f112120c = new C1357a();

        /* JADX WARN: Illegal instructions before constructor call */
        private C1357a() {
            String str = "cmp_layer_1";
            super(str, str, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f112121c = new b();

        /* JADX WARN: Illegal instructions before constructor call */
        private b() {
            String str = "cmp_layer_2";
            super(str, str, null);
        }
    }

    public /* synthetic */ a(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public final String a() {
        return this.f112119b;
    }

    public final String b() {
        return this.f112118a;
    }

    private a(String str, String str2) {
        this.f112118a = str;
        this.f112119b = str2;
    }
}
