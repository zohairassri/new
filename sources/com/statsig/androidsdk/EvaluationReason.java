package com.statsig.androidsdk;

import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/statsig/androidsdk/EvaluationReason;", "", "(Ljava/lang/String;I)V", "toString", "", "Network", "Cache", "Sticky", "LocalOverride", "Unrecognized", "Uninitialized", "Bootstrap", "OnDeviceEvalAdapterBootstrapRecognized", "OnDeviceEvalAdapterBootstrapUnrecognized", "InvalidBootstrap", "NetworkNotModified", "Error", "private-android-sdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public enum EvaluationReason {
    Network,
    Cache,
    Sticky,
    LocalOverride,
    Unrecognized,
    Uninitialized,
    Bootstrap,
    OnDeviceEvalAdapterBootstrapRecognized,
    OnDeviceEvalAdapterBootstrapUnrecognized,
    InvalidBootstrap,
    NetworkNotModified,
    Error;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EvaluationReason.valuesCustom().length];
            iArr[EvaluationReason.OnDeviceEvalAdapterBootstrapRecognized.ordinal()] = 1;
            iArr[EvaluationReason.OnDeviceEvalAdapterBootstrapUnrecognized.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EvaluationReason[] valuesCustom() {
        EvaluationReason[] evaluationReasonArrValuesCustom = values();
        return (EvaluationReason[]) Arrays.copyOf(evaluationReasonArrValuesCustom, evaluationReasonArrValuesCustom.length);
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        return i11 != 1 ? i11 != 2 ? name() : "[OnDevice]Bootstrap:Unrecognized" : "[OnDevice]Bootstrap:Recognized";
    }
}
