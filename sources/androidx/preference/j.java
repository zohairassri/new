package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f11686a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SharedPreferences f11688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SharedPreferences.Editor f11689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f11690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f11691f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11692g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private PreferenceScreen f11694i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f11695j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private a f11696k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f11697l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f11687b = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f11693h = 0;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {
        void Y(Preference preference);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface b {
        void C(PreferenceScreen preferenceScreen);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface c {
        boolean a0(Preference preference);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class d {
    }

    public j(Context context) {
        this.f11686a = context;
        s(d(context));
    }

    public static SharedPreferences b(Context context) {
        return context.getSharedPreferences(d(context), c());
    }

    private static int c() {
        return 0;
    }

    private static String d(Context context) {
        return context.getPackageName() + "_preferences";
    }

    private void n(boolean z11) {
        SharedPreferences.Editor editor;
        if (!z11 && (editor = this.f11689d) != null) {
            editor.apply();
        }
        this.f11690e = z11;
    }

    public Preference a(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.f11694i;
        if (preferenceScreen == null) {
            return null;
        }
        return preferenceScreen.J0(charSequence);
    }

    SharedPreferences.Editor e() {
        if (!this.f11690e) {
            return l().edit();
        }
        if (this.f11689d == null) {
            this.f11689d = l().edit();
        }
        return this.f11689d;
    }

    long f() {
        long j11;
        synchronized (this) {
            j11 = this.f11687b;
            this.f11687b = 1 + j11;
        }
        return j11;
    }

    public b g() {
        return this.f11697l;
    }

    public c h() {
        return this.f11695j;
    }

    public d i() {
        return null;
    }

    public e j() {
        return null;
    }

    public PreferenceScreen k() {
        return this.f11694i;
    }

    public SharedPreferences l() {
        j();
        if (this.f11688c == null) {
            this.f11688c = (this.f11693h != 1 ? this.f11686a : l4.a.b(this.f11686a)).getSharedPreferences(this.f11691f, this.f11692g);
        }
        return this.f11688c;
    }

    public PreferenceScreen m(Context context, int i11, PreferenceScreen preferenceScreen) {
        n(true);
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) new i(context, this).d(i11, preferenceScreen);
        preferenceScreen2.R(this);
        n(false);
        return preferenceScreen2;
    }

    public void o(a aVar) {
        this.f11696k = aVar;
    }

    public void p(b bVar) {
        this.f11697l = bVar;
    }

    public void q(c cVar) {
        this.f11695j = cVar;
    }

    public boolean r(PreferenceScreen preferenceScreen) {
        PreferenceScreen preferenceScreen2 = this.f11694i;
        if (preferenceScreen == preferenceScreen2) {
            return false;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.W();
        }
        this.f11694i = preferenceScreen;
        return true;
    }

    public void s(String str) {
        this.f11691f = str;
        this.f11688c = null;
    }

    boolean t() {
        return !this.f11690e;
    }

    public void u(Preference preference) {
        a aVar = this.f11696k;
        if (aVar != null) {
            aVar.Y(preference);
        }
    }
}
