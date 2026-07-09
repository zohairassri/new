package j6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Objects;
import k6.n0;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f104977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f104978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f104979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f104980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f104981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f104982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f104983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f104984h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f104985i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f104986j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f104987k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f104988l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f104989m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f104990n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f104991o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f104992p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f104993q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f104994r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f104969s = new b().o("").a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f104970t = n0.B0(0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f104971u = n0.B0(17);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f104972v = n0.B0(1);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f104973w = n0.B0(2);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f104974x = n0.B0(3);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f104975y = n0.B0(18);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f104976z = n0.B0(4);
    private static final String A = n0.B0(5);
    private static final String B = n0.B0(6);
    private static final String C = n0.B0(7);
    private static final String D = n0.B0(8);
    private static final String E = n0.B0(9);
    private static final String F = n0.B0(10);
    private static final String G = n0.B0(11);
    private static final String H = n0.B0(12);
    private static final String I = n0.B0(13);
    private static final String J = n0.B0(14);
    private static final String K = n0.B0(15);
    private static final String L = n0.B0(16);
    private static final String M = n0.B0(19);

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CharSequence f104995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Bitmap f104996b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Layout.Alignment f104997c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Layout.Alignment f104998d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f104999e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f105000f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f105001g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f105002h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f105003i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f105004j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f105005k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f105006l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f105007m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f105008n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f105009o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f105010p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private float f105011q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f105012r;

        public a a() {
            return new a(this.f104995a, this.f104997c, this.f104998d, this.f104996b, this.f104999e, this.f105000f, this.f105001g, this.f105002h, this.f105003i, this.f105004j, this.f105005k, this.f105006l, this.f105007m, this.f105008n, this.f105009o, this.f105010p, this.f105011q, this.f105012r);
        }

        public b b() {
            this.f105008n = false;
            return this;
        }

        public int c() {
            return this.f105001g;
        }

        public int d() {
            return this.f105003i;
        }

        public CharSequence e() {
            return this.f104995a;
        }

        public b f(Bitmap bitmap) {
            this.f104996b = bitmap;
            this.f104995a = null;
            return this;
        }

        public b g(float f11) {
            this.f105007m = f11;
            return this;
        }

        public b h(float f11, int i11) {
            this.f104999e = f11;
            this.f105000f = i11;
            return this;
        }

        public b i(int i11) {
            this.f105001g = i11;
            return this;
        }

        public b j(Layout.Alignment alignment) {
            this.f104998d = alignment;
            return this;
        }

        public b k(float f11) {
            this.f105002h = f11;
            return this;
        }

        public b l(int i11) {
            this.f105003i = i11;
            return this;
        }

        public b m(float f11) {
            this.f105011q = f11;
            return this;
        }

        public b n(float f11) {
            this.f105006l = f11;
            return this;
        }

        public b o(CharSequence charSequence) {
            this.f104995a = charSequence;
            this.f104996b = null;
            return this;
        }

        public b p(Layout.Alignment alignment) {
            this.f104997c = alignment;
            return this;
        }

        public b q(float f11, int i11) {
            this.f105005k = f11;
            this.f105004j = i11;
            return this;
        }

        public b r(int i11) {
            this.f105010p = i11;
            return this;
        }

        public b s(int i11) {
            this.f105009o = i11;
            this.f105008n = true;
            return this;
        }

        public b t(int i11) {
            this.f105012r = i11;
            return this;
        }

        public b() {
            this.f104995a = null;
            this.f104996b = null;
            this.f104997c = null;
            this.f104998d = null;
            this.f104999e = -3.4028235E38f;
            this.f105000f = IntCompanionObject.MIN_VALUE;
            this.f105001g = IntCompanionObject.MIN_VALUE;
            this.f105002h = -3.4028235E38f;
            this.f105003i = IntCompanionObject.MIN_VALUE;
            this.f105004j = IntCompanionObject.MIN_VALUE;
            this.f105005k = -3.4028235E38f;
            this.f105006l = -3.4028235E38f;
            this.f105007m = -3.4028235E38f;
            this.f105008n = false;
            this.f105009o = -16777216;
            this.f105010p = IntCompanionObject.MIN_VALUE;
        }

        private b(a aVar) {
            this.f104995a = aVar.f104977a;
            this.f104996b = aVar.f104980d;
            this.f104997c = aVar.f104978b;
            this.f104998d = aVar.f104979c;
            this.f104999e = aVar.f104981e;
            this.f105000f = aVar.f104982f;
            this.f105001g = aVar.f104983g;
            this.f105002h = aVar.f104984h;
            this.f105003i = aVar.f104985i;
            this.f105004j = aVar.f104990n;
            this.f105005k = aVar.f104991o;
            this.f105006l = aVar.f104986j;
            this.f105007m = aVar.f104987k;
            this.f105008n = aVar.f104988l;
            this.f105009o = aVar.f104989m;
            this.f105010p = aVar.f104992p;
            this.f105011q = aVar.f104993q;
            this.f105012r = aVar.f104994r;
        }
    }

    public static a b(Bundle bundle) {
        b bVar = new b();
        CharSequence charSequence = bundle.getCharSequence(f104970t);
        if (charSequence != null) {
            bVar.o(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f104971u);
            if (parcelableArrayList != null) {
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                int size = parcelableArrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = parcelableArrayList.get(i11);
                    i11++;
                    d.c((Bundle) obj, spannableStringValueOf);
                }
                bVar.o(spannableStringValueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f104972v);
        if (alignment != null) {
            bVar.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f104973w);
        if (alignment2 != null) {
            bVar.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f104974x);
        if (bitmap != null) {
            bVar.f(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(f104975y);
            if (byteArray != null) {
                bVar.f(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        String str = f104976z;
        if (bundle.containsKey(str)) {
            String str2 = A;
            if (bundle.containsKey(str2)) {
                bVar.h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = B;
        if (bundle.containsKey(str3)) {
            bVar.i(bundle.getInt(str3));
        }
        String str4 = C;
        if (bundle.containsKey(str4)) {
            bVar.k(bundle.getFloat(str4));
        }
        String str5 = D;
        if (bundle.containsKey(str5)) {
            bVar.l(bundle.getInt(str5));
        }
        String str6 = F;
        if (bundle.containsKey(str6)) {
            String str7 = E;
            if (bundle.containsKey(str7)) {
                bVar.q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = G;
        if (bundle.containsKey(str8)) {
            bVar.n(bundle.getFloat(str8));
        }
        String str9 = H;
        if (bundle.containsKey(str9)) {
            bVar.g(bundle.getFloat(str9));
        }
        String str10 = I;
        if (bundle.containsKey(str10)) {
            bVar.s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(J, false)) {
            bVar.b();
        }
        String str11 = K;
        if (bundle.containsKey(str11)) {
            bVar.r(bundle.getInt(str11));
        }
        String str12 = L;
        if (bundle.containsKey(str12)) {
            bVar.m(bundle.getFloat(str12));
        }
        String str13 = M;
        if (bundle.containsKey(str13)) {
            bVar.t(bundle.getInt(str13));
        }
        return bVar.a();
    }

    private Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f104977a;
        if (charSequence != null) {
            bundle.putCharSequence(f104970t, charSequence);
            CharSequence charSequence2 = this.f104977a;
            if (charSequence2 instanceof Spanned) {
                ArrayList<? extends Parcelable> arrayListA = d.a((Spanned) charSequence2);
                if (!arrayListA.isEmpty()) {
                    bundle.putParcelableArrayList(f104971u, arrayListA);
                }
            }
        }
        bundle.putSerializable(f104972v, this.f104978b);
        bundle.putSerializable(f104973w, this.f104979c);
        bundle.putFloat(f104976z, this.f104981e);
        bundle.putInt(A, this.f104982f);
        bundle.putInt(B, this.f104983g);
        bundle.putFloat(C, this.f104984h);
        bundle.putInt(D, this.f104985i);
        bundle.putInt(E, this.f104990n);
        bundle.putFloat(F, this.f104991o);
        bundle.putFloat(G, this.f104986j);
        bundle.putFloat(H, this.f104987k);
        bundle.putBoolean(J, this.f104988l);
        bundle.putInt(I, this.f104989m);
        bundle.putInt(K, this.f104992p);
        bundle.putFloat(L, this.f104993q);
        bundle.putInt(M, this.f104994r);
        return bundle;
    }

    public b a() {
        return new b();
    }

    public Bundle d() {
        Bundle bundleC = c();
        if (this.f104980d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            k6.a.g(this.f104980d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundleC.putByteArray(f104975y, byteArrayOutputStream.toByteArray());
        }
        return bundleC;
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (TextUtils.equals(this.f104977a, aVar.f104977a) && this.f104978b == aVar.f104978b && this.f104979c == aVar.f104979c && ((bitmap = this.f104980d) != null ? !((bitmap2 = aVar.f104980d) == null || !bitmap.sameAs(bitmap2)) : aVar.f104980d == null) && this.f104981e == aVar.f104981e && this.f104982f == aVar.f104982f && this.f104983g == aVar.f104983g && this.f104984h == aVar.f104984h && this.f104985i == aVar.f104985i && this.f104986j == aVar.f104986j && this.f104987k == aVar.f104987k && this.f104988l == aVar.f104988l && this.f104989m == aVar.f104989m && this.f104990n == aVar.f104990n && this.f104991o == aVar.f104991o && this.f104992p == aVar.f104992p && this.f104993q == aVar.f104993q && this.f104994r == aVar.f104994r) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f104977a, this.f104978b, this.f104979c, this.f104980d, Float.valueOf(this.f104981e), Integer.valueOf(this.f104982f), Integer.valueOf(this.f104983g), Float.valueOf(this.f104984h), Integer.valueOf(this.f104985i), Float.valueOf(this.f104986j), Float.valueOf(this.f104987k), Boolean.valueOf(this.f104988l), Integer.valueOf(this.f104989m), Integer.valueOf(this.f104990n), Float.valueOf(this.f104991o), Integer.valueOf(this.f104992p), Float.valueOf(this.f104993q), Integer.valueOf(this.f104994r));
    }

    private a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f11, int i11, int i12, float f12, int i13, int i14, float f13, float f14, float f15, boolean z11, int i15, int i16, float f16, int i17) {
        if (charSequence == null) {
            k6.a.e(bitmap);
        } else {
            k6.a.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f104977a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f104977a = charSequence.toString();
        } else {
            this.f104977a = null;
        }
        this.f104978b = alignment;
        this.f104979c = alignment2;
        this.f104980d = bitmap;
        this.f104981e = f11;
        this.f104982f = i11;
        this.f104983g = i12;
        this.f104984h = f12;
        this.f104985i = i13;
        this.f104986j = f14;
        this.f104987k = f15;
        this.f104988l = z11;
        this.f104989m = i15;
        this.f104990n = i14;
        this.f104991o = f13;
        this.f104992p = i16;
        this.f104993q = f16;
        this.f104994r = i17;
    }
}
