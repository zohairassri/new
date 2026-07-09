package ib0;

import io.embrace.android.embracesdk.network.EmbraceNetworkRequest;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public interface x {
    String c();

    boolean d();

    String e();

    long getSdkCurrentTime();

    boolean isNetworkSpanForwardingEnabled();

    void logInternalError(Throwable th2);

    void recordNetworkRequest(EmbraceNetworkRequest embraceNetworkRequest);

    boolean shouldCaptureNetworkBody(String str, String str2);
}
