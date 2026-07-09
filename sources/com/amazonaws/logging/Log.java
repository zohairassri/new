package com.amazonaws.logging;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface Log {
    void debug(Object obj);

    void debug(Object obj, Throwable th2);

    void error(Object obj);

    void error(Object obj, Throwable th2);

    void info(Object obj);

    void info(Object obj, Throwable th2);

    boolean isDebugEnabled();

    boolean isErrorEnabled();

    boolean isInfoEnabled();

    boolean isTraceEnabled();

    boolean isWarnEnabled();

    void trace(Object obj);

    void trace(Object obj, Throwable th2);

    void warn(Object obj);

    void warn(Object obj, Throwable th2);
}
