package com.statsig.androidsdk;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/statsig/androidsdk/ActionType;", "", "(Ljava/lang/String;I)V", "START", "END", "private-android-sdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public enum ActionType {
    START,
    END;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static ActionType[] valuesCustom() {
        ActionType[] actionTypeArrValuesCustom = values();
        return (ActionType[]) Arrays.copyOf(actionTypeArrValuesCustom, actionTypeArrValuesCustom.length);
    }
}
