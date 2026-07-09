package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class n6 implements s5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map f40591g = new t.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f40592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f40593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f40594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f40595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Map f40596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f40597f;

    private n6(SharedPreferences sharedPreferences, Runnable runnable) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.q6
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                this.f40662a.e(sharedPreferences2, str);
            }
        };
        this.f40594c = onSharedPreferenceChangeListener;
        this.f40595d = new Object();
        this.f40597f = new ArrayList();
        this.f40592a = sharedPreferences;
        this.f40593b = runnable;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    private static SharedPreferences a(Context context, String str) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!str.startsWith("direct_boot:")) {
                SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return sharedPreferences;
            }
            if (n5.a()) {
                context = context.createDeviceProtectedStorageContext();
            }
            SharedPreferences sharedPreferences2 = context.getSharedPreferences(str.substring(12), 0);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return sharedPreferences2;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th2;
        }
    }

    static n6 c(Context context, String str, Runnable runnable) {
        n6 n6Var;
        if (!((!n5.a() || str.startsWith("direct_boot:")) ? true : n5.c(context))) {
            return null;
        }
        synchronized (n6.class) {
            try {
                Map map = f40591g;
                n6Var = (n6) map.get(str);
                if (n6Var == null) {
                    n6Var = new n6(a(context, str), runnable);
                    map.put(str, n6Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return n6Var;
    }

    static synchronized void d() {
        try {
            for (n6 n6Var : f40591g.values()) {
                n6Var.f40592a.unregisterOnSharedPreferenceChangeListener(n6Var.f40594c);
            }
            f40591g.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.s5
    public final Object b(String str) {
        Map<String, ?> map = this.f40596e;
        if (map == null) {
            synchronized (this.f40595d) {
                try {
                    map = this.f40596e;
                    if (map == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.f40592a.getAll();
                            this.f40596e = all;
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = all;
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th2;
                        }
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    final /* synthetic */ void e(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f40595d) {
            this.f40596e = null;
            this.f40593b.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f40597f.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.a.a(it.next());
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
