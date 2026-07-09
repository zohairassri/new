package io.embrace.android.embracesdk.internal.payload;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/NativeCrashDataError;", "", "", "number", "context", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/lang/Integer;", QueryKeys.PAGE_LOAD_TIME, "()Ljava/lang/Integer;", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NativeCrashDataError {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Integer number;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Integer context;

    public NativeCrashDataError(@g(name = QueryKeys.IS_NEW_USER) Integer num, @g(name = QueryKeys.TIME_ON_VIEW_IN_MINUTES) Integer num2) {
        this.number = num;
        this.context = num2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getNumber() {
        return this.number;
    }
}
