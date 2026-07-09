package io.embrace.android.embracesdk.internal.config.remote;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.i;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@i(generateAdapter = false)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/remote/Unwinder;", "", "", "code", "<init>", "(Ljava/lang/String;II)V", QueryKeys.IDLING, QueryKeys.PAGE_LOAD_TIME, "()I", "LIBUNWIND", "LIBUNWINDSTACK", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum Unwinder {
    LIBUNWIND(0),
    LIBUNWINDSTACK(1);

    private final int code;

    Unwinder(int i11) {
        this.code = i11;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCode() {
        return this.code;
    }
}
