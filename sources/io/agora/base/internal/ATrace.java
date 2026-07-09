package io.agora.base.internal;

import android.annotation.SuppressLint;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class ATrace {
    public static final boolean ENABLE_TRACE = false;
    private static final String TAG = "ATrace";
    private static final long TRACE_TAG_APP = 4096;
    public static final boolean VERBOSE_LOG = false;
    private static Method traceCounterMethod = null;
    private static boolean traceCounterMethodFailed = false;

    public static void endSection() {
    }

    public static void beginSection(String str) {
    }

    @SuppressLint({"PrivateApi"})
    public static void traceCounter(String str, int i11) {
    }
}
