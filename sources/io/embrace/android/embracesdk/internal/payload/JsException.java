package io.embrace.android.embracesdk.internal.payload;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\f\"\u0004\b\u000f\u0010\u000eR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0013\u0010\u000e¨\u0006\u0014"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/JsException;", "", "", "name", "message", "type", "stacktrace", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "setMessage", QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.SUBDOMAIN, "setType", "setStacktrace", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class JsException {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String message;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String type;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String stacktrace;

    public JsException(@g(name = QueryKeys.IS_NEW_USER) String str, @g(name = QueryKeys.MAX_SCROLL_DEPTH) String str2, @g(name = QueryKeys.TOKEN) String str3, @g(name = "st") String str4) {
        this.name = str;
        this.message = str2;
        this.type = str3;
        this.stacktrace = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getStacktrace() {
        return this.stacktrace;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
