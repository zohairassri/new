package bm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.internal.ads.oz;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class g1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f14817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f14818e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f14816c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f14815b = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BroadcastReceiver f14814a = new f1(this);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final synchronized void d(Context context, Intent intent) {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : this.f14815b.entrySet()) {
                if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                    arrayList.add((BroadcastReceiver) entry.getKey());
                }
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((BroadcastReceiver) arrayList.get(i11)).onReceive(context, intent);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a(Context context) {
        try {
            if (this.f14816c) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.f14818e = applicationContext;
            if (applicationContext == null) {
                this.f14818e = context;
            }
            oz.a(this.f14818e);
            this.f14817d = ((Boolean) yl.e.c().d(oz.I4)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) yl.e.c().d(oz.f32550xc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                this.f14818e.registerReceiver(this.f14814a, intentFilter);
            } else {
                this.f14818e.registerReceiver(this.f14814a, intentFilter, 4);
            }
            this.f14816c = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f14817d) {
            this.f14815b.put(broadcastReceiver, intentFilter);
            return;
        }
        oz.a(context);
        if (!((Boolean) yl.e.c().d(oz.f32550xc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    public final synchronized void c(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f14817d) {
            this.f14815b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
