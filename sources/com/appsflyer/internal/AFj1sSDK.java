package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AFj1sSDK extends Observable {
    final Runnable AFAdRevenueData;
    long component1;
    public final String component3;
    public final String getMonetizationNetwork;
    public final Map<String, Object> getMediationNetwork = new HashMap();
    public AFa1zSDK component2 = AFa1zSDK.NOT_STARTED;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1sSDK$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    final class AnonymousClass1 implements Observer {
        AnonymousClass1() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            AFj1sSDK.this.AFAdRevenueData.run();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum AFa1zSDK {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public AFj1sSDK(String str, String str2, Runnable runnable) {
        this.AFAdRevenueData = runnable;
        this.getMonetizationNetwork = str2;
        this.component3 = str;
    }

    public abstract void getMediationNetwork(Context context);

    public final void getRevenue() {
        this.getMediationNetwork.put("source", this.getMonetizationNetwork);
        this.getMediationNetwork.put("type", this.component3);
        this.getMediationNetwork.put("latency", Long.valueOf(System.currentTimeMillis() - this.component1));
        this.component2 = AFa1zSDK.FINISHED;
        setChanged();
        notifyObservers();
    }
}
