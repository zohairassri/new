package com.amazonaws.util;

import com.amazonaws.logging.LogFactory;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public enum Throwables {
    ;

    private static final int MAX_RETRY = 1000;

    public static Throwable getRootCause(Throwable th2) {
        if (th2 == null) {
            return th2;
        }
        int i11 = 0;
        Throwable th3 = th2;
        while (i11 < 1000) {
            Throwable cause = th3.getCause();
            if (cause == null) {
                return th3;
            }
            i11++;
            th3 = cause;
        }
        LogFactory.getLog(Throwables.class).debug("Possible circular reference detected on " + th2.getClass() + ": [" + th2 + "]");
        return th2;
    }
}
