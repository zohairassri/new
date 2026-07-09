package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class d extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Configuration f1647f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Resources.Theme f1649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LayoutInflater f1650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Configuration f1651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Resources f1652e;

    public d(Context context, int i11) {
        super(context);
        this.f1648a = i11;
    }

    private Resources b() {
        if (this.f1652e == null) {
            Configuration configuration = this.f1651d;
            if (configuration == null || e(configuration)) {
                this.f1652e = super.getResources();
            } else {
                this.f1652e = createConfigurationContext(this.f1651d).getResources();
            }
        }
        return this.f1652e;
    }

    private void d() {
        boolean z11 = this.f1649b == null;
        if (z11) {
            this.f1649b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1649b.setTo(theme);
            }
        }
        f(this.f1649b, this.f1648a, z11);
    }

    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f1647f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f1647f = configuration2;
        }
        return configuration.equals(f1647f);
    }

    public void a(Configuration configuration) {
        if (this.f1652e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f1651d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f1651d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f1648a;
    }

    protected void f(Resources.Theme theme, int i11, boolean z11) {
        theme.applyStyle(i11, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f1650c == null) {
            this.f1650c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f1650c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1649b;
        if (theme != null) {
            return theme;
        }
        if (this.f1648a == 0) {
            this.f1648a = h.i.Theme_AppCompat_Light;
        }
        d();
        return this.f1649b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i11) {
        if (this.f1648a != i11) {
            this.f1648a = i11;
            d();
        }
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f1649b = theme;
    }
}
