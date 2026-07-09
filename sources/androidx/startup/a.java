package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import u9.b;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f12682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f12683e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f12686c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set f12685b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f12684a = new HashMap();

    a(Context context) {
        this.f12686c = context.getApplicationContext();
    }

    private Object d(Class cls, Set set) {
        Object objCreate;
        if (w9.a.e()) {
            try {
                w9.a.b(cls.getSimpleName());
            } finally {
                w9.a.d();
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f12684a.containsKey(cls)) {
            objCreate = this.f12684a.get(cls);
        } else {
            set.add(cls);
            try {
                u9.a aVar = (u9.a) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listDependencies = aVar.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class cls2 : listDependencies) {
                        if (!this.f12684a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                objCreate = aVar.create(this.f12686c);
                set.remove(cls);
                this.f12684a.put(cls, objCreate);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        return objCreate;
    }

    public static a e(Context context) {
        if (f12682d == null) {
            synchronized (f12683e) {
                try {
                    if (f12682d == null) {
                        f12682d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f12682d;
    }

    void a(Bundle bundle) {
        String string = this.f12686c.getString(b.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (u9.a.class.isAssignableFrom(cls)) {
                            this.f12685b.add(cls);
                        }
                    }
                }
                Iterator it = this.f12685b.iterator();
                while (it.hasNext()) {
                    d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e11) {
                throw new StartupException(e11);
            }
        }
    }

    void b(Class cls) {
        try {
            try {
                w9.a.b("Startup");
                a(this.f12686c.getPackageManager().getProviderInfo(new ComponentName(this.f12686c, (Class<?>) cls), 128).metaData);
            } catch (PackageManager.NameNotFoundException e11) {
                throw new StartupException(e11);
            }
        } finally {
            w9.a.d();
        }
    }

    Object c(Class cls) {
        Object objD;
        synchronized (f12683e) {
            try {
                objD = this.f12684a.get(cls);
                if (objD == null) {
                    objD = d(cls, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return objD;
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.f12685b.contains(cls);
    }
}
