package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b.a f2602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PendingIntent f2603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f2604c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends c {
        a() {
        }

        @Override // androidx.browser.customtabs.c
        public void a(String str, Bundle bundle) {
            try {
                i.this.f2602a.Q2(str, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // androidx.browser.customtabs.c
        public Bundle b(String str, Bundle bundle) {
            try {
                return i.this.f2602a.C1(str, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                return null;
            }
        }

        @Override // androidx.browser.customtabs.c
        public void c(int i11, int i12, int i13, int i14, int i15, Bundle bundle) {
            try {
                i.this.f2602a.c1(i11, i12, i13, i14, i15, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // androidx.browser.customtabs.c
        public void d(int i11, int i12, Bundle bundle) {
            try {
                i.this.f2602a.Q5(i11, i12, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // androidx.browser.customtabs.c
        public void e(Bundle bundle) {
            try {
                i.this.f2602a.Y6(bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // androidx.browser.customtabs.c
        public void f(Bundle bundle) {
            try {
                i.this.f2602a.C5(bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // androidx.browser.customtabs.c
        public void g(int i11, Bundle bundle) {
            try {
                i.this.f2602a.x6(i11, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // androidx.browser.customtabs.c
        public void h(String str, Bundle bundle) {
            try {
                i.this.f2602a.T6(str, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // androidx.browser.customtabs.c
        public void i(int i11, Uri uri, boolean z11, Bundle bundle) {
            try {
                i.this.f2602a.a7(i11, uri, z11, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // androidx.browser.customtabs.c
        public void j(Bundle bundle) {
            try {
                i.this.f2602a.H5(bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // androidx.browser.customtabs.c
        public void k(Bundle bundle) {
            try {
                i.this.f2602a.d3(bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }
    }

    i(b.a aVar, PendingIntent pendingIntent) {
        if (aVar == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f2602a = aVar;
        this.f2603b = pendingIntent;
        this.f2604c = aVar == null ? null : new a();
    }

    private IBinder b() {
        b.a aVar = this.f2602a;
        if (aVar != null) {
            return aVar.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    IBinder a() {
        b.a aVar = this.f2602a;
        if (aVar == null) {
            return null;
        }
        return aVar.asBinder();
    }

    PendingIntent c() {
        return this.f2603b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        PendingIntent pendingIntentC = iVar.c();
        PendingIntent pendingIntent = this.f2603b;
        if ((pendingIntent == null) != (pendingIntentC == null)) {
            return false;
        }
        return pendingIntent != null ? pendingIntent.equals(pendingIntentC) : b().equals(iVar.b());
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.f2603b;
        return pendingIntent != null ? pendingIntent.hashCode() : b().hashCode();
    }
}
