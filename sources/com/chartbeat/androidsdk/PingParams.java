package com.chartbeat.androidsdk;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class PingParams {
    private static final String TAG = "PingParams";
    Set<String> oneTimeKeys = new LinkedHashSet();
    PingMode pingMode = PingMode.FIRST_PING;

    PingParams() {
    }

    void addOneTimeParameter(String str) {
        this.oneTimeKeys.add(str);
    }

    boolean includeParameter(String str) {
        return this.oneTimeKeys.contains(str) || this.pingMode.includeParameter(str);
    }

    void newView() {
        this.pingMode = PingMode.FULL_PING;
    }

    void pingComplete(int i11) {
        if (i11 == 500) {
            this.pingMode = PingMode.REPEAT_PING_AFTER_CODE_500;
        } else if (i11 == 400) {
            this.pingMode = PingMode.FULL_PING;
        } else {
            this.pingMode = this.pingMode.next();
            this.oneTimeKeys.clear();
        }
    }

    void pingError() {
        this.pingMode = PingMode.FULL_PING;
    }

    void pingReset() {
        this.oneTimeKeys.clear();
        this.pingMode = PingMode.FULL_PING;
    }
}
