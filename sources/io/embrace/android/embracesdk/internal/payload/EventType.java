package io.embrace.android.embracesdk.internal.payload;

import android.annotation.SuppressLint;
import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.i;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@i(generateAdapter = false)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/EventType;", "", "", "abbreviation", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, "()Ljava/lang/String;", "START", "LATE", "INTERRUPT", "CRASH", "END", "INFO_LOG", "ERROR_LOG", "WARNING_LOG", "NETWORK_LOG", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"EmbracePublicApiPackageRule"})
public enum EventType {
    START("s"),
    LATE("l"),
    INTERRUPT(QueryKeys.VIEW_TITLE),
    CRASH(QueryKeys.TIME_ON_VIEW_IN_MINUTES),
    END(QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING),
    INFO_LOG("il"),
    ERROR_LOG("el"),
    WARNING_LOG("wl"),
    NETWORK_LOG(QueryKeys.IS_NEW_USER);


    @NotNull
    private final String abbreviation;

    EventType(String str) {
        this.abbreviation = str;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAbbreviation() {
        return this.abbreviation;
    }
}
