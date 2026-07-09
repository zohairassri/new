package com.amazonaws.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.chartbeat.androidsdk.QueryKeys;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class VersionInfoUtils {
    private static final int DEFAULT_STRING_LENGTH = 128;
    private static final Log log = LogFactory.getLog(VersionInfoUtils.class);
    private static volatile String platform = "android";
    private static volatile String userAgent = null;
    private static volatile String version = "2.10.1";

    public static String getPlatform() {
        return platform;
    }

    public static String getUserAgent() {
        if (userAgent == null) {
            synchronized (VersionInfoUtils.class) {
                try {
                    if (userAgent == null) {
                        initializeUserAgent();
                    }
                } finally {
                }
            }
        }
        return userAgent;
    }

    public static String getVersion() {
        return version;
    }

    private static void initializeUserAgent() {
        userAgent = userAgent();
    }

    private static String replaceSpaces(String str) {
        return str.replace(' ', '_');
    }

    static String userAgent() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("aws-sdk-");
        sb2.append(StringUtils.lowerCase(getPlatform()));
        sb2.append("/");
        sb2.append(getVersion());
        sb2.append(" ");
        sb2.append(replaceSpaces(System.getProperty("os.name")));
        sb2.append("/");
        sb2.append(replaceSpaces(System.getProperty("os.version")));
        sb2.append(" ");
        sb2.append(replaceSpaces(System.getProperty("java.vm.name")));
        sb2.append("/");
        sb2.append(replaceSpaces(System.getProperty("java.vm.version")));
        sb2.append("/");
        sb2.append(replaceSpaces(System.getProperty("java.version")));
        String property = System.getProperty("user.language");
        String property2 = System.getProperty("user.region");
        if (property != null && property2 != null) {
            sb2.append(" ");
            sb2.append(replaceSpaces(property));
            sb2.append(QueryKeys.END_MARKER);
            sb2.append(replaceSpaces(property2));
        }
        return sb2.toString();
    }
}
