package com.theathletic.drawable;

import android.os.Handler;
import android.os.Looper;
import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/theathletic/extension/j;", "", "<init>", "()V", "Landroid/os/Handler;", QueryKeys.PAGE_LOAD_TIME, "Landroid/os/Handler;", "a", "()Landroid/os/Handler;", "handler", "Ljava/lang/Thread;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "Ljava/lang/Thread;", "()Ljava/lang/Thread;", "mainThread", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f57061a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Handler handler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Thread mainThread;

    static {
        Thread thread = Looper.getMainLooper().getThread();
        Intrinsics.checkNotNullExpressionValue(thread, "getThread(...)");
        mainThread = thread;
    }

    private j() {
    }

    public final Handler a() {
        return handler;
    }

    public final Thread b() {
        return mainThread;
    }
}
