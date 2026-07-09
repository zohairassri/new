package co.datadome.sdk;

import android.webkit.JavascriptInterface;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class JavascriptInterfaceDataDomeListener {
    private final DataDomeJavascriptInterfaceListener mListener;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface DataDomeJavascriptInterfaceListener {
        void onAdditionalChallengeRedirection(int i11);

        void onCaptchaSuccess(String str);
    }

    JavascriptInterfaceDataDomeListener(DataDomeJavascriptInterfaceListener dataDomeJavascriptInterfaceListener) {
        this.mListener = dataDomeJavascriptInterfaceListener;
    }

    @JavascriptInterface
    public void onAdditionalChallengeRedirection(int i11) {
        DataDomeJavascriptInterfaceListener dataDomeJavascriptInterfaceListener = this.mListener;
        if (dataDomeJavascriptInterfaceListener != null) {
            dataDomeJavascriptInterfaceListener.onAdditionalChallengeRedirection(i11);
        }
    }

    @JavascriptInterface
    public void onCaptchaSuccess(String str) {
        DataDomeJavascriptInterfaceListener dataDomeJavascriptInterfaceListener = this.mListener;
        if (dataDomeJavascriptInterfaceListener != null) {
            dataDomeJavascriptInterfaceListener.onCaptchaSuccess(str);
        }
    }
}
