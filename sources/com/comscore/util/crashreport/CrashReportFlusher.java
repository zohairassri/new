package com.comscore.util.crashreport;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface CrashReportFlusher {
    boolean flush(String str, CrashReportParser crashReportParser, CrashReport crashReport);
}
