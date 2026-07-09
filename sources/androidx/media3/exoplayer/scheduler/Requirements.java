package androidx.media3.exoplayer.scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10139a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Requirements createFromParcel(Parcel parcel) {
            return new Requirements(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Requirements[] newArray(int i11) {
            return new Requirements[i11];
        }
    }

    public Requirements(int i11) {
        this.f10139a = (i11 & 2) != 0 ? i11 | 1 : i11;
    }

    private int a(Context context) {
        if (!i()) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) k6.a.e(context.getSystemService("connectivity"));
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return (activeNetworkInfo != null && activeNetworkInfo.isConnected() && h(connectivityManager)) ? (l() && connectivityManager.isActiveNetworkMetered()) ? 2 : 0 : this.f10139a & 3;
    }

    private boolean d(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return false;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    private boolean f(Context context) {
        return ((PowerManager) k6.a.e(context.getSystemService("power"))).isDeviceIdleMode();
    }

    private static boolean h(ConnectivityManager connectivityManager) {
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    return true;
                }
            }
            return false;
        } catch (SecurityException unused) {
            return true;
        }
    }

    private boolean j(Context context) {
        return context.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null;
    }

    public int b(Context context) {
        int iA = a(context);
        if (c() && !d(context)) {
            iA |= 8;
        }
        if (g() && !f(context)) {
            iA |= 4;
        }
        return (!k() || j(context)) ? iA : iA | 16;
    }

    public boolean c() {
        return (this.f10139a & 8) != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Requirements.class == obj.getClass() && this.f10139a == ((Requirements) obj).f10139a;
    }

    public boolean g() {
        return (this.f10139a & 4) != 0;
    }

    public int hashCode() {
        return this.f10139a;
    }

    public boolean i() {
        return (this.f10139a & 1) != 0;
    }

    public boolean k() {
        return (this.f10139a & 16) != 0;
    }

    public boolean l() {
        return (this.f10139a & 2) != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f10139a);
    }
}
