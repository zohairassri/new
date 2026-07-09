package com.amazonaws.logging;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class AndroidLog implements Log {
    private final String tag;

    public AndroidLog(String str) {
        this.tag = str;
    }

    @Override // com.amazonaws.logging.Log
    public void debug(Object obj) {
        obj.toString();
    }

    @Override // com.amazonaws.logging.Log
    public void error(Object obj) {
        android.util.Log.e(this.tag, obj.toString());
    }

    @Override // com.amazonaws.logging.Log
    public void info(Object obj) {
        android.util.Log.i(this.tag, obj.toString());
    }

    @Override // com.amazonaws.logging.Log
    public boolean isDebugEnabled() {
        return android.util.Log.isLoggable(this.tag, 3);
    }

    @Override // com.amazonaws.logging.Log
    public boolean isErrorEnabled() {
        return android.util.Log.isLoggable(this.tag, 6);
    }

    @Override // com.amazonaws.logging.Log
    public boolean isInfoEnabled() {
        return android.util.Log.isLoggable(this.tag, 4);
    }

    @Override // com.amazonaws.logging.Log
    public boolean isTraceEnabled() {
        return android.util.Log.isLoggable(this.tag, 2);
    }

    @Override // com.amazonaws.logging.Log
    public boolean isWarnEnabled() {
        return android.util.Log.isLoggable(this.tag, 5);
    }

    @Override // com.amazonaws.logging.Log
    public void trace(Object obj) {
        obj.toString();
    }

    @Override // com.amazonaws.logging.Log
    public void warn(Object obj) {
        android.util.Log.w(this.tag, obj.toString());
    }

    @Override // com.amazonaws.logging.Log
    public void debug(Object obj, Throwable th2) {
        obj.toString();
    }

    @Override // com.amazonaws.logging.Log
    public void error(Object obj, Throwable th2) {
        android.util.Log.e(this.tag, obj.toString(), th2);
    }

    @Override // com.amazonaws.logging.Log
    public void info(Object obj, Throwable th2) {
        android.util.Log.i(this.tag, obj.toString(), th2);
    }

    @Override // com.amazonaws.logging.Log
    public void trace(Object obj, Throwable th2) {
        obj.toString();
    }

    @Override // com.amazonaws.logging.Log
    public void warn(Object obj, Throwable th2) {
        android.util.Log.w(this.tag, obj.toString(), th2);
    }
}
