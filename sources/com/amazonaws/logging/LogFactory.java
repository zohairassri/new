package com.amazonaws.logging;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class LogFactory {
    private static final String APACHE_COMMONS_LOGGING_LOGFACTORY = "org.apache.commons.logging.LogFactory";
    private static final String TAG = "LogFactory";
    private static Map<String, Log> logMap = new HashMap();

    private static boolean checkApacheCommonsLoggingExists() {
        try {
            Class.forName(APACHE_COMMONS_LOGGING_LOGFACTORY);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Exception e11) {
            android.util.Log.e(TAG, e11.getMessage());
            return false;
        }
    }

    public static synchronized Log getLog(Class cls) {
        return getLog(cls.getSimpleName());
    }

    public static synchronized Log getLog(String str) {
        Log androidLog;
        Log apacheCommonsLogging;
        Exception e11;
        androidLog = logMap.get(str);
        if (androidLog == null) {
            if (checkApacheCommonsLoggingExists()) {
                try {
                    apacheCommonsLogging = new ApacheCommonsLogging(str);
                } catch (Exception e12) {
                    apacheCommonsLogging = androidLog;
                    e11 = e12;
                }
                try {
                    logMap.put(str, apacheCommonsLogging);
                } catch (Exception e13) {
                    e11 = e13;
                    android.util.Log.w(TAG, "Could not create log from org.apache.commons.logging.LogFactory", e11);
                }
                androidLog = apacheCommonsLogging;
            }
            if (androidLog == null) {
                androidLog = new AndroidLog(str);
                logMap.put(str, androidLog);
            }
        }
        return androidLog;
    }
}
