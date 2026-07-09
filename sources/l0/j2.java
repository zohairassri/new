package l0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f112415g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final j2 f112416h = new j2(null, null, null, null, null, null, 63, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f112417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f112418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f112419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function1 f112420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function1 f112421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Function1 f112422f;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j2 a() {
            return j2.f112416h;
        }

        private a() {
        }
    }

    public j2(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16) {
        this.f112417a = function1;
        this.f112418b = function12;
        this.f112419c = function13;
        this.f112420d = function14;
        this.f112421e = function15;
        this.f112422f = function16;
    }

    public final Function1 b() {
        return this.f112417a;
    }

    public final Function1 c() {
        return this.f112418b;
    }

    public final Function1 d() {
        return this.f112419c;
    }

    public final Function1 e() {
        return this.f112420d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        return this.f112417a == j2Var.f112417a && this.f112418b == j2Var.f112418b && this.f112419c == j2Var.f112419c && this.f112420d == j2Var.f112420d && this.f112421e == j2Var.f112421e && this.f112422f == j2Var.f112422f;
    }

    public final Function1 f() {
        return this.f112421e;
    }

    public final Function1 g() {
        return this.f112422f;
    }

    public int hashCode() {
        Function1 function1 = this.f112417a;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1 function12 = this.f112418b;
        int iHashCode2 = (iHashCode + (function12 != null ? function12.hashCode() : 0)) * 31;
        Function1 function13 = this.f112419c;
        int iHashCode3 = (iHashCode2 + (function13 != null ? function13.hashCode() : 0)) * 31;
        Function1 function14 = this.f112420d;
        int iHashCode4 = (iHashCode3 + (function14 != null ? function14.hashCode() : 0)) * 31;
        Function1 function15 = this.f112421e;
        int iHashCode5 = (iHashCode4 + (function15 != null ? function15.hashCode() : 0)) * 31;
        Function1 function16 = this.f112422f;
        return iHashCode5 + (function16 != null ? function16.hashCode() : 0);
    }

    public /* synthetic */ j2(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : function1, (i11 & 2) != 0 ? null : function12, (i11 & 4) != 0 ? null : function13, (i11 & 8) != 0 ? null : function14, (i11 & 16) != 0 ? null : function15, (i11 & 32) != 0 ? null : function16);
    }
}
