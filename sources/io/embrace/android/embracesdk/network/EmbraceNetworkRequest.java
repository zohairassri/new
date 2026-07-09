package io.embrace.android.embracesdk.network;

import androidx.annotation.NonNull;
import ib0.a0;
import io.embrace.android.embracesdk.network.http.HttpMethod;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class EmbraceNetworkRequest {
    private final Long bytesReceived;
    private final Long bytesSent;

    @NonNull
    private final Long endTime;
    private final Throwable error = null;
    private final String errorMessage;
    private final String errorType;

    @NonNull
    private final HttpMethod httpMethod;
    private final a0 networkCaptureData;
    private final Integer responseCode;

    @NonNull
    private final Long startTime;
    private final String traceId;

    @NonNull
    private final String url;
    private final String w3cTraceparent;

    private EmbraceNetworkRequest(@NonNull String str, @NonNull HttpMethod httpMethod, @NonNull Long l11, @NonNull Long l12, Long l13, Long l14, Integer num, String str2, String str3, String str4, String str5, a0 a0Var) {
        this.url = str;
        this.httpMethod = httpMethod;
        this.startTime = l11;
        this.endTime = l12;
        this.bytesSent = l13;
        this.bytesReceived = l14;
        this.responseCode = num;
        this.errorType = str2;
        this.errorMessage = str3;
        this.traceId = str4;
        this.w3cTraceparent = str5;
        this.networkCaptureData = a0Var;
    }

    @NonNull
    public static EmbraceNetworkRequest fromCompletedRequest(@NonNull String str, @NonNull HttpMethod httpMethod, long j11, long j12, long j13, long j14, int i11) {
        return fromCompletedRequest(str, httpMethod, j11, j12, j13, j14, i11, null, null);
    }

    @NonNull
    public static EmbraceNetworkRequest fromIncompleteRequest(@NonNull String str, @NonNull HttpMethod httpMethod, long j11, long j12, @NonNull String str2, @NonNull String str3) {
        return fromIncompleteRequest(str, httpMethod, j11, j12, str2, str3, null);
    }

    @NonNull
    public Long getBytesIn() {
        Long l11 = this.bytesReceived;
        return Long.valueOf(l11 == null ? 0L : l11.longValue());
    }

    @NonNull
    public Long getBytesOut() {
        Long l11 = this.bytesSent;
        return Long.valueOf(l11 == null ? 0L : l11.longValue());
    }

    public Long getBytesReceived() {
        return this.bytesReceived;
    }

    public Long getBytesSent() {
        return this.bytesSent;
    }

    @NonNull
    public Long getEndTime() {
        return this.endTime;
    }

    public Throwable getError() {
        return this.error;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getErrorType() {
        return this.errorType;
    }

    @NonNull
    public String getHttpMethod() {
        HttpMethod httpMethod = this.httpMethod;
        if (httpMethod != null) {
            return httpMethod.name().toUpperCase();
        }
        return null;
    }

    public a0 getNetworkCaptureData() {
        return this.networkCaptureData;
    }

    public Integer getResponseCode() {
        return this.responseCode;
    }

    @NonNull
    public Long getStartTime() {
        return this.startTime;
    }

    public String getTraceId() {
        return this.traceId;
    }

    @NonNull
    public String getUrl() {
        return this.url;
    }

    public String getW3cTraceparent() {
        return this.w3cTraceparent;
    }

    @NonNull
    public static EmbraceNetworkRequest fromCompletedRequest(@NonNull String str, @NonNull HttpMethod httpMethod, long j11, long j12, long j13, long j14, int i11, String str2) {
        return fromCompletedRequest(str, httpMethod, j11, j12, j13, j14, i11, str2, null, null);
    }

    @NonNull
    public static EmbraceNetworkRequest fromIncompleteRequest(@NonNull String str, @NonNull HttpMethod httpMethod, long j11, long j12, @NonNull String str2, @NonNull String str3, String str4) {
        return fromIncompleteRequest(str, httpMethod, j11, j12, str2, str3, str4, null, null);
    }

    @NonNull
    public static EmbraceNetworkRequest fromCompletedRequest(@NonNull String str, @NonNull HttpMethod httpMethod, long j11, long j12, long j13, long j14, int i11, String str2, a0 a0Var) {
        return fromCompletedRequest(str, httpMethod, j11, j12, j13, j14, i11, str2, null, a0Var);
    }

    @NonNull
    public static EmbraceNetworkRequest fromIncompleteRequest(@NonNull String str, @NonNull HttpMethod httpMethod, long j11, long j12, @NonNull String str2, @NonNull String str3, String str4, a0 a0Var) {
        return new EmbraceNetworkRequest(str, httpMethod, Long.valueOf(j11), Long.valueOf(j12), null, null, null, str2, str3, str4, null, a0Var);
    }

    @NonNull
    public static EmbraceNetworkRequest fromCompletedRequest(@NonNull String str, @NonNull HttpMethod httpMethod, long j11, long j12, long j13, long j14, int i11, String str2, String str3, a0 a0Var) {
        return new EmbraceNetworkRequest(str, httpMethod, Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(j13), Long.valueOf(j14), Integer.valueOf(i11), null, null, str2, str3, a0Var);
    }

    @NonNull
    public static EmbraceNetworkRequest fromIncompleteRequest(@NonNull String str, @NonNull HttpMethod httpMethod, long j11, long j12, @NonNull String str2, @NonNull String str3, String str4, String str5, a0 a0Var) {
        return new EmbraceNetworkRequest(str, httpMethod, Long.valueOf(j11), Long.valueOf(j12), null, null, null, str2, str3, str4, str5, a0Var);
    }
}
