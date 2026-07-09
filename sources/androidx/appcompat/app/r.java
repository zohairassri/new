package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import com.theathletic.network.apollo.FetchPolicy;
import com.theathletic.pushnotification.component.data.remote.PushNotificationPromptRemoteDataStore;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static r f1604d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocationManager f1606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f1607c = new a();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f1608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f1609b;

        a() {
        }
    }

    r(Context context, LocationManager locationManager) {
        this.f1605a = context;
        this.f1606b = locationManager;
    }

    static r a(Context context) {
        if (f1604d == null) {
            Context applicationContext = context.getApplicationContext();
            f1604d = new r(applicationContext, (LocationManager) applicationContext.getSystemService(PushNotificationPromptRemoteDataStore.PARAM_LOCATION));
        }
        return f1604d;
    }

    private Location b() {
        Location locationC = l4.d.b(this.f1605a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = l4.d.b(this.f1605a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (locationC2 == null || locationC == null) ? locationC2 != null ? locationC2 : locationC : locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    private Location c(String str) {
        try {
            if (this.f1606b.isProviderEnabled(str)) {
                return this.f1606b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean e() {
        return this.f1607c.f1609b > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j11;
        a aVar = this.f1607c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        q qVarB = q.b();
        qVarB.a(jCurrentTimeMillis - FetchPolicy.ONE_DAY, location.getLatitude(), location.getLongitude());
        qVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z11 = qVarB.f1603c == 1;
        long j12 = qVarB.f1602b;
        long j13 = qVarB.f1601a;
        qVarB.a(jCurrentTimeMillis + FetchPolicy.ONE_DAY, location.getLatitude(), location.getLongitude());
        long j14 = qVarB.f1602b;
        if (j12 == -1 || j13 == -1) {
            j11 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis > j13) {
                j12 = j14;
            } else if (jCurrentTimeMillis > j12) {
                j12 = j13;
            }
            j11 = j12 + 60000;
        }
        aVar.f1608a = z11;
        aVar.f1609b = j11;
    }

    boolean d() {
        a aVar = this.f1607c;
        if (e()) {
            return aVar.f1608a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f1608a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i11 = Calendar.getInstance().get(11);
        return i11 < 6 || i11 >= 22;
    }
}
