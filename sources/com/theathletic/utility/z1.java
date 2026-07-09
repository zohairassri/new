package com.theathletic.utility;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.PowerManager;
import com.chartbeat.androidsdk.QueryKeys;
import com.comscore.android.util.jni.AndroidJniHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\f\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0017R\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0017¨\u0006 "}, d2 = {"Lcom/theathletic/utility/z1;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "a", "Landroid/content/Context;", "Landroid/content/pm/PackageInfo;", "kotlin.jvm.PlatformType", QueryKeys.PAGE_LOAD_TIME, "()Landroid/content/pm/PackageInfo;", AndroidJniHelper.KEY_PACKAGE_MANAGER, "Landroid/os/PowerManager;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "()Landroid/os/PowerManager;", "powerManager", "", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "()J", "versionCode", "", QueryKeys.VISIT_FREQUENCY, "()Ljava/lang/String;", "versionName", "deviceID", "", QueryKeys.ACCOUNT_ID, "()Z", "isPowerSaveMode", QueryKeys.SUBDOMAIN, "thermalStatus", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    public z1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final PackageInfo b() {
        return this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0);
    }

    private final PowerManager c() {
        Object systemService = this.context.getSystemService("power");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return (PowerManager) systemService;
    }

    public final String a() {
        return a2.a(this.context);
    }

    public final String d() {
        switch (c().getCurrentThermalStatus()) {
            case 0:
                return "None";
            case 1:
                return "Light";
            case 2:
                return "Moderate";
            case 3:
                return "Severe";
            case 4:
                return "Critical";
            case 5:
                return "Emergency";
            case 6:
                return "Shutdown";
            default:
                return "Unknown";
        }
    }

    public final long e() {
        return b().getLongVersionCode();
    }

    public final String f() {
        return b().versionName;
    }

    public final boolean g() {
        return c().isPowerSaveMode();
    }
}
