package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class rt3 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ tt3 f34338a;

    rt3(tt3 tt3Var) {
        Objects.requireNonNull(tt3Var);
        this.f34338a = tt3Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        tt3 tt3Var = this.f34338a;
        synchronized (tt3Var) {
            tt3Var.e(networkCapabilities);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        tt3 tt3Var = this.f34338a;
        synchronized (tt3Var) {
            tt3Var.e(null);
        }
    }
}
