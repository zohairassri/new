package com.nytimes.android.hybrid.bridge;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\b\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/nytimes/android/hybrid/bridge/BridgeCommandOptionsException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "errorDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, "hybrid_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class BridgeCommandOptionsException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String message;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String errorDetails;

    public /* synthetic */ BridgeCommandOptionsException(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getErrorDetails() {
        return this.errorDetails;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public BridgeCommandOptionsException(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
        this.errorDetails = str;
    }
}
