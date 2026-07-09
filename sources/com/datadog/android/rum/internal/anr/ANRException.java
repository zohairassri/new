package com.datadog.android.rum.internal.anr;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/datadog/android/rum/internal/anr/ANRException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "thread", "Ljava/lang/Thread;", "(Ljava/lang/Thread;)V", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class ANRException extends Exception {
    public ANRException(Thread thread) {
        Intrinsics.checkNotNullParameter(thread, "thread");
        setStackTrace(thread.getStackTrace());
    }
}
