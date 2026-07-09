package com.nytimes.android.performancetrackerclient.monitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\tJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/nytimes/android/performancetrackerclient/monitor/BatteryMonitor;", "", "Landroid/content/BroadcastReceiver;", "Landroid/content/Intent;", "batteryStatusIntent", "", QueryKeys.PAGE_LOAD_TIME, "(Landroid/content/Intent;)Z", "", "a", "(Landroid/content/Intent;)F", "Landroid/content/Context;", "context", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "(Landroid/content/Intent;)V", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs", "Ljava/lang/Float;", "launchBatteryPct", "performance-tracker-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBatteryMonitor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BatteryMonitor.kt\ncom/nytimes/android/performancetrackerclient/monitor/BatteryMonitor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,105:1\n1#2:106\n40#3,13:107\n*S KotlinDebug\n*F\n+ 1 BatteryMonitor.kt\ncom/nytimes/android/performancetrackerclient/monitor/BatteryMonitor\n*L\n58#1:107,13\n*E\n"})
public final class BatteryMonitor extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences prefs;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Float launchBatteryPct;

    private final float a(Intent batteryStatusIntent) {
        int intExtra = batteryStatusIntent.getIntExtra("level", -1);
        int intExtra2 = batteryStatusIntent.getIntExtra("scale", -1);
        if (intExtra2 == 0) {
            return -1.0f;
        }
        return (intExtra * 100) / intExtra2;
    }

    private final boolean b(Intent batteryStatusIntent) {
        int intExtra = batteryStatusIntent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    public final void c(Intent batteryStatusIntent) {
        Intrinsics.checkNotNullParameter(batteryStatusIntent, "batteryStatusIntent");
        boolean zB = b(batteryStatusIntent);
        float fA = a(batteryStatusIntent);
        if (this.launchBatteryPct == null) {
            this.launchBatteryPct = Float.valueOf(fA);
        }
        SharedPreferences.Editor editorEdit = this.prefs.edit();
        editorEdit.putBoolean("PerfBatteryIsCharging", zB);
        editorEdit.putFloat("PerfBatteryLastKnownPercent", fA);
        editorEdit.apply();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            c(intent);
        }
    }
}
