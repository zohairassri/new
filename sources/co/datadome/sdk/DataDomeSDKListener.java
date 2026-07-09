package co.datadome.sdk;

import androidx.annotation.Keep;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Keep
public abstract class DataDomeSDKListener implements o {
    @Override // co.datadome.sdk.o
    public abstract /* synthetic */ void onError(int i11, String str);

    @Override // co.datadome.sdk.o
    public void onCaptchaCancelled() {
    }

    @Override // co.datadome.sdk.o
    public void onCaptchaDismissed() {
    }

    @Override // co.datadome.sdk.o
    public void onCaptchaLoaded() {
    }

    @Override // co.datadome.sdk.o
    public void onCaptchaSuccess() {
    }

    public void willDisplayCaptcha() {
    }

    public void onHangOnRequest(int i11) {
    }

    @we0.e
    public void onDataDomeResponse(int i11, String str) {
    }
}
