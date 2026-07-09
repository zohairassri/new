package io.embrace.android.embracesdk.internal.comms.api;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.i;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@i(generateAdapter = false)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lio/embrace/android/embracesdk/internal/comms/api/Endpoint;", "", "", "path", "version", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, "()Ljava/lang/String;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "EVENTS", "LOGS", "SESSIONS", "SESSIONS_V2", "UNKNOWN", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum Endpoint {
    EVENTS("events", "v1"),
    LOGS("logs", "v2"),
    SESSIONS("sessions", "v1"),
    SESSIONS_V2("spans", "v2"),
    UNKNOWN("unknown", "v1");


    @NotNull
    private final String path;

    @NotNull
    private final String version;

    Endpoint(String str, String str2) {
        this.path = str;
        this.version = str2;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getVersion() {
        return this.version;
    }
}
