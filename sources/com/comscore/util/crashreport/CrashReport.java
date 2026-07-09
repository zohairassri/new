package com.comscore.util.crashreport;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class CrashReport {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f19461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f19462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, String> f19463c;

    public CrashReport(String str, Throwable th2) {
        this(str, th2, (Map<String, String>) null);
    }

    private void a(Map<String, String> map) {
        this.f19463c = new LinkedHashMap();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (value == null) {
                    value = "";
                }
                this.f19463c.put(key, value);
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CrashReport)) {
            return false;
        }
        CrashReport crashReport = (CrashReport) obj;
        return crashReport.getMessage().equals(getMessage()) && crashReport.getStackTrace().equals(getStackTrace()) && crashReport.getExtras().equals(getExtras());
    }

    public Map<String, String> getExtras() {
        return this.f19463c;
    }

    public String getMessage() {
        return this.f19461a;
    }

    public String getStackTrace() {
        return this.f19462b;
    }

    public CrashReport(String str, Throwable th2, Map<String, String> map) {
        String string;
        if (th2 != null) {
            StringWriter stringWriter = new StringWriter();
            th2.printStackTrace(new PrintWriter(stringWriter));
            string = stringWriter.toString();
        } else {
            string = "";
        }
        this.f19462b = string;
        this.f19461a = str == null ? "" : str;
        a(map);
    }

    public CrashReport(String str, String str2, Map<String, String> map) {
        this.f19462b = str2 == null ? "" : str2;
        this.f19461a = str == null ? "" : str;
        a(map);
    }
}
