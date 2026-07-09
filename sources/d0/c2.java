package d0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f87733a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f87734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f87735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f87736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f87737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f87738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f87739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f87740h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f87741i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f87742j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f87743k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f87744l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f87745m;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return c2.f87734b;
        }

        public final int b() {
            return c2.f87736d;
        }

        public final int c() {
            return c2.f87735c;
        }

        public final int d() {
            return c2.f87737e;
        }

        public final int e() {
            return c2.f87741i;
        }

        public final int f() {
            return c2.f87744l;
        }

        public final int g() {
            return c2.f87740h;
        }

        private a() {
        }
    }

    static {
        int iH = h(8);
        f87734b = iH;
        int iH2 = h(4);
        f87735c = iH2;
        int iH3 = h(2);
        f87736d = iH3;
        int iH4 = h(1);
        f87737e = iH4;
        f87738f = l(iH, iH4);
        f87739g = l(iH2, iH3);
        int iH5 = h(16);
        f87740h = iH5;
        int iH6 = h(32);
        f87741i = iH6;
        int iL = l(iH, iH3);
        f87742j = iL;
        int iL2 = l(iH2, iH4);
        f87743k = iL2;
        f87744l = l(iL, iL2);
        f87745m = l(iH5, iH6);
    }

    public static final boolean i(int i11, int i12) {
        return i11 == i12;
    }

    public static final boolean j(int i11, int i12) {
        return (i11 & i12) != 0;
    }

    public static int k(int i11) {
        return Integer.hashCode(i11);
    }

    public static final int l(int i11, int i12) {
        return h(i11 | i12);
    }

    public static String m(int i11) {
        return "WindowInsetsSides(" + n(i11) + ')';
    }

    private static final String n(int i11) {
        StringBuilder sb2 = new StringBuilder();
        int i12 = f87738f;
        if ((i11 & i12) == i12) {
            o(sb2, "Start");
        }
        int i13 = f87742j;
        if ((i11 & i13) == i13) {
            o(sb2, "Left");
        }
        int i14 = f87740h;
        if ((i11 & i14) == i14) {
            o(sb2, "Top");
        }
        int i15 = f87739g;
        if ((i11 & i15) == i15) {
            o(sb2, "End");
        }
        int i16 = f87743k;
        if ((i11 & i16) == i16) {
            o(sb2, "Right");
        }
        int i17 = f87741i;
        if ((i11 & i17) == i17) {
            o(sb2, "Bottom");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private static final void o(StringBuilder sb2, String str) {
        if (sb2.length() > 0) {
            sb2.append('+');
        }
        sb2.append(str);
    }

    private static int h(int i11) {
        return i11;
    }
}
