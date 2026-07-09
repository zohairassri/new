package com.statsig.androidsdk;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/statsig/androidsdk/ParameterStoreEvaluationOptions;", "", "disableExposureLog", "", "(Z)V", "getDisableExposureLog", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "private-android-sdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class ParameterStoreEvaluationOptions {
    private final boolean disableExposureLog;

    public ParameterStoreEvaluationOptions() {
        this(false, 1, null);
    }

    public static /* synthetic */ ParameterStoreEvaluationOptions copy$default(ParameterStoreEvaluationOptions parameterStoreEvaluationOptions, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = parameterStoreEvaluationOptions.disableExposureLog;
        }
        return parameterStoreEvaluationOptions.copy(z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getDisableExposureLog() {
        return this.disableExposureLog;
    }

    @NotNull
    public final ParameterStoreEvaluationOptions copy(boolean disableExposureLog) {
        return new ParameterStoreEvaluationOptions(disableExposureLog);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ParameterStoreEvaluationOptions) && this.disableExposureLog == ((ParameterStoreEvaluationOptions) other).disableExposureLog;
    }

    public final boolean getDisableExposureLog() {
        return this.disableExposureLog;
    }

    public int hashCode() {
        boolean z11 = this.disableExposureLog;
        if (z11) {
            return 1;
        }
        return z11 ? 1 : 0;
    }

    @NotNull
    public String toString() {
        return "ParameterStoreEvaluationOptions(disableExposureLog=" + this.disableExposureLog + ')';
    }

    public ParameterStoreEvaluationOptions(boolean z11) {
        this.disableExposureLog = z11;
    }

    public /* synthetic */ ParameterStoreEvaluationOptions(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11);
    }
}
