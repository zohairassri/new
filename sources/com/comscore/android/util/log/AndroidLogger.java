package com.comscore.android.util.log;

import android.util.Log;
import com.comscore.util.log.LogHelper;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class AndroidLogger implements LogHelper {
    public static final String TAG = "COMSCORE";

    @Override // com.comscore.util.log.LogHelper
    public void d(String str) {
    }

    @Override // com.comscore.util.log.LogHelper
    public void e(String str) {
        Log.e(TAG, str);
    }

    @Override // com.comscore.util.log.LogHelper
    public void i(String str) {
        Log.i(TAG, str);
    }

    @Override // com.comscore.util.log.LogHelper
    public void w(String str) {
        Log.w(TAG, str);
    }

    @Override // com.comscore.util.log.LogHelper
    public void d(String str, String str2) {
    }

    @Override // com.comscore.util.log.LogHelper
    public void e(String str, Throwable th2) {
        Log.e(TAG, str, th2);
    }

    @Override // com.comscore.util.log.LogHelper
    public void i(String str, String str2) {
        Log.i(str, str2);
    }

    @Override // com.comscore.util.log.LogHelper
    public void w(String str, String str2) {
        Log.w(str, str2);
    }

    @Override // com.comscore.util.log.LogHelper
    public void e(String str, String str2) {
        Log.e(str, str2);
    }

    @Override // com.comscore.util.log.LogHelper
    public void e(String str, String str2, Throwable th2) {
        Log.e(str, str2, th2);
    }
}
