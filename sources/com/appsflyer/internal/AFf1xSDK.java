package com.appsflyer.internal;

import java.util.TimerTask;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class AFf1xSDK extends TimerTask {
    private final Thread getMediationNetwork;

    public AFf1xSDK(Thread thread) {
        this.getMediationNetwork = thread;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.getMediationNetwork.interrupt();
    }
}
