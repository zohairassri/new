package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final long f46718a = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f46719b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static rn.a f46720c;

    private static void b(Context context) {
        if (f46720c == null) {
            rn.a aVar = new rn.a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f46720c = aVar;
            aVar.d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Intent intent) {
        synchronized (f46719b) {
            try {
                if (f46720c != null && d(intent)) {
                    f(intent, false);
                    f46720c.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    static void e(Context context, c1 c1Var, final Intent intent) {
        synchronized (f46719b) {
            try {
                b(context);
                boolean zD = d(intent);
                f(intent, true);
                if (!zD) {
                    f46720c.a(f46718a);
                }
                c1Var.c(intent).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.messaging.w0
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        x0.c(intent);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void f(Intent intent, boolean z11) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z11);
    }

    static ComponentName g(Context context, Intent intent) {
        synchronized (f46719b) {
            try {
                b(context);
                boolean zD = d(intent);
                f(intent, true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!zD) {
                    f46720c.a(f46718a);
                }
                return componentNameStartService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
