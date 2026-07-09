package io.embrace.android.embracesdk.network.http;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public enum HttpMethod {
    GET,
    HEAD,
    POST,
    PUT,
    DELETE,
    CONNECT,
    OPTIONS,
    TRACE,
    PATCH;

    public static HttpMethod fromInt(Integer num) {
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            return GET;
        }
        if (iIntValue == 2) {
            return POST;
        }
        if (iIntValue == 3) {
            return PUT;
        }
        if (iIntValue == 4) {
            return DELETE;
        }
        if (iIntValue != 5) {
            return null;
        }
        return PATCH;
    }

    public static HttpMethod fromString(String str) {
        if (str == null) {
            return null;
        }
        String upperCase = str.toUpperCase(Locale.US);
        upperCase.getClass();
        switch (upperCase) {
        }
        return null;
    }
}
