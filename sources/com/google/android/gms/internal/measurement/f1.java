package com.google.android.gms.internal.measurement;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class f1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Method f40315b = e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Method f40316c = d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JobScheduler f40317a;

    private f1(JobScheduler jobScheduler) {
        this.f40317a = jobScheduler;
    }

    private static int a() {
        Method method = f40316c;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(UserHandle.class, null);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException e11) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e11);
                }
            }
        }
        return 0;
    }

    private final int b(JobInfo jobInfo, String str, int i11, String str2) {
        Method method = f40315b;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(this.f40317a, jobInfo, str, Integer.valueOf(i11), str2);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException e11) {
                Log.e(str2, "error calling scheduleAsPackage", e11);
            }
        }
        return this.f40317a.schedule(jobInfo);
    }

    public static int c(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) zo.o.k((JobScheduler) context.getSystemService("jobscheduler"));
        return (f40315b == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) ? jobScheduler.schedule(jobInfo) : new f1(jobScheduler).b(jobInfo, str, a(), str2);
    }

    private static Method d() {
        try {
            return UserHandle.class.getDeclaredMethod("myUserId", null);
        } catch (NoSuchMethodException unused) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
            }
            return null;
        }
    }

    private static Method e() {
        try {
            return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            if (!Log.isLoggable("JobSchedulerCompat", 6)) {
                return null;
            }
            Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            return null;
        }
    }
}
