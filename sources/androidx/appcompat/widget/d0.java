package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class d0 extends ContextWrapper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f2367c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ArrayList f2368d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f2369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources.Theme f2370b;

    private d0(Context context) {
        super(context);
        if (!m0.c()) {
            this.f2369a = new f0(this, context.getResources());
            this.f2370b = null;
            return;
        }
        m0 m0Var = new m0(this, context.getResources());
        this.f2369a = m0Var;
        Resources.Theme themeNewTheme = m0Var.newTheme();
        this.f2370b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        return ((context instanceof d0) || (context.getResources() instanceof f0) || (context.getResources() instanceof m0) || !m0.c()) ? false : true;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f2367c) {
            try {
                ArrayList arrayList = f2368d;
                if (arrayList == null) {
                    f2368d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f2368d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f2368d.remove(size);
                        }
                    }
                    for (int size2 = f2368d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f2368d.get(size2);
                        d0 d0Var = weakReference2 != null ? (d0) weakReference2.get() : null;
                        if (d0Var != null && d0Var.getBaseContext() == context) {
                            return d0Var;
                        }
                    }
                }
                d0 d0Var2 = new d0(context);
                f2368d.add(new WeakReference(d0Var2));
                return d0Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f2369a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f2369a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f2370b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i11) {
        Resources.Theme theme = this.f2370b;
        if (theme == null) {
            super.setTheme(i11);
        } else {
            theme.applyStyle(i11, true);
        }
    }
}
