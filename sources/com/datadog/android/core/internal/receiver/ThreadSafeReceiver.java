package com.datadog.android.core.internal.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.chartbeat.androidsdk.QueryKeys;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000 \u00132\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/datadog/android/core/internal/receiver/ThreadSafeReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/IntentFilter;", "filter", "Landroid/content/Intent;", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "(Landroid/content/Context;Landroid/content/IntentFilter;)Landroid/content/Intent;", "", QueryKeys.VISIT_FREQUENCY, "(Landroid/content/Context;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRegistered", "()Ljava/util/concurrent/atomic/AtomicBoolean;", QueryKeys.PAGE_LOAD_TIME, "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public abstract class ThreadSafeReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isRegistered = new AtomicBoolean(false);

    public final Intent e(Context context, IntentFilter filter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intent intentRegisterReceiver = Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(this, filter, 4) : context.registerReceiver(this, filter, 4);
        this.isRegistered.set(true);
        return intentRegisterReceiver;
    }

    public final void f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.isRegistered.compareAndSet(true, false)) {
            context.unregisterReceiver(this);
        }
    }
}
