package al;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.google.android.exoplayer2.g;
import kotlin.jvm.internal.IntCompanionObject;
import ml.l0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class b implements com.google.android.exoplayer2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f1030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f1031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f1032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f1033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f1037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f1038i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f1039l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f1040m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f1041n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f1042r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f1043s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f1044v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f1045w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f1046x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b f1029y = new C0037b().o("").a();
    private static final String B = l0.o0(0);
    private static final String N = l0.o0(1);
    private static final String S = l0.o0(2);
    private static final String X = l0.o0(3);
    private static final String Y = l0.o0(4);
    private static final String Z = l0.o0(5);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final String f1017i0 = l0.o0(6);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final String f1018j0 = l0.o0(7);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final String f1019k0 = l0.o0(8);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final String f1020l0 = l0.o0(9);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final String f1021m0 = l0.o0(10);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final String f1022n0 = l0.o0(11);

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final String f1023o0 = l0.o0(12);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final String f1024p0 = l0.o0(13);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final String f1025q0 = l0.o0(14);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final String f1026r0 = l0.o0(15);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final String f1027s0 = l0.o0(16);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final g.a f1028t0 = new g.a() { // from class: al.a
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return b.c(bundle);
        }
    };

    /* JADX INFO: renamed from: al.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C0037b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CharSequence f1047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Bitmap f1048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Layout.Alignment f1049c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Layout.Alignment f1050d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f1051e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f1052f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f1053g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f1054h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f1055i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f1056j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f1057k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f1058l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f1059m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f1060n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f1061o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f1062p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private float f1063q;

        public b a() {
            return new b(this.f1047a, this.f1049c, this.f1050d, this.f1048b, this.f1051e, this.f1052f, this.f1053g, this.f1054h, this.f1055i, this.f1056j, this.f1057k, this.f1058l, this.f1059m, this.f1060n, this.f1061o, this.f1062p, this.f1063q);
        }

        public C0037b b() {
            this.f1060n = false;
            return this;
        }

        public int c() {
            return this.f1053g;
        }

        public int d() {
            return this.f1055i;
        }

        public CharSequence e() {
            return this.f1047a;
        }

        public C0037b f(Bitmap bitmap) {
            this.f1048b = bitmap;
            return this;
        }

        public C0037b g(float f11) {
            this.f1059m = f11;
            return this;
        }

        public C0037b h(float f11, int i11) {
            this.f1051e = f11;
            this.f1052f = i11;
            return this;
        }

        public C0037b i(int i11) {
            this.f1053g = i11;
            return this;
        }

        public C0037b j(Layout.Alignment alignment) {
            this.f1050d = alignment;
            return this;
        }

        public C0037b k(float f11) {
            this.f1054h = f11;
            return this;
        }

        public C0037b l(int i11) {
            this.f1055i = i11;
            return this;
        }

        public C0037b m(float f11) {
            this.f1063q = f11;
            return this;
        }

        public C0037b n(float f11) {
            this.f1058l = f11;
            return this;
        }

        public C0037b o(CharSequence charSequence) {
            this.f1047a = charSequence;
            return this;
        }

        public C0037b p(Layout.Alignment alignment) {
            this.f1049c = alignment;
            return this;
        }

        public C0037b q(float f11, int i11) {
            this.f1057k = f11;
            this.f1056j = i11;
            return this;
        }

        public C0037b r(int i11) {
            this.f1062p = i11;
            return this;
        }

        public C0037b s(int i11) {
            this.f1061o = i11;
            this.f1060n = true;
            return this;
        }

        public C0037b() {
            this.f1047a = null;
            this.f1048b = null;
            this.f1049c = null;
            this.f1050d = null;
            this.f1051e = -3.4028235E38f;
            this.f1052f = IntCompanionObject.MIN_VALUE;
            this.f1053g = IntCompanionObject.MIN_VALUE;
            this.f1054h = -3.4028235E38f;
            this.f1055i = IntCompanionObject.MIN_VALUE;
            this.f1056j = IntCompanionObject.MIN_VALUE;
            this.f1057k = -3.4028235E38f;
            this.f1058l = -3.4028235E38f;
            this.f1059m = -3.4028235E38f;
            this.f1060n = false;
            this.f1061o = -16777216;
            this.f1062p = IntCompanionObject.MIN_VALUE;
        }

        private C0037b(b bVar) {
            this.f1047a = bVar.f1030a;
            this.f1048b = bVar.f1033d;
            this.f1049c = bVar.f1031b;
            this.f1050d = bVar.f1032c;
            this.f1051e = bVar.f1034e;
            this.f1052f = bVar.f1035f;
            this.f1053g = bVar.f1036g;
            this.f1054h = bVar.f1037h;
            this.f1055i = bVar.f1038i;
            this.f1056j = bVar.f1043s;
            this.f1057k = bVar.f1044v;
            this.f1058l = bVar.f1039l;
            this.f1059m = bVar.f1040m;
            this.f1060n = bVar.f1041n;
            this.f1061o = bVar.f1042r;
            this.f1062p = bVar.f1045w;
            this.f1063q = bVar.f1046x;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b c(Bundle bundle) {
        C0037b c0037b = new C0037b();
        CharSequence charSequence = bundle.getCharSequence(B);
        if (charSequence != null) {
            c0037b.o(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(N);
        if (alignment != null) {
            c0037b.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(S);
        if (alignment2 != null) {
            c0037b.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(X);
        if (bitmap != null) {
            c0037b.f(bitmap);
        }
        String str = Y;
        if (bundle.containsKey(str)) {
            String str2 = Z;
            if (bundle.containsKey(str2)) {
                c0037b.h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = f1017i0;
        if (bundle.containsKey(str3)) {
            c0037b.i(bundle.getInt(str3));
        }
        String str4 = f1018j0;
        if (bundle.containsKey(str4)) {
            c0037b.k(bundle.getFloat(str4));
        }
        String str5 = f1019k0;
        if (bundle.containsKey(str5)) {
            c0037b.l(bundle.getInt(str5));
        }
        String str6 = f1021m0;
        if (bundle.containsKey(str6)) {
            String str7 = f1020l0;
            if (bundle.containsKey(str7)) {
                c0037b.q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = f1022n0;
        if (bundle.containsKey(str8)) {
            c0037b.n(bundle.getFloat(str8));
        }
        String str9 = f1023o0;
        if (bundle.containsKey(str9)) {
            c0037b.g(bundle.getFloat(str9));
        }
        String str10 = f1024p0;
        if (bundle.containsKey(str10)) {
            c0037b.s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(f1025q0, false)) {
            c0037b.b();
        }
        String str11 = f1026r0;
        if (bundle.containsKey(str11)) {
            c0037b.r(bundle.getInt(str11));
        }
        String str12 = f1027s0;
        if (bundle.containsKey(str12)) {
            c0037b.m(bundle.getFloat(str12));
        }
        return c0037b.a();
    }

    public C0037b b() {
        return new C0037b();
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (TextUtils.equals(this.f1030a, bVar.f1030a) && this.f1031b == bVar.f1031b && this.f1032c == bVar.f1032c && ((bitmap = this.f1033d) != null ? !((bitmap2 = bVar.f1033d) == null || !bitmap.sameAs(bitmap2)) : bVar.f1033d == null) && this.f1034e == bVar.f1034e && this.f1035f == bVar.f1035f && this.f1036g == bVar.f1036g && this.f1037h == bVar.f1037h && this.f1038i == bVar.f1038i && this.f1039l == bVar.f1039l && this.f1040m == bVar.f1040m && this.f1041n == bVar.f1041n && this.f1042r == bVar.f1042r && this.f1043s == bVar.f1043s && this.f1044v == bVar.f1044v && this.f1045w == bVar.f1045w && this.f1046x == bVar.f1046x) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return zo.k.b(this.f1030a, this.f1031b, this.f1032c, this.f1033d, Float.valueOf(this.f1034e), Integer.valueOf(this.f1035f), Integer.valueOf(this.f1036g), Float.valueOf(this.f1037h), Integer.valueOf(this.f1038i), Float.valueOf(this.f1039l), Float.valueOf(this.f1040m), Boolean.valueOf(this.f1041n), Integer.valueOf(this.f1042r), Integer.valueOf(this.f1043s), Float.valueOf(this.f1044v), Integer.valueOf(this.f1045w), Float.valueOf(this.f1046x));
    }

    private b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f11, int i11, int i12, float f12, int i13, int i14, float f13, float f14, float f15, boolean z11, int i15, int i16, float f16) {
        if (charSequence == null) {
            ml.a.e(bitmap);
        } else {
            ml.a.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f1030a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f1030a = charSequence.toString();
        } else {
            this.f1030a = null;
        }
        this.f1031b = alignment;
        this.f1032c = alignment2;
        this.f1033d = bitmap;
        this.f1034e = f11;
        this.f1035f = i11;
        this.f1036g = i12;
        this.f1037h = f12;
        this.f1038i = i13;
        this.f1039l = f14;
        this.f1040m = f15;
        this.f1041n = z11;
        this.f1042r = i15;
        this.f1043s = i14;
        this.f1044v = f13;
        this.f1045w = i16;
        this.f1046x = f16;
    }
}
