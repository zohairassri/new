package io.embrace.android.embracesdk.internal.config.remote;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/remote/AllowedNdkSampleMethod;", "", "", "clz", "method", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AllowedNdkSampleMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String clz;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String method;

    public AllowedNdkSampleMethod(@g(name = QueryKeys.TIME_ON_VIEW_IN_MINUTES) String str, @g(name = QueryKeys.MAX_SCROLL_DEPTH) String str2) {
        this.clz = str;
        this.method = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getClz() {
        return this.clz;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    public /* synthetic */ AllowedNdkSampleMethod(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
