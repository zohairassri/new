package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f2597a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b.b f2598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b.a f2599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ComponentName f2600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final PendingIntent f2601e;

    h(b.b bVar, b.a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.f2598b = bVar;
        this.f2599c = aVar;
        this.f2600d = componentName;
        this.f2601e = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f2601e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    private Bundle c(Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable("target_origin", uri);
        }
        if (this.f2601e != null) {
            a(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    IBinder d() {
        return this.f2599c.asBinder();
    }

    ComponentName e() {
        return this.f2600d;
    }

    PendingIntent f() {
        return this.f2601e;
    }

    public int g(String str, Bundle bundle) {
        int iW0;
        Bundle bundleB = b(bundle);
        synchronized (this.f2597a) {
            try {
                try {
                    iW0 = this.f2598b.W0(this.f2599c, str, bundleB);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iW0;
    }

    public boolean h(Uri uri) {
        return i(uri, null, new Bundle());
    }

    public boolean i(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle bundleC = c(uri2);
            if (bundleC == null) {
                return this.f2598b.N5(this.f2599c, uri);
            }
            bundle.putAll(bundleC);
            return this.f2598b.S0(this.f2599c, uri, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
