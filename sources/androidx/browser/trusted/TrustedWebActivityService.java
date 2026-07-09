package androidx.browser.trusted;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import androidx.browser.trusted.d;
import androidx.core.app.n;
import c.b;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class TrustedWebActivityService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NotificationManager f2607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f2608b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b.a f2609c = new a();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends b.a {
        a() {
        }

        private void R() {
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            int i11 = trustedWebActivityService.f2608b;
            if (i11 != -1) {
                if (i11 != Binder.getCallingUid()) {
                    throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
                }
            } else {
                trustedWebActivityService.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                TrustedWebActivityService.this.c();
                throw null;
            }
        }

        @Override // c.b
        public Bundle A2() {
            R();
            return TrustedWebActivityService.this.h();
        }

        @Override // c.b
        public Bundle N1(String str, Bundle bundle, IBinder iBinder) {
            R();
            return TrustedWebActivityService.this.f(str, bundle, c.a(iBinder));
        }

        @Override // c.b
        public int R5() {
            R();
            return TrustedWebActivityService.this.i();
        }

        @Override // c.b
        public Bundle W5(Bundle bundle) {
            R();
            return new d.e(TrustedWebActivityService.this.d(d.c.a(bundle).f2615a)).a();
        }

        @Override // c.b
        public Bundle a3(Bundle bundle) {
            R();
            d.C0052d c0052dA = d.C0052d.a(bundle);
            return new d.e(TrustedWebActivityService.this.j(c0052dA.f2616a, c0052dA.f2617b, c0052dA.f2618c, c0052dA.f2619d)).a();
        }

        @Override // c.b
        public void l6(Bundle bundle) {
            R();
            d.b bVarA = d.b.a(bundle);
            TrustedWebActivityService.this.e(bVarA.f2613a, bVarA.f2614b);
        }

        @Override // c.b
        public Bundle x4() {
            R();
            return new d.a(TrustedWebActivityService.this.g()).a();
        }
    }

    private static String a(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    private void b() {
        if (this.f2607a == null) {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        }
    }

    public abstract r.a c();

    public boolean d(String str) {
        b();
        if (n.b(this).a()) {
            return b.b(this.f2607a, a(str));
        }
        return false;
    }

    public void e(String str, int i11) {
        b();
        this.f2607a.cancel(str, i11);
    }

    public Bundle f(String str, Bundle bundle, c cVar) {
        return null;
    }

    public Parcelable[] g() {
        b();
        return androidx.browser.trusted.a.a(this.f2607a);
    }

    public Bundle h() {
        int i11 = i();
        Bundle bundle = new Bundle();
        if (i11 == -1) {
            return bundle;
        }
        bundle.putParcelable("android.support.customtabs.trusted.SMALL_ICON_BITMAP", BitmapFactory.decodeResource(getResources(), i11));
        return bundle;
    }

    public int i() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt("android.support.customtabs.trusted.SMALL_ICON", -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    public boolean j(String str, int i11, Notification notification, String str2) {
        b();
        if (!n.b(this).a()) {
            return false;
        }
        String strA = a(str2);
        Notification notificationA = b.a(this, this.f2607a, notification, strA, str2);
        if (!b.b(this.f2607a, strA)) {
            return false;
        }
        this.f2607a.notify(str, i11, notificationA);
        return true;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f2609c;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f2607a = (NotificationManager) getSystemService("notification");
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        this.f2608b = -1;
        return super.onUnbind(intent);
    }
}
