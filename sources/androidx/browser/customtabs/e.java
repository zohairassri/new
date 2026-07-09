package androidx.browser.customtabs;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.browser.customtabs.b;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f2581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f2582b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class a {
        static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class b {
        static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class c {
        static void a(ActivityOptions activityOptions, boolean z11) {
            activityOptions.setShareIdentityEnabled(z11);
        }
    }

    e(Intent intent, Bundle bundle) {
        this.f2581a = intent;
        this.f2582b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f2581a.setData(uri);
        l4.a.o(context, this.f2581a, this.f2582b);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ArrayList f2585c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ActivityOptions f2586d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ArrayList f2587e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private SparseArray f2588f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Bundle f2589g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f2592j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Intent f2583a = new Intent("android.intent.action.VIEW");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b.a f2584b = new b.a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f2590h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f2591i = true;

        public d() {
        }

        private void c() {
            String strA = b.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundleExtra = this.f2583a.hasExtra("com.android.browser.headers") ? this.f2583a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", strA);
            this.f2583a.putExtra("com.android.browser.headers", bundleExtra);
        }

        private void g(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f2583a.putExtras(bundle);
        }

        private void h() {
            if (this.f2586d == null) {
                this.f2586d = a.a();
            }
            c.a(this.f2586d, this.f2592j);
        }

        public e a() {
            if (!this.f2583a.hasExtra("android.support.customtabs.extra.SESSION")) {
                g(null, null);
            }
            ArrayList<? extends Parcelable> arrayList = this.f2585c;
            if (arrayList != null) {
                this.f2583a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<? extends Parcelable> arrayList2 = this.f2587e;
            if (arrayList2 != null) {
                this.f2583a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f2583a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f2591i);
            this.f2583a.putExtras(this.f2584b.a().a());
            Bundle bundle = this.f2589g;
            if (bundle != null) {
                this.f2583a.putExtras(bundle);
            }
            if (this.f2588f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f2588f);
                this.f2583a.putExtras(bundle2);
            }
            this.f2583a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f2590h);
            int i11 = Build.VERSION.SDK_INT;
            c();
            if (i11 >= 34) {
                h();
            }
            ActivityOptions activityOptions = this.f2586d;
            return new e(this.f2583a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public d b(int i11) {
            if (i11 < 0 || i11 > 2) {
                throw new IllegalArgumentException("Invalid value for the position argument");
            }
            this.f2583a.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", i11);
            return this;
        }

        public d d(int i11) {
            return e(i11, 0);
        }

        public d e(int i11, int i12) {
            if (i11 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            if (i12 < 0 || i12 > 2) {
                throw new IllegalArgumentException("Invalid value for the activityHeightResizeBehavior argument");
            }
            this.f2583a.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i11);
            this.f2583a.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", i12);
            return this;
        }

        public d f(h hVar) {
            this.f2583a.setPackage(hVar.e().getPackageName());
            g(hVar.d(), hVar.f());
            return this;
        }

        public d i(int i11) {
            if (i11 < 0 || i11 > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.f2590h = i11;
            if (i11 == 1) {
                this.f2583a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
                return this;
            }
            if (i11 == 2) {
                this.f2583a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
                return this;
            }
            this.f2583a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            return this;
        }

        public d j(boolean z11) {
            this.f2583a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z11 ? 1 : 0);
            return this;
        }

        public d k(int i11) {
            this.f2584b.b(i11);
            return this;
        }

        public d l(boolean z11) {
            this.f2583a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", z11);
            return this;
        }

        public d(h hVar) {
            if (hVar != null) {
                f(hVar);
            }
        }
    }
}
