package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import b.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b.b f2542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ComponentName f2543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f2544c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends a.AbstractBinderC0215a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f2545a = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.browser.customtabs.c f2546b;

        /* JADX INFO: renamed from: androidx.browser.customtabs.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class RunnableC0050a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f2548a;

            RunnableC0050a(Bundle bundle) {
                this.f2548a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f2546b.j(this.f2548a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f2550a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f2551b;

            b(int i11, Bundle bundle) {
                this.f2550a = i11;
                this.f2551b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f2546b.g(this.f2550a, this.f2551b);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f2553a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f2554b;

            c(String str, Bundle bundle) {
                this.f2553a = str;
                this.f2554b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f2546b.a(this.f2553a, this.f2554b);
            }
        }

        /* JADX INFO: renamed from: androidx.browser.customtabs.d$a$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class RunnableC0051d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f2556a;

            RunnableC0051d(Bundle bundle) {
                this.f2556a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f2546b.e(this.f2556a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f2558a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f2559b;

            e(String str, Bundle bundle) {
                this.f2558a = str;
                this.f2559b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f2546b.h(this.f2558a, this.f2559b);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class f implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f2561a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Uri f2562b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f2563c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f2564d;

            f(int i11, Uri uri, boolean z11, Bundle bundle) {
                this.f2561a = i11;
                this.f2562b = uri;
                this.f2563c = z11;
                this.f2564d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f2546b.i(this.f2561a, this.f2562b, this.f2563c, this.f2564d);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class g implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f2566a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f2567b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f2568c;

            g(int i11, int i12, Bundle bundle) {
                this.f2566a = i11;
                this.f2567b = i12;
                this.f2568c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f2546b.d(this.f2566a, this.f2567b, this.f2568c);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class h implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f2570a;

            h(Bundle bundle) {
                this.f2570a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f2546b.k(this.f2570a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class i implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f2572a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f2573b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f2574c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f2575d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f2576e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Bundle f2577f;

            i(int i11, int i12, int i13, int i14, int i15, Bundle bundle) {
                this.f2572a = i11;
                this.f2573b = i12;
                this.f2574c = i13;
                this.f2575d = i14;
                this.f2576e = i15;
                this.f2577f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f2546b.c(this.f2572a, this.f2573b, this.f2574c, this.f2575d, this.f2576e, this.f2577f);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class j implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f2579a;

            j(Bundle bundle) {
                this.f2579a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f2546b.f(this.f2579a);
            }
        }

        a(androidx.browser.customtabs.c cVar) {
            this.f2546b = cVar;
        }

        @Override // b.a
        public Bundle C1(String str, Bundle bundle) {
            androidx.browser.customtabs.c cVar = this.f2546b;
            if (cVar == null) {
                return null;
            }
            return cVar.b(str, bundle);
        }

        @Override // b.a
        public void C5(Bundle bundle) {
            if (this.f2546b == null) {
                return;
            }
            this.f2545a.post(new j(bundle));
        }

        @Override // b.a
        public void H5(Bundle bundle) {
            if (this.f2546b == null) {
                return;
            }
            this.f2545a.post(new RunnableC0050a(bundle));
        }

        @Override // b.a
        public void Q2(String str, Bundle bundle) {
            if (this.f2546b == null) {
                return;
            }
            this.f2545a.post(new c(str, bundle));
        }

        @Override // b.a
        public void Q5(int i11, int i12, Bundle bundle) {
            if (this.f2546b == null) {
                return;
            }
            this.f2545a.post(new g(i11, i12, bundle));
        }

        @Override // b.a
        public void T6(String str, Bundle bundle) {
            if (this.f2546b == null) {
                return;
            }
            this.f2545a.post(new e(str, bundle));
        }

        @Override // b.a
        public void Y6(Bundle bundle) {
            if (this.f2546b == null) {
                return;
            }
            this.f2545a.post(new RunnableC0051d(bundle));
        }

        @Override // b.a
        public void a7(int i11, Uri uri, boolean z11, Bundle bundle) {
            if (this.f2546b == null) {
                return;
            }
            this.f2545a.post(new f(i11, uri, z11, bundle));
        }

        @Override // b.a
        public void c1(int i11, int i12, int i13, int i14, int i15, Bundle bundle) {
            if (this.f2546b == null) {
                return;
            }
            this.f2545a.post(new i(i11, i12, i13, i14, i15, bundle));
        }

        @Override // b.a
        public void d3(Bundle bundle) {
            if (this.f2546b == null) {
                return;
            }
            this.f2545a.post(new h(bundle));
        }

        @Override // b.a
        public void x6(int i11, Bundle bundle) {
            if (this.f2546b == null) {
                return;
            }
            this.f2545a.post(new b(i11, bundle));
        }
    }

    d(b.b bVar, ComponentName componentName, Context context) {
        this.f2542a = bVar;
        this.f2543b = componentName;
        this.f2544c = context;
    }

    public static boolean a(Context context, String str, g gVar) {
        gVar.b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, gVar, 33);
    }

    private a.AbstractBinderC0215a b(c cVar) {
        return new a(cVar);
    }

    public static String c(Context context, List list) {
        return d(context, list, false);
    }

    public static String d(Context context, List list, boolean z11) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z11 && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    private h f(c cVar, PendingIntent pendingIntent) {
        boolean zF5;
        a.AbstractBinderC0215a abstractBinderC0215aB = b(cVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zF5 = this.f2542a.b3(abstractBinderC0215aB, bundle);
            } else {
                zF5 = this.f2542a.F5(abstractBinderC0215aB);
            }
            if (zF5) {
                return new h(this.f2542a, abstractBinderC0215aB, this.f2543b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public h e(c cVar) {
        return f(cVar, null);
    }

    public boolean g(long j11) {
        try {
            return this.f2542a.v5(j11);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
