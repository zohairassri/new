package com.chartbeat.androidsdk;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
enum PingMode {
    FIRST_PING,
    STANDARD_PING,
    FULL_PING,
    REPEAT_PING_AFTER_CODE_500;

    private static final Set<String> MANDATORY_PARAMETERS;

    /* JADX INFO: renamed from: com.chartbeat.androidsdk.PingMode$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$chartbeat$androidsdk$PingMode;

        static {
            int[] iArr = new int[PingMode.values().length];
            $SwitchMap$com$chartbeat$androidsdk$PingMode = iArr;
            try {
                iArr[PingMode.FIRST_PING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$chartbeat$androidsdk$PingMode[PingMode.FULL_PING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$chartbeat$androidsdk$PingMode[PingMode.STANDARD_PING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$chartbeat$androidsdk$PingMode[PingMode.REPEAT_PING_AFTER_CODE_500.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        HashSet hashSet = new HashSet();
        MANDATORY_PARAMETERS = hashSet;
        hashSet.add(QueryKeys.HOST);
        hashSet.add(QueryKeys.SUBDOMAIN);
        hashSet.add(QueryKeys.VIEW_ID);
        hashSet.add(QueryKeys.TOKEN);
        hashSet.add(QueryKeys.USER_ID);
        hashSet.add(QueryKeys.ACCOUNT_ID);
        hashSet.add(QueryKeys.TIME_ON_VIEW_IN_MINUTES);
        hashSet.add(QueryKeys.DECAY);
        hashSet.add(QueryKeys.ENGAGED_SECONDS);
        hashSet.add(QueryKeys.READING);
        hashSet.add(QueryKeys.WRITING);
        hashSet.add(QueryKeys.IDLING);
        hashSet.add("x");
        hashSet.add(QueryKeys.MAX_SCROLL_DEPTH);
        hashSet.add(QueryKeys.CONTENT_HEIGHT);
        hashSet.add(QueryKeys.SCROLL_WINDOW_HEIGHT);
        hashSet.add(QueryKeys.DOCUMENT_WIDTH);
        hashSet.add(QueryKeys.SITE_VISIT_DEPTH);
        hashSet.add(QueryKeys.SITE_VISIT_REFERRER);
        hashSet.add(QueryKeys.SITE_VISIT_UID);
        hashSet.add(QueryKeys.SUBSCRIPTION_INFO);
        hashSet.add(QueryKeys.END_MARKER);
    }

    boolean includeParameter(String str) {
        int i11 = AnonymousClass1.$SwitchMap$com$chartbeat$androidsdk$PingMode[ordinal()];
        if (i11 == 1 || i11 == 2) {
            return true;
        }
        if (i11 == 3) {
            return MANDATORY_PARAMETERS.contains(str);
        }
        if (i11 == 4) {
            return !str.equals(QueryKeys.FORCE_DECAY);
        }
        throw new RuntimeException("Invalid Ping Mode.");
    }

    PingMode next() {
        int i11 = AnonymousClass1.$SwitchMap$com$chartbeat$androidsdk$PingMode[ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return STANDARD_PING;
        }
        if (i11 == 4) {
            return STANDARD_PING;
        }
        throw new RuntimeException("Invalid Ping Mode.");
    }
}
