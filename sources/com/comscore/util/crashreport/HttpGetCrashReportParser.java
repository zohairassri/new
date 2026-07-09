package com.comscore.util.crashreport;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class HttpGetCrashReportParser implements CrashReportParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19487a = " | ";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19488b = "ns_ap_uxc";

    private String a(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            e11.printStackTrace();
            return "";
        }
    }

    private String b(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            e11.printStackTrace();
            return "";
        }
    }

    @Override // com.comscore.util.crashreport.CrashReportParser
    public String reportToString(CrashReport crashReport) {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : crashReport.getExtras().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                if (value == null) {
                    value = "";
                }
                sb2.append("&");
                sb2.append(key);
                sb2.append("=");
                sb2.append(b(value));
            }
        }
        String message = crashReport.getMessage();
        if (crashReport.getStackTrace() != null) {
            message = message + " | " + crashReport.getStackTrace();
        }
        sb2.append("&");
        sb2.append("ns_ap_uxc");
        sb2.append("=");
        sb2.append(b(message));
        return (sb2.length() <= 0 || sb2.charAt(0) != '&') ? sb2.toString() : sb2.substring(1);
    }

    @Override // com.comscore.util.crashreport.CrashReportParser
    public CrashReport stringToReport(String str) {
        String str2;
        HashMap map = new HashMap();
        for (String str3 : str.split("\\&", -1)) {
            int iIndexOf = str3.indexOf("=");
            map.put(str3.substring(0, iIndexOf), a(str3.substring(iIndexOf + 1, str3.length())));
        }
        String str4 = (String) map.get("ns_ap_uxc");
        map.remove("ns_ap_uxc");
        String str5 = "";
        if (str4 != null) {
            int iIndexOf2 = str4.indexOf(" | ");
            if (iIndexOf2 >= 0) {
                String strSubstring = str4.substring(0, iIndexOf2);
                String strSubstring2 = str4.substring(iIndexOf2 + 3, str4.length());
                str4 = strSubstring;
                str5 = strSubstring2;
            }
            String str6 = str4;
            str2 = str5;
            str5 = str6;
        } else {
            str2 = "";
        }
        return new CrashReport(str5, str2, map);
    }
}
