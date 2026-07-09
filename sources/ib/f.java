package ib;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import ib.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConnectivityManager f103538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d.a f103539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f103540c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            f.this.d(network, true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            f.this.d(network, false);
        }
    }

    public f(ConnectivityManager connectivityManager, d.a aVar) {
        this.f103538a = connectivityManager;
        this.f103539b = aVar;
        a aVar2 = new a();
        this.f103540c = aVar2;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), aVar2);
    }

    private final boolean c(Network network) {
        NetworkCapabilities networkCapabilities = this.f103538a.getNetworkCapabilities(network);
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Network network, boolean z11) {
        Network[] allNetworks = this.f103538a.getAllNetworks();
        int length = allNetworks.length;
        boolean z12 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            Network network2 = allNetworks[i11];
            if (Intrinsics.areEqual(network2, network) ? z11 : c(network2)) {
                z12 = true;
                break;
            }
            i11++;
        }
        this.f103539b.a(z12);
    }

    @Override // ib.d
    public boolean a() {
        for (Network network : this.f103538a.getAllNetworks()) {
            if (c(network)) {
                return true;
            }
        }
        return false;
    }

    @Override // ib.d
    public void shutdown() {
        this.f103538a.unregisterNetworkCallback(this.f103540c);
    }
}
