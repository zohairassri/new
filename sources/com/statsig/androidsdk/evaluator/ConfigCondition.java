package com.statsig.androidsdk.evaluator;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/statsig/androidsdk/evaluator/ConfigCondition;", "", "(Ljava/lang/String;I)V", "PUBLIC", "FAIL_GATE", "PASS_GATE", "IP_BASED", "UA_BASED", "USER_FIELD", "CURRENT_TIME", "ENVIRONMENT_FIELD", "USER_BUCKET", "UNIT_ID", "private-android-sdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public enum ConfigCondition {
    PUBLIC,
    FAIL_GATE,
    PASS_GATE,
    IP_BASED,
    UA_BASED,
    USER_FIELD,
    CURRENT_TIME,
    ENVIRONMENT_FIELD,
    USER_BUCKET,
    UNIT_ID;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static ConfigCondition[] valuesCustom() {
        ConfigCondition[] configConditionArrValuesCustom = values();
        return (ConfigCondition[]) Arrays.copyOf(configConditionArrValuesCustom, configConditionArrValuesCustom.length);
    }
}
