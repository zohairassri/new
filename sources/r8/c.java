package r8;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f124199f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f124201h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f124208o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f124194a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f124195b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set f124196c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f124197d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f124198e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f124200g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f124202i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f124203j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f124204k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f124205l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f124206m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f124207n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f124209p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f124210q = false;

    private static int B(int i11, String str, String str2, int i12) {
        if (str.isEmpty() || i11 == -1) {
            return i11;
        }
        if (str.equals(str2)) {
            return i11 + i12;
        }
        return -1;
    }

    public c A(boolean z11) {
        this.f124204k = z11 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f124202i) {
            return this.f124201h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f124210q;
    }

    public int c() {
        if (this.f124200g) {
            return this.f124199f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f124198e;
    }

    public float e() {
        return this.f124208o;
    }

    public int f() {
        return this.f124207n;
    }

    public int g() {
        return this.f124209p;
    }

    public int h(String str, String str2, Set set, String str3) {
        if (this.f124194a.isEmpty() && this.f124195b.isEmpty() && this.f124196c.isEmpty() && this.f124197d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iB = B(B(B(0, this.f124194a, str, 1073741824), this.f124195b, str2, 2), this.f124197d, str3, 4);
        if (iB == -1 || !set.containsAll(this.f124196c)) {
            return 0;
        }
        return iB + (this.f124196c.size() * 4);
    }

    public int i() {
        int i11 = this.f124205l;
        if (i11 == -1 && this.f124206m == -1) {
            return -1;
        }
        return (i11 == 1 ? 1 : 0) | (this.f124206m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f124202i;
    }

    public boolean k() {
        return this.f124200g;
    }

    public boolean l() {
        return this.f124203j == 1;
    }

    public boolean m() {
        return this.f124204k == 1;
    }

    public c n(int i11) {
        this.f124201h = i11;
        this.f124202i = true;
        return this;
    }

    public c o(boolean z11) {
        this.f124205l = z11 ? 1 : 0;
        return this;
    }

    public c p(boolean z11) {
        this.f124210q = z11;
        return this;
    }

    public c q(int i11) {
        this.f124199f = i11;
        this.f124200g = true;
        return this;
    }

    public c r(String str) {
        this.f124198e = str == null ? null : zo.c.e(str);
        return this;
    }

    public c s(float f11) {
        this.f124208o = f11;
        return this;
    }

    public c t(int i11) {
        this.f124207n = i11;
        return this;
    }

    public c u(boolean z11) {
        this.f124206m = z11 ? 1 : 0;
        return this;
    }

    public c v(int i11) {
        this.f124209p = i11;
        return this;
    }

    public void w(String[] strArr) {
        this.f124196c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f124194a = str;
    }

    public void y(String str) {
        this.f124195b = str;
    }

    public void z(String str) {
        this.f124197d = str;
    }
}
