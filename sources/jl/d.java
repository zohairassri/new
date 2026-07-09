package jl;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f105775f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f105777h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f105784o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f105770a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f105771b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set f105772c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f105773d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f105774e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f105776g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f105778i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f105779j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f105780k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f105781l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f105782m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f105783n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f105785p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f105786q = false;

    private static int B(int i11, String str, String str2, int i12) {
        if (str.isEmpty() || i11 == -1) {
            return i11;
        }
        if (str.equals(str2)) {
            return i11 + i12;
        }
        return -1;
    }

    public d A(boolean z11) {
        this.f105780k = z11 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f105778i) {
            return this.f105777h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f105786q;
    }

    public int c() {
        if (this.f105776g) {
            return this.f105775f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f105774e;
    }

    public float e() {
        return this.f105784o;
    }

    public int f() {
        return this.f105783n;
    }

    public int g() {
        return this.f105785p;
    }

    public int h(String str, String str2, Set set, String str3) {
        if (this.f105770a.isEmpty() && this.f105771b.isEmpty() && this.f105772c.isEmpty() && this.f105773d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iB = B(B(B(0, this.f105770a, str, 1073741824), this.f105771b, str2, 2), this.f105773d, str3, 4);
        if (iB == -1 || !set.containsAll(this.f105772c)) {
            return 0;
        }
        return iB + (this.f105772c.size() * 4);
    }

    public int i() {
        int i11 = this.f105781l;
        if (i11 == -1 && this.f105782m == -1) {
            return -1;
        }
        return (i11 == 1 ? 1 : 0) | (this.f105782m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f105778i;
    }

    public boolean k() {
        return this.f105776g;
    }

    public boolean l() {
        return this.f105779j == 1;
    }

    public boolean m() {
        return this.f105780k == 1;
    }

    public d n(int i11) {
        this.f105777h = i11;
        this.f105778i = true;
        return this;
    }

    public d o(boolean z11) {
        this.f105781l = z11 ? 1 : 0;
        return this;
    }

    public d p(boolean z11) {
        this.f105786q = z11;
        return this;
    }

    public d q(int i11) {
        this.f105775f = i11;
        this.f105776g = true;
        return this;
    }

    public d r(String str) {
        this.f105774e = str == null ? null : zo.c.e(str);
        return this;
    }

    public d s(float f11) {
        this.f105784o = f11;
        return this;
    }

    public d t(int i11) {
        this.f105783n = i11;
        return this;
    }

    public d u(boolean z11) {
        this.f105782m = z11 ? 1 : 0;
        return this;
    }

    public d v(int i11) {
        this.f105785p = i11;
        return this;
    }

    public void w(String[] strArr) {
        this.f105772c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f105770a = str;
    }

    public void y(String str) {
        this.f105771b = str;
    }

    public void z(String str) {
        this.f105773d = str;
    }
}
