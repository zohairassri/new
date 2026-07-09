package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class m0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static m0 f46648e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46649a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f46650b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f46651c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Queue f46652d = new ArrayDeque();

    private m0() {
    }

    private int a(Context context, Intent intent) {
        String strF = f(context, intent);
        if (strF != null) {
            Log.isLoggable("FirebaseMessaging", 3);
            intent.setClassName(context.getPackageName(), strF);
        }
        try {
            if ((e(context) ? x0.g(context, intent) : context.startService(intent)) != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return Constants.NO_SUCH_BUCKET_STATUS_CODE;
        } catch (IllegalStateException e11) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e11);
            return 402;
        } catch (SecurityException e12) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e12);
            return 401;
        }
    }

    static synchronized m0 b() {
        try {
            if (f46648e == null) {
                f46648e = new m0();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f46648e;
    }

    private synchronized String f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        try {
            String str2 = this.f46649a;
            if (str2 != null) {
                return str2;
            }
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(InstructionFileId.DOT)) {
                        this.f46649a = context.getPackageName() + serviceInfo.name;
                    } else {
                        this.f46649a = serviceInfo.name;
                    }
                    return this.f46649a;
                }
                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                return null;
            }
            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    Intent c() {
        return (Intent) this.f46652d.poll();
    }

    boolean d(Context context) {
        if (this.f46651c == null) {
            this.f46651c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f46650b.booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return this.f46651c.booleanValue();
    }

    boolean e(Context context) {
        if (this.f46650b == null) {
            this.f46650b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f46650b.booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return this.f46650b.booleanValue();
    }

    public int g(Context context, Intent intent) {
        Log.isLoggable("FirebaseMessaging", 3);
        this.f46652d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
