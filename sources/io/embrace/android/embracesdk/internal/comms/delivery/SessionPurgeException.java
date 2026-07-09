package io.embrace.android.embracesdk.internal.comms.delivery;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/embrace/android/embracesdk/internal/comms/delivery/SessionPurgeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "embrace-android-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SessionPurgeException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionPurgeException(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
