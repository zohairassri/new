package io.embrace.android.embracesdk.internal.config.remote;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B+\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u0010"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/remote/AppExitInfoConfig;", "", "", "appExitInfoTracesLimit", "", "pctAeiCaptureEnabled", "aeiMaxNum", "<init>", "(Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;)V", "a", "Ljava/lang/Integer;", QueryKeys.PAGE_LOAD_TIME, "()Ljava/lang/Integer;", "Ljava/lang/Float;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "()Ljava/lang/Float;", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AppExitInfoConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Integer appExitInfoTracesLimit;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Float pctAeiCaptureEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Integer aeiMaxNum;

    public AppExitInfoConfig(@g(name = "app_exit_info_traces_limit") Integer num, @g(name = "pct_aei_enabled_v2") Float f11, @g(name = "aei_max_num") Integer num2) {
        this.appExitInfoTracesLimit = num;
        this.pctAeiCaptureEnabled = f11;
        this.aeiMaxNum = num2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getAeiMaxNum() {
        return this.aeiMaxNum;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getAppExitInfoTracesLimit() {
        return this.appExitInfoTracesLimit;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Float getPctAeiCaptureEnabled() {
        return this.pctAeiCaptureEnabled;
    }

    public /* synthetic */ AppExitInfoConfig(Integer num, Float f11, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : f11, (i11 & 4) != 0 ? null : num2);
    }
}
