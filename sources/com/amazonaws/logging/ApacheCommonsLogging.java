package com.amazonaws.logging;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class ApacheCommonsLogging implements Log {
    private org.apache.commons.logging.Log log;
    private Class logClass;
    private String logString;

    public ApacheCommonsLogging(Class cls) {
        this.logClass = cls;
        this.log = org.apache.commons.logging.LogFactory.getLog(cls);
    }

    @Override // com.amazonaws.logging.Log
    public void debug(Object obj) {
        this.log.debug(obj);
    }

    @Override // com.amazonaws.logging.Log
    public void error(Object obj) {
        this.log.error(obj);
    }

    @Override // com.amazonaws.logging.Log
    public void info(Object obj) {
        this.log.info(obj);
    }

    @Override // com.amazonaws.logging.Log
    public boolean isDebugEnabled() {
        return this.log.isDebugEnabled();
    }

    @Override // com.amazonaws.logging.Log
    public boolean isErrorEnabled() {
        return this.log.isErrorEnabled();
    }

    @Override // com.amazonaws.logging.Log
    public boolean isInfoEnabled() {
        return this.log.isInfoEnabled();
    }

    @Override // com.amazonaws.logging.Log
    public boolean isTraceEnabled() {
        return this.log.isTraceEnabled();
    }

    @Override // com.amazonaws.logging.Log
    public boolean isWarnEnabled() {
        return this.log.isWarnEnabled();
    }

    @Override // com.amazonaws.logging.Log
    public void trace(Object obj) {
        this.log.trace(obj);
    }

    @Override // com.amazonaws.logging.Log
    public void warn(Object obj) {
        this.log.warn(obj);
    }

    @Override // com.amazonaws.logging.Log
    public void debug(Object obj, Throwable th2) {
        this.log.debug(obj, th2);
    }

    @Override // com.amazonaws.logging.Log
    public void error(Object obj, Throwable th2) {
        this.log.error(obj, th2);
    }

    @Override // com.amazonaws.logging.Log
    public void info(Object obj, Throwable th2) {
        this.log.info(obj, th2);
    }

    @Override // com.amazonaws.logging.Log
    public void trace(Object obj, Throwable th2) {
        this.log.trace(obj, th2);
    }

    @Override // com.amazonaws.logging.Log
    public void warn(Object obj, Throwable th2) {
        this.log.warn(obj, th2);
    }

    public ApacheCommonsLogging(String str) {
        this.logString = str;
        this.log = org.apache.commons.logging.LogFactory.getLog(str);
    }
}
