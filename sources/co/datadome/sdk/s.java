package co.datadome.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Map f18111f = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f18112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f18113b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f18114c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f18115d = Executors.newScheduledThreadPool(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ExecutorService f18116e = Executors.newSingleThreadExecutor();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (s.this.f18114c.isEmpty() || !s.this.f18114c.equals(s.this.f18113b)) {
                s.this.o();
            }
        }
    }

    s(Context context) {
        this.f18112a = c(context);
        n();
    }

    private SharedPreferences c(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static synchronized s d(Context context, String str) {
        try {
            if (!f18111f.containsKey(str)) {
                f18111f.put(str, new s(context));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (s) f18111f.get(str);
    }

    private String j() {
        String str = "";
        try {
            str = (String) this.f18116e.submit(new Callable() { // from class: co.datadome.sdk.r
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f18110a.l();
                }
            }).get();
        } catch (InterruptedException e11) {
            e = e11;
            e.printStackTrace();
        } catch (ExecutionException e12) {
            e = e12;
            if (e.getMessage() != null && e.getMessage().contains("java.lang.ClassCastException")) {
                return "";
            }
            e.printStackTrace();
        }
        p.a("Retrieve cookie from disk: " + str);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String l() {
        return this.f18112a.getString("PREF_COOKIES", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        try {
            this.f18112a.edit().putString("PREF_COOKIES", this.f18113b).apply();
            p.a("Store cookie on disk: " + this.f18113b);
            this.f18114c = this.f18113b;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    private void n() {
        this.f18115d.scheduleWithFixedDelay(new a(), 1L, 1L, TimeUnit.MINUTES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.f18113b.isEmpty()) {
            return;
        }
        this.f18116e.execute(new Runnable() { // from class: co.datadome.sdk.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f18109a.m();
            }
        });
    }

    protected void f() {
        this.f18112a.edit().remove("PREF_COOKIES").apply();
        this.f18113b = "";
    }

    public void g(String str) {
        if (DataDomeUtils.isValidCookie(str).booleanValue()) {
            this.f18113b = str;
            p.a("Store cookie: " + this.f18113b);
        }
    }

    public String h() {
        if (DataDomeUtils.isNullOrEmpty(this.f18113b).booleanValue()) {
            this.f18113b = j();
        }
        p.a("Retrieve cookie: " + this.f18113b);
        return this.f18113b;
    }
}
