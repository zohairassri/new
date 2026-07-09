package ql;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzr;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f122812i = new e(320, 50, "320x50_mb");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f122813j = new e(468, 60, "468x60_as");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f122814k = new e(320, 100, "320x100_as");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e f122815l = new e(728, 90, "728x90_as");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e f122816m = new e(300, 250, "300x250_as");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final e f122817n = new e(160, 600, "160x600_as");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final e f122818o = new e(-1, -2, "smart_banner");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final e f122819p = new e(-3, -4, "fluid");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final e f122820q = new e(0, 0, "invalid");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e f122821r = new e(50, 50, "50x50_mb");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f122822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f122823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f122824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f122825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f122826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f122827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f122828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f122829h;

    static {
        new e(-3, 0, "search_v2");
    }

    public e(int i11, int i12) {
        String strValueOf = i11 == -1 ? "FULL" : String.valueOf(i11);
        String strValueOf2 = i12 == -2 ? "AUTO" : String.valueOf(i12);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(strValueOf2).length() + 3);
        sb2.append(strValueOf);
        sb2.append("x");
        sb2.append(strValueOf2);
        sb2.append("_as");
        this(i11, i12, sb2.toString());
    }

    public int a() {
        return this.f122823b;
    }

    public int b(Context context) {
        int i11 = this.f122823b;
        if (i11 == -4 || i11 == -3) {
            return -1;
        }
        if (i11 == -2) {
            return zzr.j(context.getResources().getDisplayMetrics());
        }
        yl.c.a();
        return cm.f.c(context, i11);
    }

    public int c() {
        return this.f122822a;
    }

    public int d(Context context) {
        int i11 = this.f122822a;
        if (i11 == -3) {
            return -1;
        }
        if (i11 != -1) {
            yl.c.a();
            return cm.f.c(context, i11);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<zzr> creator = zzr.CREATOR;
        return displayMetrics.widthPixels;
    }

    public boolean e() {
        return this.f122822a == -3 && this.f122823b == -4;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f122822a == eVar.f122822a && this.f122823b == eVar.f122823b && this.f122824c.equals(eVar.f122824c);
    }

    final boolean f() {
        return this.f122825d;
    }

    final boolean g() {
        return this.f122826e;
    }

    final void h(boolean z11) {
        this.f122826e = true;
    }

    public int hashCode() {
        return this.f122824c.hashCode();
    }

    final void i(int i11) {
        this.f122827f = i11;
    }

    final int j() {
        return this.f122827f;
    }

    final boolean k() {
        return this.f122828g;
    }

    final void l(boolean z11) {
        this.f122828g = true;
    }

    final int m() {
        return this.f122829h;
    }

    final void n(int i11) {
        this.f122829h = i11;
    }

    public String toString() {
        return this.f122824c;
    }

    e(int i11, int i12, String str) {
        if (i11 < 0 && i11 != -1 && i11 != -3) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 26);
            sb2.append("Invalid width for AdSize: ");
            sb2.append(i11);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i12 < 0 && i12 != -2 && i12 != -4) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i12).length() + 27);
            sb3.append("Invalid height for AdSize: ");
            sb3.append(i12);
            throw new IllegalArgumentException(sb3.toString());
        }
        this.f122822a = i11;
        this.f122823b = i12;
        this.f122824c = str;
    }
}
