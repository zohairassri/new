package com.appsflyer;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f18724a;

    public /* synthetic */ a(Function1 function1) {
        this.f18724a = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFLogger.getMonetizationNetwork(this.f18724a);
    }
}
